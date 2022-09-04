package Ejercicios.cakesinheritance;

public class WeddingCake extends Cake {

    private int tiers;

    public WeddingCake(String flavor, double price, int tiers){
        super(flavor, price);
        setTiers(tiers);
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
