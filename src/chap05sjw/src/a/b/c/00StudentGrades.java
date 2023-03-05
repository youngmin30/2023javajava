package chap05sjw.src.a.b.c;

import java.util.Scanner;

public class StudentGrades {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] grades = new int[5][3];

    for (int i = 0; i < 5; i++) {
      System.out.println("Enter grades for student " + (i + 1));
      System.out.print("Korean: ");
      grades[i][0] = sc.nextInt();
      System.out.print("English: ");
      grades[i][1] = sc.nextInt();
      System.out.print("Math: ");
      grades[i][2] = sc.nextInt();
    }

    System.out.println("\nGrades: ");
    for (int i = 0; i < 5; i++) {
      System.out.println("Student " + (i + 1) + ": " +
                         grades[i][0] + " " +
                         grades[i][1] + " " +
                         grades[i][2]);
    }
  }
}