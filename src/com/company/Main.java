package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1200);
        boss.setDamage(50);
        boss.setSword(new Weapon ());
        boss.sword.setNameOfWeapon("Sword");
        boss.sword.setTypeOfWeapon("One hand weapon");

        System.out.println(boss.getHealth() + " "
                         + boss.getDamage() + " "
                         + boss.getSword().getNameOfWeapon() + " "
                         + boss.getSword().getTypeOfWeapon());

        System.out.println(boss.printInfo());

        Skeleton skull = new Skeleton();
        skull.setHealth(500);
        skull.setDamage(40);
        skull.setNumberOfArrows(10);
        skull.setSword(new Weapon());
        skull.sword.setTypeOfWeapon("Ranged weapon");
        skull.sword.setNameOfWeapon("Bow");

        Skeleton nitro = new Skeleton();
        nitro.setHealth(500);
        nitro.setDamage(45);
        nitro.setNumberOfArrows(20);
        nitro.setSword(new Weapon());
        nitro.sword.setNameOfWeapon("Green-Bow");
        nitro.sword.setTypeOfWeapon("Ranged weapon");

        System.out.println("Скелет Skull: " + skull.printInfo());
        System.out.println("Скелет Nitro: " + nitro.printInfo());
    }
}
