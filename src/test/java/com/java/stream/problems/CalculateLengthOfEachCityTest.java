package com.java.stream.problems;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
* List of cities

   "Mumbai"
   "Munnar"
   "chennai"
   "Hyderabad"

   Calcullate the lenght of each city where the city name starts with 'm' or 'M' and create a list.

*/
public class CalculateLengthOfEachCityTest {
    @Test
   //  @Disabled
      void testCalculateLengthOfEachCityTest(){
        List<String> list = new ArrayList<String>();
       
        list.add("Mumbai");
        list.add("Munnar");
        list.add("chennai");
        list.add("Hyderabad");

         Map<String,Integer> map =  list
         .stream()
         .filter(x->x.toLowerCase().startsWith("m"))
         .collect(Collectors.toMap(x->x, x->x.length()));
        System.out.println(map.toString());
      }

}
