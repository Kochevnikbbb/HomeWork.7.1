package com.company;

public class Magic extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(50);
        setHealth(200);
        setSuperAbilityType("FIRE BALL");
        System.out.println("Magic "+getHealth()+"hp "+getDamage()+"dd применил суперспособность "+getSuperAbilityType());
    }
}
