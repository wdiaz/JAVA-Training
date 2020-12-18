package com.basics.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example01 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // external iterator
        /*for (int i = 0; i <numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }*/

        // external iterator also
        /*for (int e : numbers) {
            System.out.println(e);
        }*/

        // internal iterators
        //numbers.forEach((Integer value) -> System.out.println(value));
        //numbers.forEach((value) -> System.out.println(value)); // Removed Integer Because of generics in line 9
        //numbers.forEach((value) -> System.out.println(value)); // Removed parenthesis, possible when single parameter
        numbers.forEach(System.out::println); // simplifies as
    }
}
