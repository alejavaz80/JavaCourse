package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class LoopsDieRolls {

    public static void main(String[] args) {

        final int SPACES = 20;
        final int DIEROLLS = 5;

        Scanner input = new Scanner(System.in);
        Random dieThrow = new Random();

        int dice_thorws = 1;
        int landedSpace = 0;
        do{
            System.out.println("Roll the dice for your throw #" + dice_thorws);
            int space = dieThrow.nextInt(1,6);
            System.out.println("Dice: " + space);
            landedSpace = landedSpace + space;
            System.out.println("You are currently on space: **"+ landedSpace + "**");

            if(landedSpace == SPACES){
                System.out.println("Congratulations you won");
                break;
            } else if (landedSpace > SPACES || landedSpace < SPACES && dice_thorws == DIEROLLS) {
                System.out.println("Sorry.. you loose");
                break;
            } else {
                dice_thorws++;
            }
        }while(dice_thorws <= DIEROLLS);
    }
}
