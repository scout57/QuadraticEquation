public class GoldenSection {

    final double PHI = (1 + Math.sqrt(5)) / 2;

    private IEquation equation;


    public GoldenSection(IEquation equation) {
        this.equation = equation;
    }

    public void setEquation(IEquation equation) {
        this.equation = equation;
    }

    public double min(double a, double b, double e) {
        double x1, x2;
        while (true) {
            x1 = b - (b - a) / PHI;
            x2 = a + (b - a) / PHI;
            if (this.equation.f(x1) >= this.equation.f(x2))
                a = x1;
            else
                b = x2;
            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }

    public double max(double a, double b, double e) {
        double x1, x2;
        while (true) {
            x1 = b - (b - a) / PHI;
            x2 = a + (b - a) / PHI;
            if (this.equation.f(x1) <= this.equation.f(x2))
                a = x1;
            else
                b = x2;
            if (Math.abs(b - a) < e)
                break;
        }
        return (a + b) / 2;
    }
}
