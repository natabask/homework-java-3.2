public class Main {
    public static void main(String[] args) {
        // Создание объекта
        BmiService service = new BmiService();
        // Переменные: m - weight [kg], h - height [cm]
        int m = 60;
        int h = 170;
        // Вызов метода calculate: bmi - Body Mass Index [kg / sq.m]
        int bmi = service.calculate(m, h);
        //Вывод результата
        System.out.println("Your body mass index is " + bmi + " kg/sq.m");
    }
}
