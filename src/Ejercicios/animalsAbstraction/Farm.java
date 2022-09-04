package Ejercicios.animalsAbstraction;

public class Farm {

    public static void main(String[] args) {

        // NO SE PUEDE INSTANCIAR LA CLASE ANIMAL POR ENDE DEBE DE SER DE LA CLASE PATO
        Animal donald = new Duck();
        donald.makeSound();
        donald.eat();

        Duck donald2 = new Duck();
        donald2.makeSound();
        // LA CLASE COMER YA ESTA HEREDAD DE ANIMAL
        donald2.eat();

        Pig porky = new Pig();
        porky.makeSound();
        porky.eat();

    }

}
