package Challanges.linkedinLearning;

import java.util.Scanner;

public class Decision_Structors {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's play a game!");
        System.out.println("The aim of the game is to reach 1 dollar by adding up change!");
        
        System.out.println("How many pennies do you want?");
        int pennies = scanner.nextInt();

        System.out.println("How many nickles do you want?");
        int nickles = scanner.nextInt();

        System.out.println("How many dimes do you want?");
        int dimes = scanner.nextInt();

        System.out.println("How many quaters do you want?");
        int quaters =scanner.nextInt();

        int total = pennies*1 + nickles*5 + dimes*20 + quaters*25;

        //System.out.println("Válasz (1) or váltás (2)?");
        //int question = scanner.nextInt();

        //switch(question){
          //  case 1:
                if (total == 100){
                    System.out.println("Congratulations! You won!");
                } else if(total > 100){
                    int over = total - 100;
                    System.out.println("Oh no! Your were over with "+ over + " cents!");
                } else {
                    int remain = 100 - total;
                    System.out.println("Oh no! you were " + remain +" cents short!");
            }
             //   break;
            //case 2:
                //System.out.println("This can not be with Switch!");
               // }
        }
    }

