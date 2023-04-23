package Challanges.linkedinLearning;

import java.util.Random;

public class Repetition_structors {
    public static void main(String[] args) {
        //Travel the entire game board of 20 spaces within five die rolls
        //Dobj random 5x és összeadjuk az előzővel, így a végére pont 20-t kell kapni, akkor nyerünk
        
        //Simulate to roll the die
        //import java.util.random;
        //Random random = new Random();
        //int die = random.nextInt(6) + 1;

        //1. Generate random number
        //2. Tell player which space they are on and how many more spaces they have to go
        //3. Repeat four times
        //4. If the player exectly at 20 wins
        //5. Out put the result

 
        int currentSpace = 0;

        Random random = new Random();
                
        for (int i=0; i<5; i++){
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            int spaceLeft = 20 - currentSpace;
            System.out.println("You rolled " + die + ", therefore you are on space " + currentSpace + ". You need "+ spaceLeft +" more to go.");
            //A kövi statement-tel placeholder-t csinálunk a variable-knek a %d-vel és sorba megadjuk azokat.
            //System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));
        }
        switch (currentSpace){
            case 20:
                System.out.println("Congratulations, you won! You reached exactly 20 spaces!");
                break;
            default:
                System.out.println("Sorry, you lost! You were at " + currentSpace + " instead of 20!");
        }
    }

}
