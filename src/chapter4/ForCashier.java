package chapter4;

import java.util.Scanner;

public class ForCashier {

    public static void main(String[] args) {

        System.out.println("Enter number of items:");
        Scanner input = new Scanner(System.in);
        double items = input.nextDouble();

        double total = 0;

        for (int i=1; i<=items; i++ ){
            System.out.println("Enter cost of item "+ i +" :");
            double itemCost = input.nextDouble();
            total = total + itemCost;
        }

        System.out.println("You total is : $" +total);


    }

}
