package Challanges.linkedinLearning.basic_banking_challanges;

import java.util.Scanner;

public class Checking_account extends Basic_account{
    private double purchases;
    
    //Kell egy contructor
    //betenni a Basic account dolgait
    //Extend with other methods, specific for the checking account
    public Checking_account(){
        super();
        setInterestRate(0.02);
    }

    public Checking_account(double purchases){
        setPurchases(purchases);
    }

    public double getPurchases() {
        return purchases;
    }

    public void setPurchases(double purchases) {
        this.purchases = purchases;
    }

   
    public void purchases(){
        double balance = getBalance();
        String retry = "No";
        do{
        System.out.println("How much purchase did you make?");
        Scanner scanner = new Scanner(System.in);
        purchases = scanner.nextDouble();
            if(getBalance()>purchases){
            balance = balance - purchases;
            setBalance(balance);
            System.out.println("Thank you. You made a successfull purchase of " + purchases + " money." + 
            "\nYour new balance is: " + getBalance());
            retry = "No";
        } else {
            System.out.println("You want to make a purchase which is more then your balance. Do you want to try again? (Yes/No)");
            Scanner scanner1 = new Scanner(System.in);
            retry = scanner1.nextLine();
        }
        }while(retry.matches("Yes"));
}
}