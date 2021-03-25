package com.serenitydojo;

public class Pet {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String makeNoise() {
        return "Unknown Noise";
    }

    public String goForWalk(){
        return "walk walk walk";
    }
}
