package Ejercicios;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayDaysWeek {

    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thuresday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter a day of the week");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        System.out.println("Your day selected is: " + days[day-1]);
    }
}
