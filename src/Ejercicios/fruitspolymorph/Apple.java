package Ejercicios.fruitspolymorph;

public class Apple extends Fruits {

    public Apple(int calories){
        super(calories);
    }

    public void removeSeeds(){
        System.out.println("Apple seeds removed");
    }

    /*
     LA CLASE DE EL PADRE MAKEJUICE() ESTA DECLARADA EN LA CLASE PADRE DE FRUITS
     POR ENDE AL HACER OVERRIDE SOLAMENTE HACE LO QUE ESTE EN LA CLASE HIJA
     EL ADORNADOR ES OPCIONAL
     */

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is good");
    }
}
