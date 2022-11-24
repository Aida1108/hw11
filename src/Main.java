public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int bank = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + bank;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total + " рублей");
        }
        // Задание 2
        System.out.println("Задание 2");
        int bank_Pr = 29000;
        int total_Pr = 0;
        for (int i = 1; i <= 12; i++) {
            total_Pr = total_Pr + total_Pr / 100;
            total_Pr = total_Pr + bank_Pr;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total_Pr + " рублей");
        }
    }
}