public class ComplexNumber extends Number {
    protected double bi;

    public ComplexNumber (double a, double bi) {
        super(a);
        this.bi = bi;
    }

    @Override
    public void print () {
        System.out.println (this.a+"+"+this.bi+"*i");
    }

    @Override
    public double getModule() {
        return (Math.sqrt (a*a+bi*bi));
    }
}

