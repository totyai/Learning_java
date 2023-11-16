package Challanges.linkedinLearning.basic_banking_challanges;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class Basic_account {
    private String firstName;
    private String lastName;
    private LocalDate creationDate;
    private double balance;
    private double interestRate;

    public Basic_account(){
        creationDate = LocalDate.now();
    }

    public Basic_account(String firstName,String lastName,LocalDate creationDate, double balance, double interestRate){
        setBalance(balance);
        setCreationDate(creationDate);
        setFirstName(firstName);
        setInterestRate(interestRate);
        setLastName(lastName);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getBalance() {
        return balance;
    }
    public LocalDate getCreationDate() {
        return creationDate;
    }
    public String getFirstName() {
        return firstName;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public String getLastName() {
        return lastName;
    }

    public void makeDeposit(){
       try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much money do you want to make as deposit?");
        double deposit = scanner.nextDouble();
        setBalance(getBalance() + deposit);
        System.out.println("Thank you. Your new balance is: " + getBalance());
       } catch (Exception e) {
        // TODO: handle exception
        System.out.println("Sorry, the minimum amount to deposit is 30.000 HUF. Please try again.");
        makeDeposit();
       }
        
    }

    public void withdrawMoney(){
       double balance = getBalance();
        String retry = "No";
        Double withdrawAmount;
        do{
        System.out.println("How much money do you want to withdraw?");
        Scanner scanner = new Scanner(System.in);
        withdrawAmount = scanner.nextDouble();
            if(getBalance()>withdrawAmount){
            balance = balance - withdrawAmount;
            setBalance(balance);
            System.out.println("Thank you. You made a successfull withdraw of " + withdrawAmount + " money." + 
            "\nYour new balance is: " + getBalance());
            retry = "No";
        } else {
            System.out.println("You want to make a withdraw which is more then your balance. Do you want to try again? (Yes/No)");
            Scanner scanner1 = new Scanner(System.in);
            retry = scanner1.nextLine();
        }
        }while(retry.matches("Yes"));
        System.out.println("Transaction sucessfull. Your new balance is: " + balance);
    }

    public void checkBalance(){
        System.out.println("Your balance is: " + getBalance());
    }
}
