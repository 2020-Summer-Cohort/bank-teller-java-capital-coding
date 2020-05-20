package teller;

public class Accounts {
    private String accountNumber;
    private String accountType;
    private Double accountBalance;

    public Accounts (String accountNumber, String accountType, Double accountBalance){
        this.accountNumber= accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void deposit(Double amount){
        this.accountBalance += amount;
    }

    public void withdraw(Double amount){
        this.accountBalance -= amount;
    }
}
