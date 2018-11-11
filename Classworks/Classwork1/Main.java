public class Main {
    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1, 2);
        complexNumber.print();
        System.out.println(complexNumber.getModule());
        Number number = new Number(3);
        number.print();
        System.out.println(number.getModule());
        Quaternion quaternion  = new Quaternion(4, 5, 6, 7);
        quaternion.print();
        System.out.println(quaternion.getModule());
    }
}
