public class Main {

    public static void main(String[] args) {
        IntegerArrayList array = new IntegerArrayList();
        for (int i = 0; i < 11; i++) {
            array.plusElement(10*i);
        }
        array.print();
        System.out.println(array.countOfElements());
        array.delete(0);
        array.print();
        array.reversing();
        array.print();
        array.sorting();
        array.print();
        array.findIndex(5);
        array.print ();
        IntegerArrayList array2 = new IntegerArrayList();
        for (int i = 10; i > 5  ; i--) {
            array2.plusElement(i);
        }
        array2.print();
        array.addOtherArray(array2);
        array.print();
        array.sorting();
        array.print();
        System.out.println(array.findIndex(5));
    }
}