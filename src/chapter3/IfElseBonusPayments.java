package chapter3;

import java.util.Scanner;

public class IfElseBonusPayments {

    public static void main(String[] args) {

        int salary = 1000;
        int bonus = 250;

        System.out.println("How many sales you made this week?: ");
        Scanner input = new Scanner(System.in);
        int sales = input.nextInt();

        if (sales > 10){
            System.out.println("Payment due = $" + (salary+bonus));
        }else{
            System.out.println("Payment due = $" + (salary));
        }
    }

}
