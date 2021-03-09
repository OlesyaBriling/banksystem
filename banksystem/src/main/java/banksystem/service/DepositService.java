package banksystem.service;

import banksystem.entity.Account;
import banksystem.entity.Bill;

public class DepositService {

    public void deposit(Account account, int amount) {
        Bill bill = account.getBill();
        int currentBillAmount = bill.getAmount();
        System.out.println("Операция выполняется, текущее состояние счета: " + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Операция выполнена, текущее состояние счета: " + bill.getAmount());
    }
}
