public class BmiService {
    public double calculate(int kg, double metres) {
        double result = (double) kg / (metres * metres);
        return result;
    }

}
