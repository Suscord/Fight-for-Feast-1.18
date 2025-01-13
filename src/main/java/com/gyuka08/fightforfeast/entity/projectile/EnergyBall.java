package com.gyuka08.fightforfeast.entity.projectile;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.level.Level;

public abstract class EnergyBall extends AbstractHurtingProjectile {

    protected EnergyBall(EntityType<? extends EnergyBall> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public EnergyBall(EntityType<? extends EnergyBall> pEntityType, double pX, double pY, double pZ, double pOffsetX, double pOffsetY, double pOffsetZ, Level pLevel) {
        super(pEntityType, pX, pY, pZ, pOffsetX, pOffsetY, pOffsetZ, pLevel);
    }

    public EnergyBall(EntityType<? extends EnergyBall> pEntityType, LivingEntity pShooter, double pOffsetX, double pOffsetY, double pOffsetZ, Level pLevel) {
        super(pEntityType, pShooter, pOffsetX, pOffsetY, pOffsetZ, pLevel);
    }
}
