package com.basics.lambdas;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** The type Staff. */
class Staff {

  private final String name;
  private final int age;
  private final BigDecimal salary;

  /**
   * Instantiates a new Staff.
   *
   * @param name the name
   * @param age the age
   * @param salary the salary
   */
  public Staff(String name, int age, BigDecimal salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Gets age.
   *
   * @return the age
   */
  public int getAge() {
    return age;
  }

  /**
   * Gets salary.
   *
   * @return the salary
   */
  public BigDecimal getSalary() {
    return salary;
  }
}

/** The type Map. */
public class map {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    List<String> alpha = Arrays.asList("a", "b", "c", "d");

    List<String> collection = alpha.stream().map(String::toUpperCase).collect(Collectors.toList());
    System.out.println(collection);

    List<Staff> staff =
        Arrays.asList(
            new Staff("Walter", 37, new BigDecimal(121231)),
            new Staff("Thomas", 37, new BigDecimal(121231)),
            new Staff("Sean", 37, new BigDecimal(23143123)),
            new Staff("Erick", 37, new BigDecimal(153223)));

    List<String> collection1 = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
    System.out.println(collection1);
  }
}
