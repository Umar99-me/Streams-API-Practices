package com.java.stream.problems.strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Collectors;
import java.util.Arrays;

import com.java.stream.solutions.GeneralProblemsSolution;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateCharactersTest {
  @Test
  @Disabled()
  public void testRemoveDuplicates() {
    final String input = "dabfcadef";
    String actual = "";
    final String expected = GeneralProblemsSolution.getUniqueCharacters(input);
    actual = Arrays.stream(input.split("")).distinct().collect(Collectors.joining());
    assertEquals(expected, actual);
  }
}
