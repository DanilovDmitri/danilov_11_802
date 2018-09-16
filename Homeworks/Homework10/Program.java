

import java.util.Scanner;

class Main {

    public static double f(double x) {
        return x * x;
    }

    public static double leftRiemannSums(double a, double b, int n) {
        double h = (b - a) / n;
        double result = 0;
        for (double x = a; x <= b; x = x +  h) {
            result = result + f(x) * h;
        }
        return result;
    }

    public static double rightRiemannSums(double a, double b, int n) {
        double h = (b - a) / n;
        double result = 0;
        for (double x = a+h; x <= b; x = x +  h) {
            result = result + f(x-h) * h;
        }
        return result;
    }
    public static double byMidpointSums(double a, double b, int n) {
        double h = (b - a) / n;
        double result = 0;
        for (double x = a+h; x <= b; x = x +  h) {
            result = result + f((x-h+x)/2) * h;
        }
        return result;
    }

    public static double byTrapezoidalRule(double a, double b, int n) {
        double result = 0;
        double h = (b - a) / n;
        double k = 0;
        for (double x = a+h; x <= b; x = x +  h) {
            k = k + f(x-h) * h;
        }
        double k1 = 0;
        for (double x = a; x <= b; x = x +  h) {
            k1 = k1 + f(x) * h;
        }
        result=(k+k1)/2;
        return result;
    }

    public static double bySimpsonRule(double a, double b, int n) {
        double result = 0;
        result=((b-a)/6)*(f(a)+4*f((a+b)/2)+f(b));
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        int n;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        n = scanner.nextInt();
        System.out.println("leftRiemannSums"+" "+leftRiemannSums(a, b, n)+" "+n);
        System.out.println("rightRiemannSums"+" "+rightRiemannSums(a, b, n)+" "+n);
        System.out.println("byMidpointSums"+" "+byMidpointSums(a, b, n)+" "+n);
        System.out.println("byTrapezoidalRule"+" "+byTrapezoidalRule(a, b, n)+" "+n);
        System.out.println("bySimpsonRule"+" "+bySimpsonRule(a, b, n)+" "+n);
    }
}