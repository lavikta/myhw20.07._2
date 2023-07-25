public class Main {
    public static void main(String[] args) {

        BmiService bmiService = new BmiService();
        double height = 1.63; // рост
        int weight = 63; // вес

        int bmiIndex = bmiService.calculate(height, weight);
        System.out.println("Body mass index: " + bmiIndex);
    }
}