package com.basics;

/** The type Student. */
class Student {

    private final int studentId;

    private final String name;

  /**
   * Instantiates a new Student.
   *
   * @param studentId the student id
   * @param name the name
   */
  public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

  /**
   * Gets student id.
   *
   * @return the student id
   */
  public int getStudentId() {
        return studentId;
    }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
        return name;
    }


}

/** The type Main. */
public class Main {
  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {
    int[] intArray = new int[] {1, 2, 3, 3, 4};
    for (int i = 0; i < intArray.length; i++) {
      System.out.print(intArray[i]);
    }

    /* Create an array and put some values then display in a loop */
    // int[] arr;
    int[] arr = new int[5];
    arr[0] = 4;
    arr[1] = 2;
    arr[2] = 3;
    arr[3] = 4;
    arr[4] = 5;
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    Student[] students = new Student[2];
    students[0] = new Student(10, "Walter Diaz");
    students[1] = new Student(34, "Thomas Smith");

    for (Student student : students) {
      System.out.println(student.getStudentId() + ", " + student.getName());
    }

  }
}
