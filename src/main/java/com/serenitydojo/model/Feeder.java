package com.serenitydojo.model;

import static com.serenitydojo.model.FoodType.*;

public class Feeder {

    public FoodType feeds(AnimalType animal, boolean isPremium) {

        switch (animal){
            case CAT:
                return (isPremium) ? SALMON : TUNA;
            case DOG:
                return (isPremium) ? PREMIUMDOGFOOD : DOGFOOD;
            case HAMSTER:
                return (isPremium) ? LETTUCE : CABBAGE;
            default:
                return UNKNOWN;
        }
    }
}
