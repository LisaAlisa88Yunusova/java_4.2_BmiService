public class BmiService {
    public double calculate(double h, double w) {
        double count;
        count = w / Math.pow(h / 100, 2);
        double result = Math.round(count * 10d) / 10d;
        return result;
    }
}
