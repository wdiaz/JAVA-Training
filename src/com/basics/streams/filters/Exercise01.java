package com.basics.streams.filters;

import java.util.Arrays;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        // given an ordered list, find the double of the first even numbers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,10,11,2);
        int values =
                numbers.stream()
                .filter(e -> e > 3)
                .filter( e -> e % 2 ==0)
                .map( x -> x *2)
                .findFirst().get();
        System.out.println(values);
    }
}
