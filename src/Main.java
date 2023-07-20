public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        double height = 1.87; // рост
        int weight = 98; // вес
        int bmiService = bmiService.calculate(height, weight);
    }

}
