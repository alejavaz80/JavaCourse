package Ejercicios.animalsAbstraction;

// AL TENER UN METODO ABSTRACTO LA CLASE SE HACE ABSTRACTA
public abstract class Animal {

    // ESTE METODO ES ABSTRACTO.. A HUEVO SE TIENE QUE AGREGAR
    public abstract void makeSound();

    // ESTE METODO NO ES ABSTRACTO .. POR ENDE NO SE REQUIERE AL CREAR LA CLASE
    public void eat(){
        System.out.println("Im eating");
    }



}
