package chapter4;

import java.util.Scanner;

public class WhileCalculatePays {

    public static void main(String[] args) {

        int rate = 40;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?:");
        Scanner input = new Scanner(System.in);
        double hoursWorked = input.nextDouble();

        while (hoursWorked > maxHours){
            System.out.println("Invalid entry, try Again");
            hoursWorked = input.nextDouble();
        }

        System.out.println("Payment due: " + hoursWorked * rate );

    }

}
