package chapter11;

public class Rectangle extends AbstractionShape{

    private double width;
    private double lenght;

    public Rectangle(double width, double lenght){
        setWidth(width);
        setLenght(lenght);
    }

    @Override
    double calculateArea() {
        return lenght * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }


}
