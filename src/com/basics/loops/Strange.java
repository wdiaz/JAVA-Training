package com.basics.loops;

import java.util.Arrays;

/** The type Strange. */
public class Strange {

  /** The constant MAX. */
  public static final int MAX = 5;

  /** Unknown. */
  public static void unknown() {
    int number = 0;
    int[] v = new int[MAX];
    for (int count = MAX; count >= 1; count--) {
      number += (count * count);
      v[count-1] = number;
    }
    System.out.println(Arrays.stream(v).sum());
    //System.out.println("The result is:" + number);
  }

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    unknown();
  }
}

