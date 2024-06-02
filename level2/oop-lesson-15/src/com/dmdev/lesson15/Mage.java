package com.dmdev.lesson15;

import com.dmdev.lesson18.weapon.MagicWeapon;
import com.dmdev.lesson18.weapon.Weapon;

public class Mage<T extends MagicWeapon & Weapon> extends Hero<T> {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " сотворил заклинание на " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
