public class Automachine extends Transport implements RepairForGroundTransportation, ConditionChecker, CrashOfGroundTransport {
    protected int countOfUsingWheels;
    protected int yearOfBuying;

    Automachine (int number, int year) {
        super (number);
        this.yearOfBuying = year;
        this.countOfUsingWheels = 4;
    }

    public void crashOfWheel () {
        countOfUsingWheels = countOfUsingWheels - 1;
        conditionForUsing = false;
    }

    public void crashOfBody () {
        this.bodyHealth = false;
    }

    @Override
    public void repair() {
        bodyRepair();
        wheelRepair();
        changeCondition();
    }

    @Override
    public void bodyRepair () {
        if (bodyHealth == false) {
            bodyHealth = true;
            debtForRepairInDollars += 500;
        }
    }

    @Override
    public void wheelRepair () {
        if (countOfUsingWheels<4) {
            debtForRepairInDollars += 100*(4-countOfUsingWheels);
            countOfUsingWheels = 4;
        }
    }

    @Override
    public void changeCondition () {
        if ((countOfUsingWheels == 4) && (bodyHealth == true)) {
            conditionForUsing = true;
        }
    }
}
