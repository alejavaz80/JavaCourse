package Ejercicios;

import java.math.RoundingMode;
import java.util.Scanner;

public class MethodsPhoneBill {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter plan fee:");
        double fee = input.nextDouble();

        System.out.println("Please enter overage minutes used:");
        double minutes = input.nextDouble();
        double extraFee = calculateMinutes(minutes);
        double taxes = calculateTax(extraFee,fee);
        System.out.println("\n *** BILL *** \nFee: $"+fee + "\n" + "Overage: $" +extraFee + "\n" + "Taxes: $" +taxes + "\n" + "You are due to pay: $"+ (fee + extraFee + taxes));

    }

    public static double calculateMinutes(double minutes){
        return Math.round(minutes * .25);
    }

    public static double calculateTax(double extraFee, double fee){
        return ((extraFee + fee)*.15);

    }
}
