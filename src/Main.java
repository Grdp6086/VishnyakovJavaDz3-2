public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        int weight = 98; // масса тела в кг
        double height = 1.87; // рост в м
        double bodyMassIndex = service.calculate(weight, height);
        int printBmi = (int) bodyMassIndex;

        System.out.println("Индекс массы тела " + printBmi);


    }
}