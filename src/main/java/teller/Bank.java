package teller;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Bank {
    private final Map<String, Account> accounts = new HashMap<>();

    public Collection<Account> getAllAccounts(){
        return accounts.values();
    }
    public void openNewAccount(Account accountToOpen){
        accounts.put(accountToOpen.getAccountNumber(),accountToOpen);
    }
    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
    public void closeAccount(String accountNumber) {
        accounts.remove(accountNumber);
    }



}

