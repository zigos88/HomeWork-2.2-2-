public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 77;
        double length = 1.7;
        double bmi = service.calculate(mass, length);
        System.out.println(bmi + " kg/m2");
    }
}




















