public class Quaternion extends ComplexNumber {
    protected double cj;
    protected double dk;
    Quaternion (double a, double bi, double cj, double dk) {
        super (a,bi);
        this.cj = cj;
        this.dk = dk;
    }

    @Override
    public void print () {
        System.out.println (a+"+"+bi+"*i+"+cj+"*j+"+dk+"*k");
    }

    @Override
    public double getModule () {
        return Math.sqrt (a*a+bi*bi+cj*cj+dk*dk);
    }
}
