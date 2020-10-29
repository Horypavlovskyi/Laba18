package com.company;

public class UserBank {
    private static MoneyTransactionUtil.Card card1;
    private static MoneyTransactionUtil.Card card2;

    public static void main(String[] args) {

        try {
            MoneyTransactionUtil.sendTo(card1, card2, 300);
        } catch (RuntimeException e) {
            System.out.println("При обработке транзакции банка произошла ошибка");
        }
    }
}
