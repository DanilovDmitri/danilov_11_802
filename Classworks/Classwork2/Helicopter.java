public class Helicopter extends FlyingTransport {
    protected boolean cityTransport;
    protected double heightOfFlying;

    Helicopter (int number, double takeOffSpeed, double kmWithoutRefuelling, int countOfWheels, boolean cityTransport, double heightOfFlying) {
        super(number, takeOffSpeed, kmWithoutRefuelling, countOfWheels);
        this.cityTransport = cityTransport;
        this.heightOfFlying = heightOfFlying;
    }

    @Override
    public void bodyRepair () {
        bodyHealth = true;
        debtForRepairInDollars += 800;
    }

    @Override
    public void flyingElementRepair () {
        flyingElementHealth = true;
        debtForRepairInDollars += 700;
    }

    @Override
    public void wheelRepair() {
        debtForRepairInDollars +=(countOfWheels-countOfUsingWheels)*225;
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
