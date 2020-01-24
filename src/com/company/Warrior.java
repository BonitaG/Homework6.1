package com.company;

import com.company.Player;

public class Warrior extends Player implements Moveable{


    @Override
    public void useAbility() {
        System.out.println("Warrior make critical damage");

    }
}
