abstract class FlyingTransport extends Transport implements ConditionChecker, CrashOfAirTransport, RepairForFlyingTransport {
    protected double takeOffSpeed;
    protected double kmWithoutRefuelling;
    protected boolean flyingElementHealth;
    protected int countOfWheels;
    protected int countOfUsingWheels;

    FlyingTransport (int number, double takeOffSpeed, double kmWithoutRefuelling, int countOfWheels) {
        super(number);
        this.takeOffSpeed = takeOffSpeed;
        this.kmWithoutRefuelling = kmWithoutRefuelling;
        this.countOfWheels = countOfWheels;
        this.countOfUsingWheels = countOfWheels;
        this.flyingElementHealth = true;
    }

    @Override
    public void crashOfWheel () {
        countOfUsingWheels--;
    }

    @Override
    public void crashOfBody () {
        bodyHealth = false;
    }

    @Override
    public void crashOfFlyingElement () {
        flyingElementHealth = false;
    }

    @Override
    public void changeCondition () {
        if ((flyingElementHealth==true) && (bodyHealth==true) && (countOfUsingWheels==countOfWheels)) {
            conditionForUsing = true;
        }
    }
}
