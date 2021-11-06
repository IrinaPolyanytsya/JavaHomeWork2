package com.pb.polyanytsa.hw6;
import java.util.Objects;

public class Dog extends Animal
{
    char vaccination;
    String breed;

    public char getVaccination() {
        return vaccination;
    }

    public void setVaccination(char vaccination) {
        this.vaccination = vaccination;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public void eat() {
        System.out.println(getName()+"кушает");
    }
    @Override
    public void makeNoise() {
        System.out.println(getName()+"гавкает на прохожих");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return vaccination == dog.vaccination && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vaccination, breed);
    }

    @Override
    public String toString() {
        return "Dog{" + "vaccination=" + vaccination + ", breed='" + breed + '\'' + '}';
    }
}