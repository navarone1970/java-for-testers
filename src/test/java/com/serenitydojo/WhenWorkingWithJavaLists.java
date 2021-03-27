package com.serenitydojo;

import org.assertj.core.api.Assertions;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import java.awt.*;
import java.util.*;
import java.util.List;

public class WhenWorkingWithJavaLists {

    @Test
    public void creatingASimpleList(){

        List simpleList = new ArrayList();

        simpleList.add("a string value");
        simpleList.add(123);

        Assertions.assertThat(simpleList).contains("a string value",123);
    }

    @Test
    public void createATypedList(){
        List<String> names = Arrays.asList("joe","sally","paul");//new ArrayList<>();
        List<Number> ages = Arrays.asList(23,45,12);
/*
        names.add("joe");
        names.add("sally");
        names.add("paul");
  */


        Assertions.assertThat(names).contains("joe","sally","paul");
        Assertions.assertThat(ages).contains(23,45,12);


    }

    @Test
    public void removingStuff(){
        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("paul");

        names.remove("sally");

        Assertions.assertThat(names).contains("joe","paul");

        names.clear();

        assertThat(names).isEmpty();

    }
    @Test
    public void combiningAList(){
        List<String> names = new ArrayList<>();
        names.add("joe");
        names.add("sally");
        names.add("pete");

        List<String> moreNames =  new ArrayList<>();
        moreNames.add("Jerry");
        moreNames.add("Tom");

        names.addAll(moreNames);

        assertThat(names).contains("joe","sally","pete","Jerry","Tom");

        names.removeAll(moreNames);

        assertThat(names).contains("joe","sally","pete");

    }

/*    @Test
    public void immutableLists(){
        List<String> names = Arrays.asList("joe","sally","paul");

        names.add("paul");

    }
    */

    @Test
    public void findElementInAList(){
        List<String> names = Arrays.asList("joe","sally","paul","sally","pete");

        int indexOfSally = names.indexOf("sally");
        int lastIndexOfSally = names.lastIndexOf("sally");

        assertThat(indexOfSally).isEqualTo(1);
        assertThat(lastIndexOfSally).isEqualTo(3);

    }
    @Test
    public void findASubList(){
        List<String> names = Arrays.asList("joe","sally","paul","sally","pete");

        List<String> middleNames = names.subList(1,4);

        assertThat(middleNames).contains("sally","paul","sally");

    }

    @Test
    public void findingTheSize(){
        List<String> names = Arrays.asList("joe","sally","paul","sally","pete");


        assertThat(names.size()).isEqualTo(5);

    }

    @Test
    public void convertingAListToASet(){
        List<String> names = Arrays.asList("joe","sally","paul","sally","pete");

        Set<String> uniqueNames = new HashSet<>(names);
        assertThat(uniqueNames).containsExactlyInAnyOrder("joe","sally","paul","pete");
    }

    @Test
    public void sortingAList(){
        List<String> names = Arrays.asList("joe","sally","paul","sally","pete");

        Collections.sort(names);
        List<Integer> ages = Arrays.asList(23,45,12);

        assertThat(names).containsExactlyInAnyOrder("joe","paul","pete","sally","sally");
    }

    @Test
    public void findingMaxAndMin(){
        List<Integer> ages = Arrays.asList(10,30,20,60,45);

        assertThat(Collections.max(ages)).isEqualTo(60);
        assertThat(Collections.min(ages)).isEqualTo(10);
    }
}
