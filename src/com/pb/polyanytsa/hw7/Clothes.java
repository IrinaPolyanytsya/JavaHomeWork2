package com.pb.polyanytsa.hw7;

public abstract class  Clothes {
    protected Size size;
    protected String color;
    protected double price;

    public Clothes(Size size, String color) {
        this.size = size;
        this.color = color;
    }
    public Clothes(Size size, String color, double price) {
        this(size, color);
        this.price = price;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }
    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes)) return false;

        Clothes clothes = (Clothes) o;

        if (Double.compare(clothes.price, price) != 0) return false;
        if (size != clothes.size) return false;
        return color.equals(clothes.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = size.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }
}

