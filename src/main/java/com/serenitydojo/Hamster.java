package com.serenitydojo;

public class Hamster extends Pet{
    private String favouriteGame;
    private int age;

    public Hamster(String name, String favouriteGame, int age){
        super(name);
        this.favouriteGame = favouriteGame;
        this.age = age;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String makeNoise() {
        return "Squeak";
    }

}
