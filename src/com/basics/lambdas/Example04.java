package com.basics.lambdas;

import java.util.Arrays;
import java.util.List;

public class Example04 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(
        numbers
                .stream()
                //.reduce(0, (total, e) -> Integer.sum(total , e))
                .reduce(Integer::sum) // method reference
        );
    }
}
