public class Main {
    public static void main(String[] args) {
        int initialAccount = 500;
        int depositAmount = 200;
        int bonus;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        }
        else {
            bonus = 0;
        }
        int balance = initialAccount + depositAmount + bonus;
        System.out.println("Баланс: " + balance + " руб. Бонус: " + bonus + " руб.");
    }
}