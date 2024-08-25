package com.java.stream.problems.numbers;

import com.github.javafaker.Faker;
import com.java.stream.solutions.GeneralProblemsNumbersSolution;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
 * Remove duplicates from an arrayList.
 * */
public class RemoveDuplicationFromListTest {
  @Test
  // @Disabled
  void testRemoveDuplicationFromListTest() {
    final var instance = Faker.instance();

    final var someValue = instance.number().randomNumber();
    final var input =
        List.of(
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            someValue,
            someValue,
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber(),
            instance.number().randomNumber());
    var actual = List.<Long>of();
    var expected = GeneralProblemsNumbersSolution.getUniqueNumberFromList(input);
    HashSet<Long> set = new HashSet<>();
    actual = input.stream().filter(x->set.add(x)).collect(Collectors.toList());
    Assertions.assertEquals(expected, actual);
  }
}
