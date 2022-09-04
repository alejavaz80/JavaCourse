package Ejercicios.cakesinheritance;

public class BirthDayCake extends Cake{

    private int candles;

    public BirthDayCake(String flavor, double price, int candles){
        super(flavor, price);
        setCandles(candles);
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
