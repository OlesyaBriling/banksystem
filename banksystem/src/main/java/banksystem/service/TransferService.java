package banksystem.service;

import banksystem.entity.Account;

public class TransferService {

    public void transfer(Account accountFrom, Account accountTo, int amount ) {
        int billFromAmmount = accountFrom.getBill().getAmount();
        int billToAmmount = accountTo.getBill().getAmount();

        if (billFromAmmount < amount) {
            System.out.println("Перевод неаозможен, не хватает средств");
        }
        else {
            System.out.println("С аккаунта " + accountFrom.getAccountHolder().getName() + " выполняется перевод на аккаунт " + accountTo.getAccountHolder().getName() );
            accountFrom.getBill().setAmount(billFromAmmount - amount);
            accountTo.getBill().setAmount(billToAmmount + amount);
            System.out.println("Перевод выполнен");
        }
    }
}
