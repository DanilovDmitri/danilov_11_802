public class MilitaryAirplane extends Airplane {
    protected double heightOfShooting;
    protected double powerOfShooting;

    MilitaryAirplane (int number, double takeOffSpeed, double kmWithoutRefuelling, int countOfWheels,
                      boolean internationalFlying, int countOfPlaces, double height, double power) {
    super (number, takeOffSpeed, kmWithoutRefuelling, countOfWheels, internationalFlying, countOfPlaces);
    this.heightOfShooting = height;
    this.powerOfShooting = power;
    }

    @Override
    public void bodyRepair () {
        bodyHealth = true;
        debtForRepairInDollars += 2000;
    }

    @Override
    public void flyingElementRepair () {
        flyingElementHealth = true;
        debtForRepairInDollars += 2000;
    }

    @Override
    public void wheelRepair() {
        debtForRepairInDollars +=(countOfWheels-countOfUsingWheels)*500;
        countOfUsingWheels = countOfWheels;
    }

    public void shoot (MilitaryAirplane other) {
        other.bodyHealth = false;
        other.flyingElementHealth = false;
        other.countOfUsingWheels = 0;
    }
}
