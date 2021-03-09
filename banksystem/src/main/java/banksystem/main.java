package banksystem;

import banksystem.entity.Account;
import banksystem.entity.Bill;
import banksystem.entity.Person;
import banksystem.service.DepositService;
import banksystem.service.PaymentService;
import banksystem.service.TransferService;

public class main {

    public static void main(String[] args) {

        Person olesyaPerson = new Person("Olesya" , "Briling", "+7894567345");
        Bill olesyaBill = new Bill(10000);
        Account olesyaAccount = new Account(olesyaPerson, olesyaBill);

        Person sashaPerson = new Person("Sasha", "Ivanov", "+890345365");
        Bill sashaBill = new Bill(20000);
        Account sashaAccount =  new Account(sashaPerson, sashaBill);

        PaymentService paymentService = new PaymentService();
        paymentService.pay(olesyaAccount, 1000);
        paymentService.pay(sashaAccount, 1500);

        DepositService depositService = new DepositService();
        depositService.deposit(olesyaAccount, 3000);

        TransferService transferService = new TransferService();
        transferService.transfer(sashaAccount, olesyaAccount, 30000);



    }
}
