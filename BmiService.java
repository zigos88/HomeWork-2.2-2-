public class BmiService {
    public double calculate(double mass, double length) {
        double bmi = mass / (length * length);

        return bmi;
    }

}


