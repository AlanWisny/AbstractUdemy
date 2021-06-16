package com.company;

public class Main {

    public static void main(String[] args) {
	Animal dog = new Dog("Amstaff");
	dog.breathe();
	dog.eat();
		System.out.println();

	Bird bird = new Parrot("Faggit ringneck");
	bird.breathe();
	bird.eat();
	bird.fly();
		System.out.println();

	Bird tootoot = new Penguin("Emprar");
	tootoot.fly();
    }
}
