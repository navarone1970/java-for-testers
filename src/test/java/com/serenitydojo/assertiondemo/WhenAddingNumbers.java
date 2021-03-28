package com.serenitydojo.assertiondemo;

import org.assertj.core.api.Assertions;
import org.assertj.core.data.Percentage;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenAddingNumbers {

    @Test
    public void shouldAddTwointegersCorrectly(){
        int a = 1;
        int b = 2;

        int sum = a + b;

        //Assert.assertEquals(sum,3); //This is the intuitive way of using the assert in terms of result but not code
        //assertThat(sum).isEqualTo(4);
        assertThat(sum).isCloseTo(4, Percentage.withPercentage(25));

        String colour = "red";
        String otherColour = "Red";

        assertThat(colour).isEqualToIgnoringCase(otherColour);

        List<String> coloursList = Arrays.asList("red","green","blue");

        assertThat(coloursList).hasSize(3);
        assertThat(coloursList).contains("green");

    }
}
