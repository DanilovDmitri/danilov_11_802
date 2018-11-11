public abstract class Transport {

    protected int registrationNnumber;
    protected boolean conditionForUsing;
    protected int debtForRepairInDollars;
    protected boolean bodyHealth;

    Transport (int number) {
        this.registrationNnumber = number;
        this.conditionForUsing = true;
        this.bodyHealth = true;
    }

    public int getRegistrationNnumber() {
        return registrationNnumber;
    }

    public void payDebt ( int sum) {
        if (sum>debtForRepairInDollars) {
            System.out.println("Too much money");
        }
        else {
            debtForRepairInDollars -=sum;
            System.out.println("Successfully payed");
        }
    }

    abstract void repair ();
}
