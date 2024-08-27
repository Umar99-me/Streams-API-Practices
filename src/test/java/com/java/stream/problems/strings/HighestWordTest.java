package com.java.stream.problems.strings;

import com.java.stream.solutions.GeneralProblemsSolution;

import java.util.Map;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class HighestWordTest {
  @Test
  // @Disabled()
  public void findLargestWordInTheString() {
    final String input = "I am interested123455 to grow in my organization";
    final String expected = GeneralProblemsSolution.findLargestWordInTheString(input);

    String actual = null;
    // int key = Arrays.stream(input.split(" ")).collect(Collectors.toMap(x->x.length, x->x,(a,b)->a+", "+b)).entrySet().
    // strem().max(Map.Entry.comparingByValue());
    List<String> list = Arrays.stream(input.split(" ")).sorted((x,y)->(x.length()<y.length())?1:-1).collect(Collectors.toList());
  
    actual = list.get(0);
    System.out.println(actual);
    Assertions.assertEquals(expected, actual);
  }
}
