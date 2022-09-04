package chapter6;

public class OverloadMethods {

    public static void main(String[] args) {

        calculate("september");
        calculate(5);

    }

    public static int calculate(int month ){
        System.out.println("Month number is: " +month);
        return month;
    }

    public static String calculate(String month){
        System.out.println("Month name is: " +month);
        return month;
    }


}
