package banksystem.service;


import banksystem.entity.Account;
import banksystem.entity.Bill;

public class PaymentService {


    public void pay(Account account, int amount) {
        Bill bill = account.getBill();

        if (bill.getAmount() < amount) {
            System.out.println("Платеж невозможен, недостаточно средств");
        }
        else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Операция выполняется, текущее значение счета: " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж совершен, текущее состояние счета: " + bill.getAmount());
        }


}
}
