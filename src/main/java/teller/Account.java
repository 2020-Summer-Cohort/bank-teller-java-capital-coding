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

    public Double getAccountBalance(){return accountBalance;}

    public void depositMoney(double amountToDeposit) {
        accountBalance += amountToDeposit;
    }

    public void withdrawMoney(double amountToWithdraw) {
        accountBalance -= amountToWithdraw;
    }





}
