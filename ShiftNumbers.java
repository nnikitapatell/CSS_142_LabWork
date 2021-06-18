import java.util.Scanner;
import java.util.*;

/**
 * Write a description of class ShiftNumbers here.
 *
 * @author Nikita Patel
 * @version 3/2/2018
 */
public class ShiftNumbers
{
    public static void main(String[] args) 
    {  
        //calls scanner keyboard
        Scanner keyboard = new Scanner(System.in);
        
        //the progrm will print Enter an integer, then press Enter
        System.out.println("Enter an integer, then press Enter");
        
        //N is an integer set to the next integer
        int N = keyboard.nextInt();
        
        //list of new integer in array
        List<Integer> a = new ArrayList<Integer>();

        //used for loop  because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than N
        //the body gets updated by adding 1 each time i goes through the body
        for (int i = 0; i < N; i++)
        {
            a.add(i+1);
        }

        //shifts numbers
        ShiftNumbers sn = new ShiftNumbers();
        //print shifted matrix of array a
        sn.printMatrix(a);
    }

    public void printMatrix (List<Integer> a) 
    {
        //integer m is set to the array size
        int m = a.size();

        //used for loop to find the countC because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than m
        //the body gets updated by adding 1 each time i goes through the body
        for (int i = 0; i < m; i++)
        {
            //the system will print +-
            System.out.print("+-");
        }
        
        //the program will print +
        System.out.println("+");

        //used for loop to find the countC because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than length of the sequence
        //the body gets updated by adding 1 each time i goes through the body
        for (int i = 0; i < m; i++)
        {
            //used for loop to find the countC because we know how many iterations we want
            //variable i is an integer and is initialized to 0
            //if i is less than length of the sequence
            //the body gets updated by adding 1 each time i goes through the body
            for (int j = i; j < m; j++)
            {
                //the program will print | will get j from array a 
                System.out.print("|" + a.get(j));
            }
            //used for loop to find the countC because we know how many iterations we want
            //variable i is an integer and is initialized to 0
            //if i is less than length of the sequence
            //the body gets updated by adding 1 each time i goes through the body
            for (int k = m; k > m - i; k--)
            {
                //the program will print | will get m - k from array a
                System.out.print("|" + a.get(m-k));
            }
            //the system will print |
            System.out.print("|");
            //the system will print a blank line
            System.out.println();

            //used for loop to find the countC because we know how many iterations we want
            //variable i is an integer and is initialized to 0
            //if i is less than length of the sequence
            //the body gets updated by adding 1 each time i goes through the body
            for (int l = 0; l < m; l++)
            {
                //The system will print +-
                System.out.print("+-");
            }
            //the system will print +
            System.out.println("+");
        }
    }
}