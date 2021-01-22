public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double human1 = service.calculate(1.89, 70);
        System.out.println(human1);

        double human2 = service.calculate(1.79, 91);
        System.out.println(human2);

        double human3 = service.calculate(1.79, 70);
        System.out.println(human3);
    }
}
