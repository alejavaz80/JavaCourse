package Ejercicios.animalsAbstraction;

public class Pig extends Animal{

    // SI ESTE METODO NO ESTA... NO SE PUEDE INICIALIZAR LA CLASE
    @Override
    public void makeSound(){
        System.out.println("Pig make a loud noise");
    }

    // EL METODO DE COMER YA LO HEREDO AUTOMATICAMENTE

}
