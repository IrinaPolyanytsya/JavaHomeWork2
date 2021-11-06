package com.pb.polyanytsa.hw6;

public class Veterinarian {
    Horse horse=new Horse();
    Cat cat=new Cat();
    Dog dog=new Dog();

    public static void treatAnimal(Animal animal) {

        System.out.println("Животное: " + animal.getName() + ", " +
                "кушает: " + animal.getFood() + ", " +
                "Живет в городе: " + animal.getLocation());

    }
}