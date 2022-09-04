package Ejercicios;

import java.util.Scanner;

public class StringsPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username = "alejavaz";
        String password = "AlexVaz@1980";

        System.out.println("Please enter a new password:");
        String newPassword = input.next();


        if (passwordValidation(newPassword, username, password)){
            System.out.println("Password accepted");
        }else{
            System.out.println("Invalid password");
        }



    }

    public static boolean passwordValidation(String newPassword, String username, String password){

        if (newPassword.length() < 8 || newPassword.equals(password) || newPassword.contains(username) || !validateUpper(newPassword) || !validateSpecial(newPassword)) {
            return false;
        }else{
            return true;
        }
    }

    public static boolean validateUpper(String newPassword){
        char letter;
        for (int i=0 ; i <newPassword.length() ; i++){
            letter = newPassword.charAt(i);
            if(Character.isUpperCase(letter)){
                return true;
            }
        }
        return false;
    }

    public static boolean validateSpecial(String newPassword){
        if (newPassword.matches("[a-zA-Z0-9]*")){
            return false;
        }else{
            return true;
        }
    }
}
