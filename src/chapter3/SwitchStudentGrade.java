package chapter3;

import java.util.Scanner;

public class SwitchStudentGrade {

    public static void main(String[] args) {

        System.out.println("Please enter grade:");
        Scanner input = new Scanner(System.in);
        String grade = input.next();

        switch (grade){
            case "A"-> System.out.println("Excelente job");
            case "B" -> System.out.println("Great job");
            case "C" -> System.out.println("Good job");
            case "D" -> System.out.println("Average job");
            case "E" -> System.out.println("Work harder");
            default -> System.out.println("Invalid grade");

        }
    }
}
