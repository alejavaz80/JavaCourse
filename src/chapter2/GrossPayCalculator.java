package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {

        //1. Get the number of hours worked

        System.out.println("Please enter hours worked:");
        // **** User input ****
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Please enter the employee pay rate");
        double rate = input.nextDouble();

        // **** close after use ****
        input.close();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display results
        System.out.println("Gross pay due to employee: $" + grossPay);

    }
}
