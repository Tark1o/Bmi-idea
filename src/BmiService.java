public class BmiService {
    public double calculate(double height, int weight) {
        long calculate = (long) (weight / (height * height));
        return calculate;
    }

}
