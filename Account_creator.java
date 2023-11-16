package Challanges.linkedinLearning.basic_banking_challanges;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class Account_creator {
    //Ask in the begining if it has been created longer time ago?
    //Do you have initial balance?
    public static void main(String[] args) {
        Basic_account account;
        String accountType;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the account creator. Please select a bank account type you want to create: Checking or Saving?" + 
        "\nPlease type the type in for creation.");
        accountType = scanner.nextLine();

        if (accountType.matches("Saving")){
            account = new Saving_account();
            Basic_information(accountType, account);
        } else if (accountType.matches("Checking")){
            account = new Checking_account();
            Basic_information(accountType, account);
        } else {
            System.out.println("Sorry wrong input. Please start again.");
            return;
        }
       MakeTransactions(accountType, account);
       String question;
       do{ 
       System.out.println("Do you want to make a new transaction? (Yes or No)");
       question = scanner.next();
       question = question.toLowerCase();
       if(question.matches("yes")) {
        MakeTransactions(accountType, account);
       } else if(question.matches("no")){
        System.out.println("Thank you. The session has been closed.");
       } else {
        System.out.println("Wrong input. Session closed.");
       }
        }while(question.matches("yes"));
       scanner.close();
    }

    public static Basic_account Basic_information (String accountType, Basic_account account) {
        System.out.println("First we need a couple basic informaiton for creating the account. Please answer below.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your First Name?");
        String firstName = scanner.nextLine();
        account.setFirstName(firstName);
        System.out.println("What is your Last Name?");
        String lastName = scanner.nextLine();
        account.setLastName(lastName);
        System.out.println("Are you creating a fresh account (1) or do you want to use it to track your existing (2)?");
        int creationQuestion = scanner.nextInt();
        if(creationQuestion == 1){
            account.setCreationDate(LocalDate.now());
        } else{
            System.out.println("When did you create this account? (YYYY-MM-DD)");
            String input = scanner.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(input, formatter);
            account.setCreationDate(date);
            System.out.println("How much is your current balance on the account? (0=<)");
            double amount = scanner.nextInt();
            account.setBalance(amount);
        }
        System.out.println("Success! Your account is set with the following details: \n"
                + "Name: " + account.getFirstName() + " " + account.getLastName() +
                "\nAccount type: " + accountType +
                "\nInterest Rate: " + account.getInterestRate() +
                "\nInitial Balance: " + account.getBalance() +
                "\nCreation Date: " + account.getCreationDate());
        return account;       
    }

    public static void MakeTransactions(String accountType, Basic_account account){
        int transactionType;
        if (accountType.matches("Checking")){
            System.out.println("Please select a transaction: \n" +
            "Make deposit (1)" +
            "\nWithdraw money (2) \n" +
            "Check your balance (3)" +
            "\nMake purchase (4)");
            Scanner scanner = new Scanner(System.in);
            transactionType = scanner.nextInt();
            switch(transactionType){
                case 1 -> account.makeDeposit();
                case 2 -> account.withdrawMoney();
                case 3 -> account.checkBalance();
                case 4 -> ((Checking_account)account).purchases();
                default -> System.out.println("Wrong input!");
            }
        } else if (accountType.matches("Saving")){
            System.out.println("Please select a transaction: " +
            "\nMake deposit (1)" +
            "\nCheck your balance (2)" +
            "\nCheck accomulated interest (3)");
            Scanner scanner = new Scanner(System.in);
            transactionType = scanner.nextInt();
            switch(transactionType){
                //Make min. deposit ammount
                case 1 -> account.makeDeposit();
                case 2 -> account.checkBalance();
                case 3 -> ((Saving_account)account).CheckInterest();
                default -> System.out.println("Wrong input!");
            }
        } else {
            System.out.println("Wrong input!");
        }
        
    }
}
