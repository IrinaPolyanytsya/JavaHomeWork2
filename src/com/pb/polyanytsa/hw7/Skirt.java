package com.pb.polyanytsa.hw7;

public class Skirt extends Clothes implements WomenClothes{

    public Skirt(Size size, String color) {

        super(size, color);
    }

    public Skirt(Size size, String color, double price) {

        super(size, color, price);
    }

    @Override
    public String toString() {
        return "Юбка[" +
                "размер = " + getSize() +
                ", цена = " + getPrice() + " грн" +
                ", цвет = " + getColor() +
                "]";
    }

}