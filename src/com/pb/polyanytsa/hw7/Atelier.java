package com.pb.polyanytsa.hw7;

public class Atelier {
    public static void main(String[] args) {


        Clothes [] clothes={
                new Tshirt(Size.S, "красный", 545),

                new Tshirt(Size.XXS, "голубой", 300),

                new Pants(Size.XXS, "лазурный", 700),

                new Pants(Size.L, "черный", 950),

                new Skirt(Size.XXS, "бежевый", 1000),

                new Skirt(Size.M, "мятный", 750),

                new Tie(Size.XS, "розовый", 300),

                new Tie(Size.S, "белый", 458),
        };

        Dressing dressing = new Dressing();
        dressing.dressMan(clothes);
        System.out.println();
        dressing.dressWoman(clothes);
    }
}