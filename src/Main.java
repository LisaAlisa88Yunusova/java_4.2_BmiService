public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int height = 182;
        int weight = 102;
        double bmi = service.calculate(height, weight);
        System.out.println("Индекс массы тела: " + bmi + " кг/кв.м");
    }
}