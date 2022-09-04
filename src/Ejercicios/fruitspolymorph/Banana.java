package Ejercicios.fruitspolymorph;

public class Banana extends Fruits {

    public Banana(int calories){
        super(calories);
    }

    public void peel(){
        System.out.println("The banana has been peeled");
    }

    @Override
    public void makeJuice(){
        System.out.println("Banana juice is strange");
    }

}