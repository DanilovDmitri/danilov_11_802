public class Airplane extends FlyingTransport {

    protected boolean internationalFlying;
    protected int countOfPlaces;

    Airplane (int number, double takeOffSpeed, double kmWithoutRefuelling, int countOfWheels, boolean internationalFlying, int countOfPlaces ){
        super(number, takeOffSpeed, kmWithoutRefuelling, countOfWheels);
        this.internationalFlying = internationalFlying;
        this.countOfPlaces = countOfPlaces;
    }

    @Override
    public void bodyRepair () {
        bodyHealth = true;
        debtForRepairInDollars += 1000;
    }

    @Override
    public void flyingElementRepair () {
        flyingElementHealth = true;
        debtForRepairInDollars += 1000;
    }

    @Override
    public void wheelRepair() {
        debtForRepairInDollars +=(countOfWheels-countOfUsingWheels)*250;
        countOfUsingWheels = countOfWheels;
    }

    @Override
    public void repair () {
        bodyRepair();
        wheelRepair();
        flyingElementRepair();
        changeCondition();
    }
}
