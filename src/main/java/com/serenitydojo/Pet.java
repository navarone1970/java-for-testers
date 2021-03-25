package com.serenitydojo;

public abstract class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String  makeNoise();

    public String goForWalk(){
        return "walk walk walk";
    }
}
