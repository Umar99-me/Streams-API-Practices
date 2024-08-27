package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class SecondHighestWordTest {
  @Test
  // @Disabled()
  public void find2ndHighestWord() {
    final String input = "I am interested123455 to grow in my organization";
    String expected = GeneralProblemsSolution.find2ndLargestWordInTheString(input);
    List<String> list = Arrays.stream(input.split(" ")).sorted((x,y)->(x.length()<y.length())?1:-1).collect(Collectors.toList());
    final String actual = list.get(1);
    System.out.println(actual);
    assertEquals(expected, actual);
  }

}
