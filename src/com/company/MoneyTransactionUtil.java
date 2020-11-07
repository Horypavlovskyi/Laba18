package com.company;

//2. Использование throw
//        • Создать класс MoneyTransactionUtil
//        • Создать приватный конструктор.
//        • Создать статический метод для отправки денег с одного счета на другой:
//        sendTo(номерКарты, номерКарты, сумма).
//        • В методе следует обработать несколько возможных исключительных ситуаций:
//        • Если номер карты отправителя и карты получателя совпадают, нужно
//        выбросить RuntimeException. (throw new RuntimeException())
//        • Если сумма является нулевой, отрицательной или больше 100_000,
//        нужно выбросить RuntimeException. (throw new RuntimeException())
//        • Добавить ключевое слово throws и RuntimeException к объявлению метода.
//        • Если исключительных ситуаций нет, вывести на экран: «Сумма s, со счета n
//        успешно переведена на счет m»
//        • Создать класс UserBank методом main.
//        • В методе main вызвать метод sendTo.
//        • Обернуть вызов метода блоком try…catch
//        • В блоке catch для RuntimeException вывести сообщение: «При обработке
//        транзакции банка произошла ошибка»

import java.util.Scanner;

public class MoneyTransactionUtil {

    static class Card {
        public long getCardNumber() {
            return cardNumber;
        }

        public void setCardNumber(long cardNumber) {
            this.cardNumber = cardNumber;
        }

        public double getCardSum() {
            return cardSum;
        }

        public void setCardSum(double cardSum) {
            this.cardSum = cardSum;
        }

        @Override
        public String toString() {
            return "Card{" +
                    "cardNumber=" + cardNumber +
                    ", cardSum=" + cardSum +
                    '}';
        }

        private long cardNumber;
        private double cardSum;


        public Card(long cardNumber, double cardSum) {
            this.cardNumber = cardNumber;
            this.cardSum = cardSum;
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер карты отправителя: ");
        long cardPrivate = scanner.nextLong();
        System.out.println("Введите номер карты получателя: ");
        long cardMonobank = scanner.nextLong();
        System.out.println("Сумма перевода: ");
        double sumTransfer = scanner.nextDouble();

        Card card1 = new Card(cardPrivate, 10_000.00);
        Card card2 = new Card(cardMonobank, 0.00);

        sendTo(card1, card2, sumTransfer);

    }


    public static void sendTo (Card cardNew1, Card cardNew2, double sum) throws RuntimeException {
        if (cardNew1.cardNumber == cardNew2.cardNumber) {
            throw new AccountException ();
        }
        if (sum <= 0 || sum >= 100_000) {
            throw new MoneyValueExeption ();
        }
            cardNew1.cardSum = cardNew1.cardSum - sum;
            cardNew2.cardSum = cardNew2.cardSum + sum;
        System.out.println("Сумма " + sum + "," + " со счета № " + cardNew1.cardNumber +
                " успешно переведена на счет № " + cardNew2.cardNumber);
    }


    public static void sendTov2 (long cardNew1, long cardNew2, double sum) throws RuntimeException {
        if (cardNew1 == cardNew2) {
            throw new AccountException();
        }
        if (sum <= 0 || sum >= 100_000) {
            throw new MoneyValueExeption();
        }
    }

    private MoneyTransactionUtil() {
    }


    }




