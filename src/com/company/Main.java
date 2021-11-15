package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero[] heroes = {new Magic(),new Medic(),new Warrior()};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();

        }
    }
}
