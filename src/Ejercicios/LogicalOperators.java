package Ejercicios;

import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double result;

        System.out.println("You will need to get to 10 pesos");
        System.out.println("Please add .10 coins");
        double cents = (input.nextDouble() * .10);

        System.out.println("Please add .50 coins");
        double cents50 = (input.nextDouble() * .50);

        System.out.println("Please add 1 coins");
        double peso = (input.nextDouble() * 1);

        System.out.println("Please add 2 coins");
        double doublepeso = (input.nextDouble() * 2);

        result = cents + cents50 + peso + doublepeso;

        if (result == 10){
            System.out.println("Congratulations the result is exact to 10 pesos");
        } else if (result < 10){
            result = 10 - result;
            System.out.println("Sorry.. you were short by " +result  + " pesos");
        }else{
            result = result - 10;
            System.out.println("Sorry.. you add " +result + " more");
        }
    }
}
