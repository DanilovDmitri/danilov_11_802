public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;
    private double angleAB;

    public Triangle (double x, double y, double a, double b, double c, double angleAB) {
        super (x, y);
        this.a = a;
        this.b = b;
        this.c = c;
        this.angleAB = angleAB;
    }

    @Override
    public double perimeterOfShape () {
        return a+b+c;
    }

    @Override
    public double areaOfShape () {
        return a*b*Math.sin (angleAB)/2;
    }
}
