package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables(){
        final int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;
        final int cost;
        int age = 34;

        age = age+1;
        System.out.println("age = "+ageNextYear);

        long starsInTheGalaxy = 10000000000L;

        System.out.println("Stars in the Galaxy = "+starsInTheGalaxy);

        float price = 45.45F;
        System.out.println("Price = "+price);

        double length = 123.445672;
        System.out.println("Length = "+length);

    }

    @Test
    public void workingWIthStrings(){
        String firstName = "Simon-Peter";
        String upperCaseFirstName = firstName.toUpperCase();
        String playFirstName = firstName.replace("Simon","John");
        System.out.println("FirstName - "+firstName);
        System.out.println("UpperCase FirstName - "+upperCaseFirstName);
        System.out.println("Play FirstName - "+playFirstName);

    }
}
