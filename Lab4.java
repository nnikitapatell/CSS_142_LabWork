/**
 * Write a description of class Lab4 here.
 * 
 * Nikita Patel
 * 1/26/2018
 */

import java.util.Scanner;
import java.lang.*;

public class Lab4 {
    /**
     * main method (driver) to execute all the method calls properly
     *
     * @param args
     */
    public static void main(String[] args) {
        //Call all methods here
        countGrains();
        powerOfTwo(64);
        numBackward(12345);
        straightLine(3);
        boxMaker();
        shape7a(5);
        shape7b(5);
    }

    /**
     * Calculates the number of grains and prints out the result 
     * per lab instructions
     */
    public static void countGrains() {
        //declare and initialize your variables first, if any
        //I don't observe anything unusual in my output when I run my 
        //code besides the fact that I don't use X and Y as my numbers.
        // declared variable totalGrains and grainsToday
        //both variables are equal to 1
        int totalGrains = 1; 
        int grainsToday = 1;
        //used for loop because we know how many iterations we want 
        //64 iteration
        for (int i = 1; i <= 64; i++)
        {
            //
            System.out.println("Day " + i  + " and you got " 
                + grainsToday + " grain(s) of rice for a total of " 
                + totalGrains + " grain(s)");
            grainsToday = i + i;
            totalGrains = grainsToday + totalGrains;
        }
    }

    /**
     * Determines if a number is power of 2 and displays result 
     * per lab instructions
     * @param numberInput
     */
    public static void powerOfTwo (int numberInput) {

        //declare and initialize your variables first, if any then start writing your code
        //use what we learned in branching exercise if/else statements
        
        //declared variable power and temp
        //power is set to 0
        //temp is set to the number of input
        int power = 0;
        int temp = numberInput;
        while(temp > 1)
        {
            if(temp % 2 == 0)
            {
                power = power + 1;
                temp = temp / 2;

                if(temp <= 1)
                {
                    System.out.println(numberInput + " is 2 to the power of " 
                    + power);
                    break;
                }
            }
            else
            {
                System.out.println(numberInput + " is not a power of 2");
                break;
            }
        }
    }

    /**
     * Reverses the digits of a given integer, i.e. 12345 would become 
     * 54321 per lab instructions
     * @param number
     */
    public static void numBackward(int inputNumber) {

        // declare and initialize your variables first, 
        //if any then start writing your code
        
        //declared variables: temp, r, reverseNumber

        //temp is set to inputNumber
        int temp = inputNumber;
        //r is set to 0
        int r = 0;
        //reverseNumber is set to 0
        int reverseNumber = 0
        while(temp != 0 )
        {
            r = temp % 10;
            reverseNumber = (reverseNumber * 10) + r;
            temp = temp / 10;
        }
        //
        if(reverseNumber == inputNumber)
        {
            System.out.println("backward: " + reverseNumber + ", palindrome!");
        }
        else
        {
            System.out.println("backward: " + reverseNumber + ", not palindrome!");
        }
    }

    /**
     * Produces and displays a straight line using asterisks 
     * per lab instructions
     */

    public static void straightLine(int size) {

        // declare and initialize your variables first, 
        //if any then start writing your code
        
        for(int i = 0 ; i < size ; i++)
        {
            for(int j = 0; j < size ; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    /**
     * void method that asks the user for an integer x (using Scanner), 
     * and prints box using asterisks refer to detailed instructions 
     * in lab description part 6
     */

    public static void boxMaker() {

        //declare and initialize your variables first, if any then start writing your code
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        for (int i = 0 ; i < size ; i++)
        {
            for(int j = 0; j < size ; j++)
            {
                if((i >= 1) && (i < size-1) && (j >= 1) && (j < size-1))
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*"); 
                }
            }

            System.out.println();
        }
        System.out.println();
    }

    /**
     *  void method to print a shape that is a triangular pattern 
     *  with sides of 6 asterisk refer to detailed instructions in lab description part 7a
     */

    public static void shape7a(int size) {

        // declare and initialize your variables first, if any then start 
        //writing your code
        //used the for loop
        for(int i = 0 ; i < size ; i++ )
        {
            for(int j = 0 ; j < size ; j++)
            {
                //if 
                if(j < i)
                {
                    System.out.print(".");
                }
                else
                {
                    System.out.print("*");
                }                
            }
            //print blank line
            System.out.println();
        }
        System.out.println();
    }

    /**
     * void method to print a shape that is an "X" pattern witharms of 3 
     * asterisks each refer to detailed instructions in lab description 
     * part 7b
     */

    public static void shape7b(int size) {

        // declare and initialize your variables first, if any then start writing your code
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size ; j++)
            {
                if(i==j || j == size-i-1)
                {
                    System.out.print("*");
                }                
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
        System.out.println();
    }    
} // end of class Lab4.  Good luck!
