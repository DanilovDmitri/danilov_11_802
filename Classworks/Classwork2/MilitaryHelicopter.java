public class MilitaryHelicopter extends Helicopter {

    protected boolean invisible;
    protected boolean waterTakeOff;

    MilitaryHelicopter( int number, double takeOffSpeed, double kmWithoutRefuelling, int countOfWheels, boolean cityTransport,
                        double heightOfFlying, boolean invisible, boolean waterTakeOff) {
        super (number, takeOffSpeed, kmWithoutRefuelling, countOfWheels, cityTransport, heightOfFlying);
        this.invisible = invisible;
        this.waterTakeOff = waterTakeOff;
    }

    @Override
    public void bodyRepair () {
        bodyHealth = true;
        debtForRepairInDollars += 1600;
    }

    @Override
    public void flyingElementRepair () {
        flyingElementHealth = true;
        debtForRepairInDollars += 1400;
    }

    @Override
    public void wheelRepair() {
        debtForRepairInDollars +=(countOfWheels-countOfUsingWheels)*450;
        countOfUsingWheels = countOfWheels;
    }

    public void invisibleActivated () {
        if (this.invisible==true) {
            System.out.println ("You can't see me");
        }
    }
}
