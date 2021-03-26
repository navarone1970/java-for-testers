package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.model.AnimalType.*;

public class WhenFeedingAnimals {

    @Test
    public void shouldFeedCatsTuna(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, false);

        Assert.assertEquals("Tuna", food);

    }

    @Test
    public void shouldFeedHamstersCabbage(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(HAMSTER, false);

        Assert.assertEquals("Cabbage", food);

    }

    @Test
    public void shouldFeedDogsDogFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(DOG, false);

        Assert.assertEquals("Dog Food", food);

    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood(){
        Feeder feeder = new Feeder();

        String food = feeder.feeds(CAT, true);

        Assert.assertEquals("Salmon", food);
    }
}
