package chapter2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Please enter a season of the year:");
        Scanner input = new Scanner(System.in);
        String season = input.next();

        System.out.println("Please enter how many cups of coffee you drink:");
        int cups = input.nextInt();

        System.out.println("Please enter a feeling:");
        String feel = input.next();

        System.out.println("On a " +feel + " " + season + " day, i drink a minimum of " + cups + " cups of coffee.");


    }
}
