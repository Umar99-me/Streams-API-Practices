package com.java.stream.problems.strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/*
*


100)
	For a given string, like "aabbccdeff", count each char and declare winner or loser by following rules
· Winner char will have max number of char count and no other char will have same count
· Loser will have min number of char count and no other char will have same count.
Input: aabbccdeff
Output: winner: none, loser: e*/
public class WinnerLoserTest {
    @Test
    @Disabled
      void testWinnerLoserTest(){
        String s = "aabbccddefff";
        // Map<String,Long> map
         String ss= Arrays.stream(s.split(""))
        .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
        .entrySet()
        .stream()
        .sorted((x,y)->(x.getValue()>y.getValue())?1:-1)
        .collect(Collectors.toMap(x->x.getValue(),x->x.getKey(),(x,y)->x+y)).toString()
        // .entrySet()
        // .filter(x->x.getValue()==1)
        ;
        System.out.println(ss);
      }

}
