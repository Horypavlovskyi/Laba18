package com.company;

public class UserBank {
    private static MoneyTransactionUtil.Card card1;
    private static MoneyTransactionUtil.Card card2;


    public static void main(String[] args) {


        try {
            MoneyTransactionUtil.sendTov2(123124321, 4314314, 2_000);
            System.out.printf("Операция осуществлена успешно!");
        } catch (AccountException e) {
            System.out.println("Ошибка с реквизитами банка.\n" +
                    "Возможно, номер карты отправителя и получателя совпадают");
        }
        catch (MoneyValueExeption e) {
            System.out.println("Ошибка с суммой отправки.\n" +
                    "Сумма должна быть больше 0. Сумма не должна превышать лимит в 100 000");
        }
    }
}
