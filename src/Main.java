public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int payment = 1200;

        int bonus;
        if (payment >= 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        System.out.println(" Вам начисленно " + bonus + " бонусов ");
        System.out.println(" Итого " + (balance + payment + bonus));


        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}