package com.serenitydojo;

public class Cat extends Pet {
    private int age;
    private String favouriteFood;

    public static final String CAT_NOISE = "Meow";

    public static String usualFood(){
        return "Tuna";
    }

    public Cat(String name, String favouriteFood, int age) {
        super(name);
        this.favouriteFood = favouriteFood;
        this.age = age;
    }

    public Cat(String name, int age) {
        super(name);
        this.favouriteFood = usualFood();
        this.age = age;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String makeNoise(){
        return CAT_NOISE;
    }

    public void feed(String food) {        System.out.println(getName() + " eats some " + food);    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void lickPaws() {        System.out.println(getName() + " licks his paws");    }

    private void cleanFur() {        System.out.println(getName() + " cleans his fur");    }
}
