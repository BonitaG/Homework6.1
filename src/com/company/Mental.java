package com.company;

public class Mental extends Player implements Moveable{
    @Override
    public void useAbility() {
        System.out.println("Mental make damage");
    }
}
