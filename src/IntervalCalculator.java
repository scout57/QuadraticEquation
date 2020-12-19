import java.util.ArrayList;
import java.util.Collection;

public class IntervalCalculator {

    private IEquation equation;


    public IntervalCalculator(IEquation equation) {
        this.equation = equation;
    }

    public void setEquation(IEquation equation) {
        this.equation = equation;
    }

    public ArrayList<Interval> getIntervals(double a, double b, double e) {

        ArrayList<Interval> collection = new ArrayList<Interval>();

        // Определить первоначальное направление
        double border = a;
        double prev = this.equation.f(border);
        double current = this.equation.f(border + e);
        boolean isPositive = (current >= prev);


        // Пройтись по всем отрезкам (шаг e)
        for (double x = a + e; x <= b; x += e) {
            prev = this.equation.f(x);
            current = this.equation.f(x + e);

            // Если перелом направления, то добавить интервал
            if ((current < prev && isPositive) || (current > prev && !isPositive)) {
                collection.add(new Interval(border, x, isPositive));
                border = x;
                isPositive = !isPositive;
            }

        }

        // Не забыть закрыть последний интервал
        if (border != b) {
            collection.add(new Interval(border, b, isPositive));
        }

        return collection;
    }

}
