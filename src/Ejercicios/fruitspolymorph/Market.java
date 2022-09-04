package Ejercicios.fruitspolymorph;

public class Market {

    public static void main(String[] args) {

        Fruits fruit1 = new Fruits(23);
        Apple apple1  = new Apple(85);
        Banana banana1 = new Banana(43);

        fruit1.makeJuice();
        System.out.println("");
        apple1.removeSeeds();
        apple1.makeJuice();
        System.out.println("");
        banana1.peel();
        banana1.makeJuice();
    }
}
