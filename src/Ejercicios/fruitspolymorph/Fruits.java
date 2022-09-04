package Ejercicios.fruitspolymorph;

public class Fruits {

    private int calories;

    public Fruits(int calories){
        setCalories(calories);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("Juice is made");
    }
}
