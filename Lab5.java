
/**
 * @author Nikita Patel
 * @version 2/2/2018
 */
//import java.util.Scanner class
import java.util.Scanner;
public class Lab5
{
    //
    public static void main(String[] args)  {

        // Test your methods by calling them here
        // Should run your method
        getRichQuick();
        // Will call your method with a parameter. Now display the return value from your method        
        double taylorResult = eTaylor(5);
        // test your method
        palindromeCheck(); 
        Menu();
    }

    // Part 1
    public static void getRichQuick() {
        // Declare your variables here and implement your logic
        //days is a variable that is assigned to an integer
        int days = 1;
        //totalDollars is a vario
        double totalDollars = 1;
        System.out.println("Day "+ days + ": $" + totalDollars);
        while (totalDollars <= 1000000) 
        {
            System.out.printf("Day %d: $%.2f + ($1 + %.2f)= $", days, 
                totalDollars, (totalDollars/2));
            totalDollars = totalDollars + 1 +(totalDollars/2);
            System.out.printf("%.2f\n", totalDollars);
            days++;
        }        
    }

    // Part 2 
    public static double eTaylor( double x ) {
        int n = 3;
        int power = 2;
        double ex = 1 + x;
        while(power <= n)
        {
            ex = ex + eTaylorxn(x,power) / eTaylorFactorial(power);
            power++;
        }

        System.out.println("eTaylor: " + ex);
        return ex;
    }

    // Helper function for eTaylor
    public static double eTaylorxn( double x, int n ) 
    {
        double xn = x;
        while(n > 1)
        {
            xn = xn * x;
            n = n-1;
        } 

        return xn;
    }

    // Helper function for eTaylor
    public static double eTaylorFactorial(int n)
    {
        int fact = n;
        while(n > 2)
        {
            fact = fact * (n - 1); 
            n = n - 1;
        }

        return fact;
    }
    
    // Part 3
    /**
     * This program reads words, identifies, counts and writes all the palindromes and the total
     * palindrome count.
     */
    public static void palindromeCheck(){

        // you could use any of the words below to test your method:
        // banana, sneeze, radar, roof, kayak, mine, racer, racecar, refer, james, joyce
        // tattarrattat, toyota, madam, goodbye

        // Stores words read from user input     
        String someWord = ""; 
        // keeps track of Palindrome words only (define algorithm to count # of palindrome words
        int palindromeCount = 0; 
        // Counts the total number of lines read from the given text file
        int total = 0;        
        System.out.println(" Enter some words separated by white space");    // Ask for user input

        // declare your Scanner object here
        Scanner keyboard = new Scanner("abcba abccba defdef");

        // hint 1: Using keybord.next() will only return what comes before a space.
        // keyboard.nextLine(); //automatically reads the entire current line.

        // for each word user enters
        while (keyboard.hasNext()) {
            // store each word in a string variable and then do your operations
            someWord = keyboard.next();
            // increment number of words as you read each one
            total++;                             
            if(IsPalindrome(someWord))
            {
                palindromeCount++;
            }
            // #1. Code your logic for how to determine if a word is Palindrome first, then complete # 2
            // test
        }

        System.out.println("There are " + palindromeCount + " out of " + total + " words provided by user");   
        // if encountered ENTER then close scanner stream and terminate
        keyboard.close();

        // x is a variable for count and y is variable total
        // #2. print “There are x palindromes out of y words” 

    }

    //Helper function to check if the word is palindrome
    public static boolean IsPalindrome(String word)
    {
        //n is a integer variable that is equal to the word length
        int n = word.length();
        //for loop is used
        for(int i = 0 ; i < n/2 ; i++)
        {
            if(word.charAt(i) != word.charAt(n-i-1))
            {
                return false;
            }
        }

        return true;        
    }
    
    // Part 4 goes here, write a menu using the following specifications

    //Welcome to Lab5!
    //Enter 1 to check how long it takes to get rich on a magic dollar coin. 
    //Enter 2 to calculate e^x for any real x. 
    //Enter 3 to enter palindrome words.
    //Enter 4 to re-print the menu. 
    //Enter 0 to exit. 
    public static void Menu()
    {
        //print statements
        System.out.println("Welcome to Lap5");
        System.out.println("Enter 1 to check how long it takes to get rich on a magic dollar coin.");
        System.out.println("Enter 2 to calculate e^x for any real x.");
        System.out.println("Enter 3 to enter palindrome words.");
        System.out.println("Enter 4 to re-print the menu.");
        System.out.println("Enter 0 to exit.");
        System.out.println("What is your choice?");

        while(true)
        {
            //calling scanner keyboard
            Scanner keyboard = new Scanner(System.in);
            //num is an integer
            int num = keyboard.nextInt();

            //if num is not 0
            if(num != 0)
            {
                //switch statement
                switch(num)
                {
                    //4 casses and a default statement are used
                    case 1: 
                    getRichQuick();
                    break;
                    case 2:
                    System.out.println("Enter an x:");
                    Scanner keyboard1 = new Scanner(System.in);
                    double x = keyboard1.nextDouble();
                    eTaylor(x);
                    break;
                    case 3:
                    palindromeCheck();
                    break;
                    case 4:
                    Menu();
                    break;            
                    default:
                    break;
                }   
            }
            else
            {
                break;
            }
        }    

        System.out.println("Thanks for participating! Goodbye.");

    }
    // -- Sample outputs, delete these after completing the lab and verifying your output --
    //What is your choice? 3        
    //Enter an x: 1 e^1 = 2.7182818284590452  
    //What is your choice? 0 
    //Thanks for participating! Goodbye. 

}
