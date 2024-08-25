package com.java.stream.problems.numbers;

import com.java.stream.solutions.GeneralProblemsNumbersSolution;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.util.stream.Collectors;
/*
 * Given a numeric array , re arrange the elements to form a highest possible value.
 * Input:  {1, 34, 3, 98, 9, 76, 45, 4};
 * Output: 998764543431
 * Explanation: 9,98,76,45,4,34,3,1
 * */
public class ReArrangeElementInDecendingOrderTest {

  @Test
  @Disabled
  public void test() {
    var input = List.of(1, 34, 3, 98, 9, 76, 45, 4);
    var expected = GeneralProblemsNumbersSolution.getHighestPossibleValue(input);
    var actual = "";
    actual = input.stream().map(String::valueOf).sorted((x,y)->y.compareTo(x)).collect(Collectors.joining());
    System.out.println(actual);
    Assertions.assertEquals(expected, actual);
  }
}
