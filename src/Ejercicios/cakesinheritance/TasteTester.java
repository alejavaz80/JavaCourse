package Ejercicios.cakesinheritance;

public class TasteTester {

    public static void main(String[] args) {

        Cake cake1 = new Cake("Chocolate", 1567.67);
        BirthDayCake cake2 = new BirthDayCake("Vanilla", 1786.23, 8);
        WeddingCake cake3 = new WeddingCake("Strawberry", 890.25, 2);

        System.out.println(cake1.getFlavor() + " " + cake1.getPrice());
        System.out.println(cake2.getFlavor() + " " + cake2.getPrice()  + " " + cake2.getCandles());
        System.out.println(cake3.getFlavor() + " " + cake3.getPrice()  + " " + cake3.getTiers());
    }
}
