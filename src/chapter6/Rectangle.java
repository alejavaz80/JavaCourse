package chapter6;

public class Rectangle {

    private double lenght;
    private double width;

    //Constructor
    public Rectangle(){
        lenght = 0;
        width = 0;
    }

    public Rectangle(double lenght, double width){
        setLenght(lenght);
        this.width = width;
    }

    // es double porque va a regresar un valor
    public double getLenght(){
        return lenght;
    }

    // Es void porque no regresa nada.. solo cambia el valor
    public void setLenght(double recLenght){
        this.lenght = recLenght;
    }

    public double getWidth(){
        return getWidth();
    }

    public void setWidth(double recWidth){
        this.width = recWidth;
    }

    public double calculatePerimeter(){
        return (2* lenght) + (2 * width);
    }

    public double calculateArea(){
        return ((lenght * width)/2);
    };
}
