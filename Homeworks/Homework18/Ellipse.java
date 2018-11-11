public class Ellipse extends Shape {

    protected double bigRadius;
    protected double smallRadius;

    Ellipse (double x, double y, double bigRadius, double smallRadius) {
        super (x,y);
        this.bigRadius = bigRadius;
        this.smallRadius = smallRadius;
    }

    @Override
    public double perimeterOfShape () {
        return Math.PI*bigRadius*smallRadius;
    }

    @Override
    public double areaOfShape () {
        return Math.PI*(bigRadius+smallRadius);
    }
}
