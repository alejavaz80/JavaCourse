package Ejercicios.phonebilloop;

import java.util.Scanner;

public class Telcel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Welcome to TELCEL bill generator");
        System.out.println("Please enter your plan number 1 -> 3:");
        int plan = input.nextInt();
        System.out.println("Please enter your minutes used:");
        double minutesUsed = input.nextDouble();
        GenerateBill cuenta1 = new GenerateBill(plan,minutesUsed);
        PhoneBill factura1 = new PhoneBill();
        factura1.generateBill(cuenta1);
    }
}
