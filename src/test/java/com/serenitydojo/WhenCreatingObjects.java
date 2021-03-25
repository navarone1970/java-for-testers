package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Cat.usualFood;

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

        Pet hamster = new Hamster("Rusty","Wheel",1);

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

        Cat felix = new Cat("Felix",4) ;
        Cat spot = new Cat("Spot","Salmon",3);

        felix.makeNoise();
        spot.makeNoise();
        System.out.println("Usual food = "+Cat.usualFood());
        felix.feed("Tuna");
        spot.feed("Salmon");

        System.out.println("Felix's food = " + felix.getFavouriteFood());

        System.out.println("Cats like " + usualFood());

        felix.groom();

        System.out.println("Felix goes "+felix.makeNoise());
    }

    @Test
    public void dog_makes_noise(){
        Dog Fido = new Dog("Fido","Bone",3);
        System.out.println("Fido goes "+Fido.makeNoise());

    }

    @Test
    public void pets_make_noise(){
        Pet felix = new Cat("Felix", 2);
        Pet fido = new Dog("Fido", "Bone",6);
        Pet furball = new Hamster("Furball","Wheel",1);

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Furball goes " + furball.makeNoise());


    }
    @Test
    public void creating_a_hamster(){
        Hamster kermit = new Hamster("Kermit","Wheel",2);
        Assert.assertEquals(kermit.getName(),"Kermit");
        Assert.assertEquals(kermit.getFavouriteGame(),"Wheel");
        Assert.assertEquals(kermit.getAge(),2);
    }
}
