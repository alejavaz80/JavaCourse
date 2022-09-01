package chapter3;

import java.util.Scanner;

public class IfElseIfClassScore {

    public static void main(String[] args) {

        System.out.println("Please enter your score:");
        Scanner input = new Scanner(System.in);
        double score = input.nextDouble();

        char grade;

        if(score < 6){
            grade='F';
        } else if (score < 7) {
            grade='D';
        }else if (score < 8){
            grade='C';
        } else if (score < 9) {
            grade='B';
        }else{
            grade='A';
        }

        System.out.println("Your grade is:" +grade);

    }
}