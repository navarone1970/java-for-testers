package com.serenitydojo.model;

public class Feeder {

    public String feeds(AnimalType animal, boolean isPremium) {

        switch (animal){
            case CAT:
                return (isPremium) ? "Salmon" : "Tuna";
            case DOG:
                return (isPremium) ? "Premium Dog Food" : "Dog Food";
            case HAMSTER:
                return (isPremium) ? "Lettuce" : "Cabbage";
            default:
                return "Don't know animal - don't know food";
        }
/*
        if (animal.equals("Cat")){
            return (isPremium) ? "Salmon" : "Tuna";
        } else if (animal.equals("Dog")) {
            return "Dog Food";
        } else {
            return "Cabbage";
        }
*/
    }
}
