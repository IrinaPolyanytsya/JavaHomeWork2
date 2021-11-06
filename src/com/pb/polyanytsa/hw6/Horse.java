package com.pb.polyanytsa.hw6;
import java.util.Objects;

public class Horse extends Animal{
    int speedRun;
    int maneLength;
    char participationRaces;

    public int getSpeedRun() {
        return speedRun;
    }

    public void setSpeedRun(int speedRun) {
        this.speedRun = speedRun;
    }

    public int getManeLength() {
        return maneLength;
    }

    public void setManeLength(int maneLength) {
        this.maneLength = maneLength;
    }

    public char getParticipationRaces() {
        return participationRaces;
    }

    public void setParticipationRaces(char participationRaces) {
        this.participationRaces = participationRaces;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" ест сено");
    }

    @Override
    public void makeNoise() {
        super.sleep();
        System.out.println(getName()+" скачет по лугу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return speedRun == horse.speedRun && maneLength == horse.maneLength && participationRaces == horse.participationRaces;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedRun, maneLength, participationRaces);
    }

    @Override
    public String toString() {
        return "Horse{" + "speedRun=" + speedRun + ", maneLength=" + maneLength + ", participationRaces=" + participationRaces + '}';
    }
}