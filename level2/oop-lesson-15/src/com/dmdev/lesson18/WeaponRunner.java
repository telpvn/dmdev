package com.dmdev.lesson18;

import com.dmdev.lesson15.Archer;
import com.dmdev.lesson15.Hero;
import com.dmdev.lesson15.Warrior;
import com.dmdev.lesson18.weapon.Bow;
import com.dmdev.lesson18.weapon.MeleeWeapon;
import com.dmdev.lesson18.weapon.Sword;
import com.dmdev.lesson18.weapon.Weapon;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Легалас", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Боромир", 10);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

    public static void printWeaponDamage(Hero<? extends Weapon> hero) {

        System.out.println(hero.getWeapon().getDamage());
    }

    // Object -> Weapon -> MeleeWeapon -> Sword (писал Антон
}
