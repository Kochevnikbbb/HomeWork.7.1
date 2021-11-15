package com.company;

public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setDamage(100);
        setHealth(300);
        setSuperAbilityType("CRITICAL DAMAGE");
        System.out.println("Warrior "+getHealth()+"hp "+getDamage()+"dd применил суперспособность "+getSuperAbilityType());
    }
}
