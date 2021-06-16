package com.company;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("This " + getName() + " piece of shit is flying");
    }
}
