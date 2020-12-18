package com.basics.streams.filters;

import java.util.Arrays;
import java.util.List;

public class Exercise02 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,10);
        System.out.println(
            numbers
                    //.stream()
                    .parallelStream()
                    .filter(e -> e % 2 == 0)
                    .mapToInt(Exercise02::compute)
                    .sum()
        );
    }

    public static int compute(int number) {
        try{
            Thread.sleep(1000);
        } catch (Exception ex) {}
        return number * 2;
    }
}
