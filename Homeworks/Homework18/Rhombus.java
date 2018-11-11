public class Rhombus extends Quadrangle {

    private double angle;
    private double a;

    Rhombus (double x, double y, double a, double angle) {
        super (x, y, a, a, a, a);
        this.angle=angle;
    }

    @Override
    public double areaOfShape () {
        return a*a*Math.sin(angle);
    }
}
