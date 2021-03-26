package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import com.serenitydojo.model.FoodType;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.serenitydojo.model.AnimalType.*;
import static com.serenitydojo.model.FoodType.*;

public class WhenFeedingAnimals {

    @Test
    public void shouldFeedCatsTuna(){
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(CAT, false);

        Assert.assertEquals(TUNA, food);

    }

    @Test
    public void shouldFeedHamstersCabbage(){
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(HAMSTER, false);

        Assert.assertEquals(CABBAGE, food);

    }

    @Test
    public void shouldFeedDogsDogFood(){
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(DOG, false);

        Assert.assertEquals(DOG_FOOD, food);

    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood(){
        Feeder feeder = new Feeder();

        FoodType food = feeder.feeds(CAT, true);

        Assert.assertEquals(SALMON, food);
    }

    @Test
    public void listOfColours(){

        String[] colour = {"red","green","blue"};
        int[] ages = {1,2,3};

        String[] moreColours = new String[3]; //used to create an empty array
        moreColours[0] = "yellow";
        moreColours[1] = "purple";
        moreColours[2] = "blue";

        System.out.println("First Colour "+moreColours[0]);

        for ( int i = 0; i < moreColours.length; i++){
            System.out.println(moreColours[i]);
        }

        List<String> myColours = new ArrayList<>();

        myColours.add("red");
        myColours.add("green");
        myColours.add("azure");
        myColours.add("red");

        for(String someColour : myColours){
            System.out.println("Colour " + someColour);
        }

        Set<String> newColours = new HashSet<>();

        newColours.add("red");
        newColours.add("green");
        newColours.add("azure");
        newColours.add("red");

        for(String someColour : newColours){
            System.out.println("Colour " + someColour);
        }

    }
}
