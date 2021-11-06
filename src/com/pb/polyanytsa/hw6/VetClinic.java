package com.pb.polyanytsa.hw6;

import java.lang.reflect.Constructor;

public class VetClinic {
    public static void main(String[] args) throws Exception {

        Cat cat = new Cat();
        cat.setFood("Корм 'Kitekat '");
        cat.setLocation("Кременчуг");
        cat.setName("Кошка Катастрофа");
        cat.setGender("male");

        Horse horse = new Horse();
        horse.setName("Лошадь Бриз ");
        horse.setFood("Сено");
        horse.setParticipationRaces('Y');
        horse.setLocation("Киев");

        Dog dog = new Dog();
        dog.setName("Собака Дик");
        dog.setLocation("Запорожье");
        dog.setFood("Корм 'Chappi' для взрослых собак с говядиной");
        dog.setBreed("дворняга");
        dog.setVaccination('N');

        Veterinarian vet  = new Veterinarian();
        Class clazz = vet.getClass();

        Class vetClazz = Class.forName("com.pb.polyanytsa.hw6.Veterinarian");

        Constructor constr = vetClazz.getConstructor();
        Object obj = constr.newInstance();
        Animal[] animals = new Animal[]{cat, horse, dog};
        String[] output = new String[animals.length];
        if (obj instanceof Veterinarian) {
            for (int i = 0; i < animals.length; i++) {
                System.out.println("Ожидают приема врача: ");
                Veterinarian.treatAnimal(animals[i]);
                System.out.println("            ");
            }
            System.out.println(" ");
            System.out.println("Equal cat&dog: " + cat.equals(dog));
            System.out.println("Equal cat&cat: " + cat.equals(cat));
            System.out.println(" ");
            System.out.println("Hashcode cat: " + cat.hashCode());
            System.out.println("Hashcode dog: " + dog.hashCode());
            System.out.println("Hashcode horse: " + horse.hashCode());
            System.out.println(" ");
            System.out.println("Ожидают приема в клинику: ");

            Animal[] animals1 = new Animal[]{cat, horse, dog};
            String[] output1 = new String[animals.length];
            for (int i = 0; i < animals.length; i++) {
                output[i] = animals[i].getName();
                System.out.println("[Животное: " + animals[i].getName() + "] ");
            }
            System.out.println(" ");

        }
    }
}