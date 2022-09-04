package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGHT = 6;

    public static void main(String[] args) {

        int[] tickets = generateNumbers();
        readNumbers(tickets);

    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGHT];
        Random random = new Random();
        for(int i=0; i < ticket.length ; i++){
            ticket[i] = random.nextInt(1,50);
        }
        return ticket;
    }

    public static void readNumbers(int tickets[]){
        for (int i=0; i < tickets.length ; i++){
            System.out.println("Number " + (i+1) + " is " + tickets[i]);
        }
    }
}
