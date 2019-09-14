package com.basics.loops;

public class Exercise24 {
  public static void main(String[] args) {
    for (int i = 0; i <= 2; i++) {
      for (int j = 0; j <= 3; j++) {
        for (int k = 0; k <= 4; k++) {
          System.out.println("*");
        }
        System.out.println("!");
      }
      System.out.println();
    }
  }
}
