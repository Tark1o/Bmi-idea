public class BmiService {
    public long calculate(double height, int weight) {
        long calculate = (long) (weight / (height * height));
        return calculate;
    }

}
