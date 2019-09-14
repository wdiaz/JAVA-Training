package com.basics.arrays;

import java.util.List;
import java.util.Arrays;

public class Lists {
  public static void main(String[] args) {
    String a[] = new String[] {"a", "b", "c", "d"};
    List<String> list = Arrays.asList(a);
    System.out.println("List: " + list);
  }
}
