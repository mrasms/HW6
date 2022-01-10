package com.company;

public class Boss extends GameEntity{

    Weapon sword = new Weapon();

    public Weapon getSword() {

        return sword;
    }

    public void setSword(Weapon sword ) {

        this.sword = sword;
    }

    public String printInfo () {
        return  "Damage: "+ this.getDamage() + "; Health: " + this.getHealth() + "; Weapon: " + this.getSword().getNameOfWeapon()
                + "; Type of weapon: " + this.getSword().getTypeOfWeapon();

    }

}
