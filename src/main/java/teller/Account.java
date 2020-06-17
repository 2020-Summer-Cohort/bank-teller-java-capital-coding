package teller;

public class Account {

    private String accountNumber;
    private String accountType;
    private Double accountBalance;

    public Account(String accountNumber, String accountType, Double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }


    public void deposit(double amountToDeposit) {
        accountBalance += amountToDeposit;
    }

    public void withdrawal(double amountToWithdrawl) {
        accountBalance -= amountToWithdrawl;
    }

    public double checkAccountBalance() {
            return accountBalance;

    }


}
