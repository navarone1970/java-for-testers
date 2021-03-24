package com.serenitydojo;

public class Dog {
    private String name;
    private String favouriteToy;
    private int age;

    public Dog(String name, String favouriteToy, int age) {
        this.name = name;
        this.favouriteToy = favouriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public int getAge() {
        return age;
    }
}
