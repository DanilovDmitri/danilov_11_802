public class Main {
    public static void main (String args[]) {
        MilitaryAirplane monster = new MilitaryAirplane(123456, 400, 2000,
                20, false, 60, 100, 100);

        Parking parking = new Parking(100);

        parking.enterTheParking(monster);
        System.out.println(parking.getNumberOfPlace(monster));

        parking.leaveTheParking(monster);
        System.out.println(parking.getNumberOfPlace(monster));
    }
}
