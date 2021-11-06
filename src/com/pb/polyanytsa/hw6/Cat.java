package com.pb.polyanytsa.hw6;
import java.util.Objects;

public class Cat extends Animal {
    char participationExhibition;
    String gender;

    public char getParticipationExhibition() {
        return participationExhibition;
    }

    public void setParticipationExhibition(char participationExhibition) {

        this.participationExhibition = participationExhibition;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public void makeNoise() {
        System.out.println(getName()+" охотиться");
    }

    @Override
    public void eat() {
        System.out.println(getName()+"охотиться и ест");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return participationExhibition == cat.participationExhibition && Objects.equals(gender, cat.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participationExhibition, gender);
    }

    @Override
    public String toString() {
        return "Cat{" + "participationExhibition=" + participationExhibition + ", gender='" + gender + '\'' + '}';
    }
}