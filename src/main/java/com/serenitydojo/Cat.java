package com.serenitydojo;

public class Cat {
    private int age;
    private String name;
    private String favouriteFood;

    public static final String CAT_NOISE = "Meow";

    public Cat(String name, String favouriteFood, int age) {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public int getAge(){
        return age;
    }

    public void makeNoise(){
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void lickPaws() {
        System.out.println(name + " licks his paws");
    }

    private void cleanFur() {
        System.out.println(name + " cleans his fur");
    }
}
