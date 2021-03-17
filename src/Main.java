public class Main {
    public static void main(String[] args) {
        int balance_client = 600; // баланс клиента
        int balance_amount = 1200; // клиент пополнил на эту сумму
        int bonus_balance; // переменная отвечающая за изменения баланса клиента
        if (balance_amount >= 1000) { //если пополнение баланса больше или равно 1000
            bonus_balance= balance_client + balance_amount + (balance_amount / 100); // тогда в переменную bonus_balance попадает сложение текущего баланса и пополнения, плюс, расчет акции 100 = 1
        } else {
            bonus_balance = balance_client + balance_amount; // если не равно, то balance_bonus попалняется только на текущим балансом + пополнением баланса
        }
        System.out.println("Ваш баланс = " + bonus_balance + " рублей" + "." + " Вы получили дополнительно по акции = " + balance_amount / 100 + " рублей."); // вывод конечно баланса, плюс, отдельный вывод составленной акции
    }
}