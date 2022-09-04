package Ejercicios.phonebilloop;

public class PhoneBill {

    private double overChargeMins;
    private double billTaxes;
    private double billOvercharge;
    private double billTotal;
    private final double TAXES = .17;
    private final double OVERCHARGE = .25;

    public double getOverChargeMins() {
        return overChargeMins;
    }
    public void setOverChargeMins(double overChargeMins) {
        this.overChargeMins = overChargeMins;
    }
    public double getBillTaxes() {
        return billTaxes;
    }
    public void setBillTaxes(double billTaxes) {
        this.billTaxes = billTaxes;
    }
    public double getBillOvercharge() {
        return billOvercharge;
    }
    public void setBillOvercharge(double billOvercharge) {
        this.billOvercharge = billOvercharge;
    }
    public double getBillTotal() {
        return billTotal;
    }
    public void setBillTotal(double billTotal) {
        this.billTotal = billTotal;
    }
    public double getTAXES() {
        return TAXES;
    }
    public double getOVERCHARGE() {
        return OVERCHARGE;
    }

    public void generateBill(GenerateBill currentBill){
        if(currentBill.getUsedMinutes() > currentBill.getPlanMinutes()){
            setOverChargeMins(currentBill.getUsedMinutes() - currentBill.getPlanMinutes());
        }else{
            setOverChargeMins(0);
        };
        setBillOvercharge(Math.round(getOverChargeMins() * OVERCHARGE));
        setBillTaxes((getBillOvercharge() + currentBill.getPlanFee())*this.TAXES);
        setBillTotal(getBillOvercharge()+getBillTaxes()+currentBill.getPlanFee());
        System.out.println("\n*** Itemized bill ***" +
                "\nPlan Used: "+ currentBill.getUsedPlan() +
                "\nMinutes Included: " + currentBill.getPlanMinutes() +
                "\nMinutes Used: " + currentBill.getUsedMinutes() +
                "\nPlan Fee: $"+ currentBill.getPlanFee() +
                "\nOvercharged minutes: " + getOverChargeMins() +
                "\nOvercharge Fee: $" + (getBillOvercharge()) +
                "\nTaxes: $" + String.format("%.2f", (getBillTaxes())) +
                "\nBill Total: $" + String.format("%.2f",(getBillTotal()))
        );
    }
}
