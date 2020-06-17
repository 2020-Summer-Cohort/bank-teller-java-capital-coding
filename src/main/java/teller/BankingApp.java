package teller;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {


        Account account1 = new Account("A1234", "Checking", 23.95);

        System.out.println("Welcome to your personal bank teller! What would you like to do first?");
        System.out.println("");
        System.out.println("1 - Check your balance.");
        System.out.println("2 - Make a deposit.");
        System.out.println("3 - Withdraw from your account.");
        System.out.println("4 - Open a new account.");
        System.out.println("5 - Close your account.");
        System.out.println("0 - Exit the system.");
        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();


        if (userChoice == 1) {
            System.out.println("Your current balance is $" + account1.getAccountBalance() + ".");
            System.out.println("What would you like to do next?");
            scanner.nextInt();

        } else if (userChoice == 2) {
            System.out.println("How much would you like to deposit today?");
            double depositMoney = scanner.nextDouble();
            System.out.println("Your new balance is $" + (account1.getAccountBalance() + depositMoney) + ".");
            System.out.println("What would you like to do next?");
            scanner.nextInt();

        } else if (userChoice == 3){

            System.out.println("How much would you like to withdraw?");
            double withdrawMoney = scanner.nextDouble();
            System.out.println("Your new balance is $" + (account1.getAccountBalance() - withdrawMoney) + ".");
            System.out.println("What would you like to do next?");
            scanner.nextInt();

        }  else if (userChoice == 4){

            System.out.println("You have chosen to open a new account");
//          System.out.println("Please confirm by pressing Y or N.")
//          String openNewAccount = scanner.nextInt().
            scanner.nextInt();

        }  else if (userChoice == 5){

            System.out.println("You have chosen to close your account.");
//          System.out.println("Please confirm by pressing Y or N.");
//          account1.closeAccount(account1);
            scanner.nextInt();

        }  else if (userChoice == 0){

            System.out.println("You have chosen to exit the program.");
            System.out.println("Have a good day!");

        }

    }
}