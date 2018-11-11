public class Rectangle extends Quadrangle {

    public Rectangle (double x, double y, double a, double b) {
        super (x, y, a, b, a, b);
    }

    @Override
    public double areaOfShape () {
        return a*b;
    }
}
