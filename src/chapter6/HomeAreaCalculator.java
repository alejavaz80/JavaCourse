package chapter6;

public class HomeAreaCalculator {

    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle();
        firstRectangle.setLenght(7.3);
        firstRectangle.setWidth(4.5);
        System.out.println("Rectangle 1 area is: "+ firstRectangle.calculateArea());
        System.out.println("Rectangle 1 perimeter is: " +firstRectangle.calculatePerimeter());


        Rectangle secondRectangle = new Rectangle(3.8, 9.3);
        System.out.println("Rectangle 2 area is: "+ secondRectangle.calculateArea());
        System.out.println("Rectangle 2 perimeter is: " +secondRectangle.calculatePerimeter());

    }
}
