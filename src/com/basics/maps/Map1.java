package com.basics.maps;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
  public static void main(String[] args) {
    Map map = new HashMap<String, Integer>();
    for (int i = 0; i < 10; i++) {
      map.put("key_" + i, (i + 4 * 5));
    }

    displayMap(map);
  }

  private static void displayMap(Map<String, Integer> map) {
    map.forEach((k, v) -> System.out.println((k + " " + v)));
  }
}
