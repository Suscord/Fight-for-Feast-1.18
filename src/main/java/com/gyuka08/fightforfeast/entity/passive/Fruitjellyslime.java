package com.gyuka08.fightforfeast.entity.passive;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import java.util.EnumSet;

public class Fruitjellyslime extends Slime implements IAnimatable {

    private static final AttributeModifier DOUBLE_HEALTH = new AttributeModifier("FJ slime double health", 1, AttributeModifier.Operation.MULTIPLY_BASE);

    public Fruitjellyslime(EntityType<? extends Fruitjellyslime> type, Level world) {
        super(type, world);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new Fruitjellyslime.SlimeFloatGoal(this));
        this.goalSelector.addGoal(3, new Fruitjellyslime.SlimeRandomDirectionGoal(this));
        this.goalSelector.addGoal(5, new Fruitjellyslime.SlimeKeepOnJumpingGoal(this));

    }

    @Override
    public void setSize(int size, boolean resetHealth) {
        super.setSize(size, resetHealth);
        this.xpReward += 1;
    }


    public static AttributeSupplier.Builder registerAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH);
    }

    @Nullable

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return this.isTiny() ? SoundEvents.SLIME_HURT_SMALL : SoundEvents.SLIME_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return this.isTiny() ? SoundEvents.SLIME_DEATH_SMALL : SoundEvents.SLIME_DEATH;
    }

    @Override
    protected SoundEvent getSquishSound() {
        return this.isTiny() ? SoundEvents.SLIME_SQUISH_SMALL : SoundEvents.SLIME_SQUISH_SMALL;
    }

    @Override
    protected SoundEvent getJumpSound() {
        return this.isTiny() ? SoundEvents.SLIME_SQUISH_SMALL : SoundEvents.SLIME_SQUISH;
    }

    float getSoundPitch() {
        float f = this.isTiny() ? 1.4F : 0.8F;
        return ((this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F) * f;
    }

    @Override
    public void registerControllers(AnimationData data) {

    }

    @Override
    public AnimationFactory getFactory() {
        return null;
    }

    static class SlimeKeepOnJumpingGoal extends Goal {
        private final Fruitjellyslime slime;

        public SlimeKeepOnJumpingGoal(Fruitjellyslime pSlime) {
            this.slime = pSlime;
            this.setFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canUse() {
            return !this.slime.isPassenger();
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            ((Fruitjellyslime.SlimeMoveControl)this.slime.getMoveControl()).setWantedMovement(1.0D);
        }
    }

    static class SlimeMoveControl extends MoveControl {
        private float yRot;
        private int jumpDelay;
        private final Fruitjellyslime slime;
        private boolean isAggressive;

        public SlimeMoveControl(Fruitjellyslime pSlime) {
            super(pSlime);
            this.slime = pSlime;
            this.yRot = 180.0F * pSlime.getYRot() / (float)Math.PI;
        }

        public void setDirection(float pYRot) {
            this.yRot = pYRot;
        }

        public void setWantedMovement(double pSpeed) {
            this.speedModifier = pSpeed;
            this.operation = MoveControl.Operation.MOVE_TO;
        }

        public void tick() {
            this.mob.setYRot(this.rotlerp(this.mob.getYRot(), this.yRot, 90.0F));
            this.mob.yHeadRot = this.mob.getYRot();
            this.mob.yBodyRot = this.mob.getYRot();
            if (this.operation != MoveControl.Operation.MOVE_TO) {
                this.mob.setZza(0.0F);
            } else {
                this.operation = MoveControl.Operation.WAIT;
                if (this.mob.isOnGround()) {
                    this.mob.setSpeed((float)(this.speedModifier * this.mob.getAttributeValue(Attributes.MOVEMENT_SPEED)));
                    if (this.jumpDelay-- <= 0) {
                        this.jumpDelay = this.slime.getJumpDelay();
                        if (this.isAggressive) {
                            this.jumpDelay /= 3;
                        }

                        this.slime.getJumpControl().jump();
                        if (this.slime.doPlayJumpSound()) {
                            this.slime.playSound(this.slime.getJumpSound(), this.slime.getSoundVolume(), this.slime.getSoundPitch());
                        }
                    } else {
                        this.slime.xxa = 0.0F;
                        this.slime.zza = 0.0F;
                        this.mob.setSpeed(0.0F);
                    }
                } else {
                    this.mob.setSpeed((float)(this.speedModifier * this.mob.getAttributeValue(Attributes.MOVEMENT_SPEED)));
                }

            }
        }
    }

    static class SlimeFloatGoal extends Goal {
        private final Fruitjellyslime slime;

        public SlimeFloatGoal(Fruitjellyslime pSlime) {
            this.slime = pSlime;
            this.setFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
            pSlime.getNavigation().setCanFloat(true);
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canUse() {
            return (this.slime.isInWater() || this.slime.isInLava()) && this.slime.getMoveControl() instanceof Fruitjellyslime.SlimeMoveControl;
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            if (this.slime.getRandom().nextFloat() < 0.8F) {
                this.slime.getJumpControl().jump();
            }

            ((Fruitjellyslime.SlimeMoveControl)this.slime.getMoveControl()).setWantedMovement(1.2D);
        }
    }

    static class SlimeRandomDirectionGoal extends Goal {
        private final Fruitjellyslime slime;
        private float chosenDegrees;
        private int nextRandomizeTime;

        public SlimeRandomDirectionGoal(Fruitjellyslime pSlime) {
            this.slime = pSlime;
            this.setFlags(EnumSet.of(Goal.Flag.LOOK));
        }

        /**
         * Returns whether execution should begin. You can also read and cache any state necessary for execution in this
         * method as well.
         */
        public boolean canUse() {
            return this.slime.getTarget() == null && (this.slime.isOnGround() || this.slime.isInWater() || this.slime.isInLava() || this.slime.hasEffect(MobEffects.LEVITATION)) && this.slime.getMoveControl() instanceof Fruitjellyslime.SlimeMoveControl;
        }

        /**
         * Keep ticking a continuous task that has already been started
         */
        public void tick() {
            if (--this.nextRandomizeTime <= 0) {
                this.nextRandomizeTime = this.adjustedTickDelay(40 + this.slime.getRandom().nextInt(60));
                this.chosenDegrees = (float)this.slime.getRandom().nextInt(360);
            }

            ((Fruitjellyslime.SlimeMoveControl)this.slime.getMoveControl()).setDirection(this.chosenDegrees);
        }
    }

    /*
    @Override
    protected boolean spawnCustomParticles() {
        // [VanillaCopy] from super tick with own particles
        int i = getSize();
        for (int j = 0; j < i * 8; ++j) {
            float f = this.getRandom().nextFloat() * ((float) Math.PI * 2F);
            float f1 = this.getRandom().nextFloat() * 0.5F + 0.5F;
            float f2 = Mth.sin(f) * i * 0.5F * f1;
            float f3 = Mth.cos(f) * i * 0.5F * f1;
            Level world = this.getLevel();
            double d0 = this.getX() + f2;
            double d1 = this.getZ() + f3;
            BlockState state = block.MAZESTONE_BRICK.get().defaultBlockState();
            world.addParticle(new BlockParticleOption(ParticleTypes.BLOCK, state), d0, this.getBoundingBox().minY, d1, 0.0D, 0.0D, 0.0D);
        }
        return true;
    }
    */

    @Override
    protected float getSoundVolume() {

        return 0.1F * this.getSize();
    }
}