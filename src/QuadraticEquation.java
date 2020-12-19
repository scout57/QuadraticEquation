public class QuadraticEquation implements IQuadraticEquation {

    final double PHI = (1 + Math.sqrt(5)) / 2;

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
            this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double f(double x) {
        return this.a * Math.pow(x, 2) + this.b * x + this.c;
    }



}
