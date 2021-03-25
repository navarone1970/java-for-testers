package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String favouriteFood = "Tuna";
        int age = 4;

        Cat felix = new Cat("Felix","Tuna",4);

        System.out.println(felix.getName());
        System.out.println(felix.getFavouriteFood());

        Cat spot = new Cat("Spot", "Tuna", 3);
        System.out.println("Spot's age is "+spot.getAge());
        Assert.assertEquals(felix.getName(),"Felix");
        Assert.assertEquals(felix.getFavouriteFood(),"Tuna");
        Assert.assertEquals(felix.getAge(),4);

    }

    @Test
    public void creating_a_dog(){
        Dog dog = new Dog("Fido","Ball",5);
        Assert.assertEquals(dog.getName(),"Fido");
        Assert.assertEquals(dog.getFavouriteToy(),"Ball");
        Assert.assertEquals(dog.getAge(),5);

    }

    @Test
    public void cat_makes_noise(){
       Cat felix = new Cat("Felix","Tuna",4) ;
       Cat spot = new Cat("Spot","Salmon",3);

       felix.makeNoise();
       spot.makeNoise();
       felix.feed("Tuna");
       spot.feed("Salmon");

       felix.groom();
    }
}
