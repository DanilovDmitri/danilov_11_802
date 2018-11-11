public abstract class Quadrangle extends Shape {

    protected double a;
    protected double b;
    protected double c;
    protected double d;

    Quadrangle (double x, double y, double a, double b, double c, double d) {
        super (x,y);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double perimeterOfShape () {
        return a+b+c+d;
    }
}
