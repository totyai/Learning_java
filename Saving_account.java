package Challanges.linkedinLearning.basic_banking_challanges;

import java.time.LocalDate;

public class Saving_account extends Basic_account{
    //- Max. number of withdraw
    //- Max. number of transfers
    //- Min. deposit
    public Saving_account(){
        super();
        setInterestRate(0.1);
    }

    public void CheckInterest(){
        int yearDifference = LocalDate.now().getYear() - getCreationDate().getYear();
        if (yearDifference > 0){
            double interestAmount = getBalance()*yearDifference*getInterestRate();
            setBalance(getBalance() + interestAmount);
            System.out.println("Your balance is: " + getBalance() + " with " + interestAmount + " interest!");
        } else {
            System.out.println("Your balance is: " + getBalance() + " with 0 interest!");
        }
    }

    //public void MinAmountDeposite(){
       // int minAmaountOfDep = 30000;
       // if(minAmaountOfDep<account.deposit){
       //     System.out.println("Sorry, the minimum amount to deposit is 30.000 HUF. Please try again.");
       //     makeDeposit();
       // }
       //S return numberOfDep;
    //}
}
