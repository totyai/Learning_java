package Challanges.linkedinLearning;

import java.util.Scanner;

public class TextProcessing {
    //Megnézi, hogy tartalmazza e: Uppercase letter, Special characters, username
    public static void main(String[] args) {
        
    String username = "johndoe";
    String currentPassword = "ABC_1234";
    int passwordLength = 8;
    boolean megvan;
    
    //Innen kell kezdődnie a while loop-nak
    Scanner scanner = new Scanner(System.in);
    
    do {
        System.out.println("Enter new password:");
        String newPassword = scanner.next();
        megvan = criteriaTest(newPassword, passwordLength, currentPassword,username);
    } while (megvan);
        System.out.println("You can use this password!");
    
    }

    public static boolean criteriaTest(String newPassword,int passwordLength,String currentPassword,String username){
        boolean specialChar = false;
        boolean uppercaseChar = false;
    //Check teljes szöveg: Hosszúság és ugyan az e?
    if(newPassword.length()>=passwordLength && !newPassword.equalsIgnoreCase(currentPassword) && !newPassword.contains(username)) {
        for (int i=0; i<newPassword.length(); i++){
            char c = newPassword.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
                specialChar = true;
            }
            if (Character.isUpperCase(c)){
                uppercaseChar = true;
                //It is special char és uppercase
            }
        } 
        
        if (specialChar && uppercaseChar){
            return false;
        } else {
            System.out.println("Not correct!(1)");
            return true;
        }
    } else {
        System.out.println("Not correct!(2)");
        return true;
    }}}
    