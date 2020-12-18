package com.basics.lambdas;

import java.util.Arrays;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        /*try not do do this.
          If you need logic create a new function instead*/

        numbers.forEach(e -> {
            int count = 0;
            for(int i = 1; i <= e; i++) {
                if(e % i == 0) count++;
            }
            System.out.println(count);
        });


    }
}
