package com.company;

public abstract class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking yo");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + "is breathing yo");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public abstract void fly();
}
