package teller;

import java.util.HashMap;
import java.util.Map;

public class BankingApp {

    public static void main(String[] args) {


        Accounts account1 = new Accounts("A1234", "Checking", 23.95);

        System.out.println(account1.getAccountBalance());
        account1.deposit(10.00);
        System.out.println(account1.getAccountBalance());



    }
}
