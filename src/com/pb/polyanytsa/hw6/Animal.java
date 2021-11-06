package com.pb.polyanytsa.hw6;

    public class Animal {
        private String food;
        private String location;
        private String name;

        public String getFood() {
            return food;
        }

        public void setFood(String food) {
            this.food = food;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void makeNoise() {
            System.out.println(name+ " мяукаэт");
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "food='" + food + '\'' +
                    ", location='" + location + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }

        public void eat() {
            System.out.println(name+ " ест");
        }

        public void sleep()
        {
            System.out.println(name+ "  спит");
        }
    }