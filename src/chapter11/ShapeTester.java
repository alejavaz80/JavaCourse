package chapter11;

public class ShapeTester {

    public static void main(String[] args) {

        AbstractionShape rectangle1 = new Rectangle(15,39);

        rectangle1.print();
        System.out.println(rectangle1.calculateArea());
    }
}
