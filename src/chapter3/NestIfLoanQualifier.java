package chapter3;

import java.util.Scanner;

public class NestIfLoanQualifier {

    public static void main(String[] args) {

        int salaryRequired = 30000;
        int ageRequired = 2;

        System.out.println("Enter your salary:");
        Scanner input = new Scanner(System.in);
        double salary = input.nextDouble();

        System.out.println("Enter your years employed:");
        double employed = input.nextDouble();

        if (salary > salaryRequired){
            if (employed > ageRequired){
                System.out.println("Loan approved");
            }else{
                System.out.println("Job time not meet: Loan denied");
            }
        }else{
            System.out.println("Salary not meet. Loan denied");
        }
    }
}
