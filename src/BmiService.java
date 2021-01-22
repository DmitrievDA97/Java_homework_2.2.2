public class BmiService {
    public double calculate(double height, int weight) {
        double bmi = weight / (height * height);
        return bmi;
    }
}
