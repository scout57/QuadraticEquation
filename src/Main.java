import java.io.Console;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        // ax^2 + bx + c = 0
        double a = 1;
        double b = 0;
        double c = -4;
        // [from; to]
        double from = -5;
        double to = 5;
        double epsilon = 0.05;

        // Само уравнение
        QuadraticEquation e = new QuadraticEquation(a, b, c);

        // Нахождение корней
        solve(e);

        // Поиск макс/мин
        extremes(e,from,to,epsilon);

        // Поиск интервалов
        intervals(e,from,to,epsilon);


    }

    private static void solve(IQuadraticEquation equation) {

        DiscriminantSolver solver = new DiscriminantSolver();
        Collection<Double> solves = solver.solve(equation);

        System.out.println("Корни уравнения: " + solves);

    }

    private static void extremes(IEquation equation, double from, double to, double epsilon) {

        GoldenSection section = new GoldenSection(equation);

        double min = section.min(from, to, epsilon);
        double max = section.max(from, to, epsilon);

        System.out.println("Минимум: f(" + min + ") = " + equation.f(min));
        System.out.println("Максимум: f(" + max + ") = " + equation.f(max));
    }

    private static void intervals(IEquation equation, double from, double to, double epsilon) {

        IntervalCalculator calculator = new IntervalCalculator(equation);

        ArrayList<Interval> intervals = calculator.getIntervals(from, to, epsilon);

        System.out.println(intervals);

    }


}
