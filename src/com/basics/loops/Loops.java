package com.basics.loops;

import java.util.*;
import java.util.Arrays;

public class Loops {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("a", "b", "c", "d");
    List<Integer> intList = Arrays.asList(1,2,3,4);
    list.forEach(x -> System.out.println(x));
    intList.forEach(x -> System.out.println(x));

    System.out.println("Now for:");
    for (Integer i : intList) {
      System.out.println(i);
    }

    System.out.println("Paralell Execution");
    list.parallelStream().forEach(x -> System.out.println(x));
  }
}
