public class Parking {
    int countOfPerkingPlaces;
    int [] places;

    Parking (int count) {
        this.countOfPerkingPlaces = count;
        this.places = new int [count];
    }

    public void enterTheParking (Transport transport) {
        int i = 0;
        while (i < this.countOfPerkingPlaces) {
            if (places[i]==0) {
                places[i] = transport.registrationNnumber;
                break;
            } i++;
        }
    }

    public void leaveTheParking (Transport transport) {
        for (int i = 0; i<this.countOfPerkingPlaces; i++) {
            if (this.places[i]==transport.registrationNnumber) {
                this.places[i]= 0;
            }
        }
    }

    public int getNumberOfPlace (Transport transport) {
        int number = 0;
        for (int i=0;i<this.countOfPerkingPlaces;i++) {
            if (this.places[i]==transport.registrationNnumber) {
                number=i+1;
            }
        }
        return number;
    }
}
