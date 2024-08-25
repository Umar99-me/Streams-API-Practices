package com.java.stream.problems.numbers;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Given a list of integers, divide into two lists one having even numbers and other having odd numbers.
 */
public class SegregationOfEvenOddNumbersTest {
    @Test
    @Disabled
      void testSegregationOfEvenOddNumbersTest(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Map<Boolean,List<Integer>> map = list.stream().collect(Collectors.partitioningBy(x->(int) x%2==0));
        for(Boolean i :map.keySet()){
          System.out.println(map.get(i).toString());
        }
        // Assertions.assertEquals(1, 2);
      }

}
