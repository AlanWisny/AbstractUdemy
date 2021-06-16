package com.company;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("This " + getName() + " piece of shit can't fly very well. Bummahr.");
    }
}
