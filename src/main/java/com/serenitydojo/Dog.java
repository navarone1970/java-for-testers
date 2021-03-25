package com.serenitydojo;

public class Dog extends Pet{
    private String favouriteToy;
    private int age;

    public Dog(String name, String favouriteToy, int age) {
        super(name);
        this.favouriteToy = favouriteToy;
        this.age = age;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String makeNoise() {
        return "Woof";
    }
}
