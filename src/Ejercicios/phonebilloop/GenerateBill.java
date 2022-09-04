package Ejercicios.phonebilloop;

public class GenerateBill {

    private int invoiceNumber;
    private int usedPlan;
    private double usedMinutes;
    private double planMinutes;
    private double planFee;
    private final int PLAN1COST = 50;
    private final int PLAN2COST = 100;
    private final int PLAN3COST = 150;
    private final int PLAN1MINS = 10;
    private final int PLAN2MINS = 20;
    private final int PLAN3MINS = 30;

    public GenerateBill(int plan, double usedMinutes){
        setInvoiceNumber();
        setUsedMinutes(usedMinutes);
        setUsedPlan(plan);
        switch (plan){
            case 1:
                setPlanFee(getPLAN1COST());
                setPlanMinutes(getPLAN1MINS());
                break;
            case 2:
                setPlanFee(getPLAN2COST());
                setPlanMinutes(getPLAN2MINS());
                break;
            case 3:
                setPlanFee(getPLAN3COST());
                setPlanMinutes(getPLAN3MINS());
                break;
            default:
                System.out.println("Invalid plan");
        }
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber() {
        this.invoiceNumber = this.invoiceNumber++;
    }

    public int getUsedPlan() {
        return usedPlan;
    }

    public void setUsedPlan(int usedPlan) {
        this.usedPlan = usedPlan;
    }

    public double getUsedMinutes() {
        return usedMinutes;
    }

    public void setUsedMinutes(double usedMinutes) {
        this.usedMinutes = usedMinutes;
    }

    public double getPlanMinutes() {
        return planMinutes;
    }

    public void setPlanMinutes(double planMinutes) {
        this.planMinutes = planMinutes;
    }

    public double getPlanFee() {
        return planFee;
    }

    public void setPlanFee(double planFee) {
        this.planFee = planFee;
    }

    public int getPLAN1COST() {
        return PLAN1COST;
    }

    public int getPLAN2COST() {
        return PLAN2COST;
    }

    public int getPLAN3COST() {
        return PLAN3COST;
    }

    public int getPLAN1MINS() {
        return PLAN1MINS;
    }

    public int getPLAN2MINS() {
        return PLAN2MINS;
    }

    public int getPLAN3MINS() {
        return PLAN3MINS;
    }
}
