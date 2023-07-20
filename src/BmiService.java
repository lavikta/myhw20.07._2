public class BmiService {
    public int calculate(double height, int weight) {
        double bmIndex = height * 100 / weight;
        return bmIndex;
    }
}

