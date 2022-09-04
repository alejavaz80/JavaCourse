package chapter7;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {


    public static void main(String[] args) {

        Random randomNum = new Random();
        int[] numArray = new int[randomNum.nextInt(1,20)];
        System.out.println("Array lenght: " + numArray.length);
        for (int i = 0; i<numArray.length; i++){
            numArray[i] = randomNum.nextInt(1,100);
            //System.out.println(numArray[i]);
        }
        Arrays.sort(numArray);
        for (int i = 0; i<numArray.length; i++){
            System.out.println(numArray[i]);
        }

    }

    /*


    // ENHANCED LOOP
    public static boolean search(int[] array){
        for (int value : array){
            if (value == numberToSeachFor){
                return true;
            }
        } return false;
    }

     */

}
