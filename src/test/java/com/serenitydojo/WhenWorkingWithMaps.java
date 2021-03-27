package com.serenitydojo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WhenWorkingWithMaps {

    @Test
    public void  creatingAMap(){
        Map<String, Integer> numberOfBallsByColour = new HashMap<>();

        numberOfBallsByColour.put("red",3);
        numberOfBallsByColour.put("green",6);
        numberOfBallsByColour.put("blue",5);

        Integer numberOfRedBalls = numberOfBallsByColour.get("red");
        System.out.println("There are "+numberOfRedBalls + " red balls.");
    }

    @Test
    public void creatingAMapMoreConcisely(){
        Map<String, Integer> numberOfBallsByColour = Map.of("red",3,"green",6,"blue",5); //Constant map - you can't remove values after creating it.

        Map<String, Integer> moreColours = new HashMap<>();
        moreColours.put("yellow",10);
        moreColours.put("pink",15);
        moreColours.putAll(numberOfBallsByColour);


        Integer numberOfRedBalls = moreColours.get("red");
        System.out.println("There are "+numberOfRedBalls + " red balls.");

        System.out.println("Number of colours for white balls "+moreColours.getOrDefault("white",0));

        System.out.println("Purple tennis balls are present: "+moreColours.containsKey("purple"));

        moreColours.replace("pink",45);
        moreColours.replace("yellow",20);
        System.out.println("Number of yellow balls " + moreColours.getOrDefault("pink",20));

    }

    @Test
    public void iteratingOverMapKeys(){
        Map<String,Integer> numberOfBallsByColour = Map.of("red", 10, "green", 20, "blue", 15);

        System.out.println("Keys = " + numberOfBallsByColour.keySet());

        for(String key : numberOfBallsByColour.keySet()) {
            Integer numberOfTennisBalls = numberOfBallsByColour.get(key);
            System.out.println(key + " => "+numberOfTennisBalls);
        }

        Map<String, Integer> modifiableMap = new HashMap<>();
        modifiableMap.putAll(numberOfBallsByColour);

        modifiableMap.remove("red");

        printMap(modifiableMap);

    }

    private void printMap(Map<String, Integer> numberOfBallsByColour) {
        for(Map.Entry<String, Integer> entry : numberOfBallsByColour.entrySet()) {
            System.out.println(entry.getKey() + " -> "+entry.getValue());
        }
    }
}
