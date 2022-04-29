//////////////////////////////////////////////////////////////////////////////
//MarkAlan Mills
// CSC 160 Computer Science I, section 680
// Feb 18, 2022
// Homework 4 - Programming Exercise 5.49 (page 203) vowels
//////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");

        int V = 0; //vowel counter

        int C = 0; //consonant counter

        String user_input = input.nextLine(); //user input

        user_input = user_input.toLowerCase(); //convert string to lowercase to avoid uppercase scanning

        for(int i = 0; i<user_input.length(); i++) { //create i to go through each character in the string

            char ch = user_input.charAt(i); //turn user_input.charAt(i) into 'ch' to avoid extra typing

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') //adds 1 to the vowel counter if true
                 V++;

            else if(ch >= 'a' && ch <= 'z') //adds 1 to consonant counter if its not a vowel and is a letter
                 C++;
        }
        System.out.println("The number of vowels is "+ V +".\nThe number of consonants is "+ C +"."); //print output


    }
}
