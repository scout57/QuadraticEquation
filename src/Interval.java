public class Interval {

    double from;
    double to;
    boolean positive;

    public Interval(double from, double to, boolean positive) {
        this.from = from;
        this.to = to;
        this.positive = positive;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    public boolean isPositive() {
        return positive;
    }

    public boolean isNegative() {
        return !positive;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "from=" + from +
                ", to=" + to +
                ", positive=" + positive +
                '}';
    }
}
