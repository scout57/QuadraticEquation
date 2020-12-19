import java.util.ArrayList;
import java.util.Collection;

public class DiscriminantSolver implements IQuadraticEquationSolver {


    public Collection<Double> solve(IQuadraticEquation equation) {
        Collection<Double> solves = new ArrayList<Double>();

        double D = discriminant(equation);

        if (D > 0) {
            solves.add(getX1(equation, D));
            solves.add(getX2(equation, D));
        } else if (D == 0) {
            solves.add(getX(equation));
        }

        return solves;
    }

    private double discriminant(IQuadraticEquation equation) {
        return Math.pow(equation.getB(), 2) - 4 * equation.getA() * equation.getC();
    }

    private double getX1(IQuadraticEquation equation, double D) {
        return (-equation.getB() - Math.sqrt(D)) / (2 * equation.getA());
    }

    private double getX2(IQuadraticEquation equation, double D) {
        return (-equation.getB() + Math.sqrt(D)) / (2 * equation.getA());
    }

    private double getX(IQuadraticEquation equation) {
        return -equation.getB() / (2 * equation.getA());
    }
}
