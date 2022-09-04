package chapter6;

import java.util.Scanner;

public class HomeReturnObject {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        HomeReturnObject calculator = new HomeReturnObject();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();
        calculator.input.close();
        double houseArea = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.println("Total house area is: " + houseArea + " mt2");

    }

    public Rectangle getRoom(){

        double lenght = input.nextDouble();
        double width = input.nextDouble();

        return new Rectangle(lenght,width);
    };

    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }


}
