public class Main {
    public static void main(String[] args) {

        // Заводим начальные переменные //

        int balance = 500;                   // начальная сумма на счете
        int payment = 1500;                 // сумма пополнения


        int bonus;                       // начисленный БОНУС за пополнение

        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }

        //Итоговый счет//
        int total = balance + payment + bonus;

        //Выводим на экран сумму зачисления//
        System.out.println("Зачислено " + (payment + bonus) + " рублей, включая " + bonus + " бонусов. Итоговый счет " + total + " рублей");

    }
}
