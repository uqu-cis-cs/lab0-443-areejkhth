package edu.uqu.cs;
/*
 * Lab 0 
 * CS 1312
 *
 */

/*
* Make sure to complete and submit your lab
*/

import java.util.*;

public class App{


/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 20, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

public static final int LOWERBOUND = 1, UPPERBOUND = 20;

public static void twisters (){
    boolean printed;
    for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
        printed = false; 
        // Print "Tweetle" if number is divisible by 2

        if (number%2 == 0){

            System.out.print("Tweetle");

            printed = true; // processed!

        }
        // Print "Beetle" if number is divisible by 4

        if (number%4 == 0) {
            System.out.print("Beetle");
            printed = true; // processed!
        }

      
        // Print "Poodle" if number is divisible by 6
        if (number%6 == 0) {
            System.out.print("Poodle");
            printed = true; // processed!
        }
      
        // Print the number if it has not been processed
        if (!printed) {
            System.out.print(number);
        }
        
        // After processing the number, print a newline if it is divisible by 11;
        // else, print a space
      
        /*if (number%11 ==0)
            System.out.print("\n");
        else*/
            System.out.print(" ");
    }
    System.out.println();
}
/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
 public static String phoneKeypad (String str){
      
      char ch = str.charAt(0);
      
      String digit="";
      
      for (int i=0; i<str.length(); i++){
         ch = str.charAt(i);
         
         switch (ch) {
            case 'a': case 'b': case 'c': digit += "2"; break;
            case 'd': case 'e': case 'f': digit += "3"; break;
            case 'g': case 'h': case 'i': digit += "4"; break;
            case 'j': case 'k': case 'l': digit += "5"; break;
            case 'm': case 'n': case 'o': digit += "6"; break;
            case 'p': case 'q': case 'r': case 's': digit += "7"; break;
            case 't': case 'u': case 'v': digit += "8"; break;
            case 'w': case 'x': case 'y': case 'z': digit += "9"; break;
            default:
                  break;
         }

      }   
      System.out.println(digit);
      return digit;
   }   
   
    public static void main(String [] args) {
        

        /* Write your code here */

        String s = new String();
        
        Scanner scnr = new Scanner (System.in);
        
        s = scnr.nextLine().toLowerCase();
        
        String strTOdigit = phoneKeypad (s);

        twisters();

    }

}