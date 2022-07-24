package com.suscord.fightforfeast.entity.custom;

import com.suscord.fightforfeast.entity.ModEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import static com.suscord.fightforfeast.item.ModItems.MILK_CHOCOLATE;

public class Butteredghost extends Animal implements IAnimatable {
    private AnimationFactory factory = new AnimationFactory(this);

    public Butteredghost(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 8.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.2f).build();
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new PanicGoal(this, 1.25D));
        this.goalSelector.addGoal(3, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.25D));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(6, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(8, (new HurtByTargetGoal(this)).setAlertOthers());

    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob pOtherParent) {

        return ModEntityTypes.ROLLCAT.get().create(serverLevel);
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.getItem() == MILK_CHOCOLATE.get();
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.rolcat.walk", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.rolcat.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData data) {
        data.addAnimationController(new AnimationController(this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return this.factory;
    }

    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.WOOL_STEP, 0.15F, 1.0F);
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.CAT_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.CAT_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.CAT_DEATH;
    }

    protected float getSoundVolume() {
        return 0.2F;
    }

    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        return false;
    }

    //Taming
    public InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        Item item = itemstack.getItem();

        if(isFood(itemstack)) {
            return super.mobInteract(player, hand);
        }

        return super.mobInteract(player, hand);
    }

}
