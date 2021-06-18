import java.util.*;

/**
 * Write a description of class Lab8 here.
 *
 * @author Nikita Patel
 * @version 02/23/2018
 */
public class Lab8
{
    /**
     * Exercise 1:
     * Write a function called median, that takes as parameter a full, sorted
     * array of doubles and returns the median of the list. For a sorted list of
     * odd length, the median is the middle value. For a sorted list of even
     * length, the median is the average of the two middle values. Make an example
     * function call in your main.
     */
    public static double median(double[] array) 
    {
        //number is a double variable set to 0.0
        double number = 0.0;

        //The if statement is for a sorted list for an odd length
        if(array.length % 2 != 0)
        {
            //number is set to an equation that finds the median which is the middle value
            number = array[array.length/2];
        }

        //if the array length is a remainder of 2 is equal to 0
        if(array.length % 2 == 0)
        {
            //number is set to and equation that finds the median which is the average of the two middle values
            number = (array[array.length / 2]+ array[array.length / 2 - 1]) / 2;
        }

        //the program will return number
        return number;
    }

    /**
     * Exercise 2:
     * Write a function called isSorted that takes an array of doubles as a 
     * parameter and returns true if the list is in sorted (non-decreasing) 
     * order and returns false otherwise.  Make an example function call in 
     * your main.
     * @param array
     * @return
     */
    public static boolean isSorted(double[] array) 
    {
        //curentNumber is a double variable set to array index 0
        double currentNumber = array[0];

        //used for loop to find the countC because we know how many iterations we want
        //variable i is an integer and is initialized to 1
        //if i is less than length of array minus 1
        //the body gets updated by adding 1 each time i goes through the body
        for(int i = 1; i > array.length  - 1; i++)
        {
            //if the currentNumber is greater than array at the index i
            if(currentNumber > array[i])
            {
                //other wise it return false 
                return false;
            }
            //the list is in sorted (non-decreasing)
            currentNumber = array[i];
        }

        //returns true if the list is in sorted (non-decreasing) order
        return true;
    }

    /**
     * Exercise 3:
     * Write a function called findCommon that takes three arrays of positive
     * integers as parameters. The first two array parameters are filled with
     * ints. Fill the third array parameter with all the values that are uniquely
     * in common from the first two arrays and the rest of the array with zeros.
     * For example:
     * 
     * a1[] contains: 3 8 5 6 5 8 9 2
     * 
     * a2[] contains: 5 15 4 6 7 3 9 11 9 3 12 13 14 9 5 3 13
     * 
     * common[] should contain: 3 5 6 9 0 0 0 0
     */
    public static void findCommon(int[] a1, int[]a2, int[] common) 
    {
        // your code here, this method requires some serious thinking before
        // implementing the logic

        //count is a integer variable set to 0
        int count = 0;

        //sort array a2
        Arrays.sort(a2);

        //used for loop because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than length of a1
        //the body gets updated by adding 1 each time i goes through the body
        for(int i = 0; i < a1.length; i++)
        {
            //used for loop because we know how many iterations we want
            //variable j is an integer and is initialized to 0
            //if j is less than length of a2
            //the body gets updated by adding 1 each time j goes through the body
            for(int j = 0; j < a2.length; j++)
            {
                //if array a1 of index i is equal to array a2 at index i was set t
                if(a1[i] == a2[j])
                {
                    //common array count is set to array a1 of i
                    common[count] = a1[i];
                    
                    //increments count
                    count++;

                    //if the number at index count of commman array is equal to the number at index i of a1
                    if(common[count - 1] == a2[i])
                    {
                        //decrements count
                        count--;
                    }
                }
            }
        }
    }

    /**
     * Exercise 4:
     * Write a function called rotateRight that takes an array of integers as 
     * an argument and rotates values in the array one to the right (i.e., one 
     * forward in position), shifting the value at the end of the array to the 
     * front. For example, if the array called list stores [3, 8, 19, 7] before 
     * the function is called, it should store [7, 3, 8, 19] after the function 
     * is called. Another call on rotateRight would leave the list as [19, 7, 3, 8]. 
     * Another call would leave the list as [8, 19, 7, 3] .
     */
    public static void rotateRight(int[] array) 
    {
        //storedNumber is an integer variable set to the array at the array length minus 1
        int storedNumber = array[array.length - 1];

        //used for loop because we know how many iterations we want
        //variable i is an integer and is initialized to the array length minus 1
        //if i is less than zero
        //the body gets updated by adding 1 each time i goes through the body
        for(int i = array.length - 1; i > 0; i--)
        {
            //the array at index i is set to the number at index i minus 1
            array[i] = array[i-1];
        }

        
        //the array index at 0 is set to the storedNumber
        array [0] = storedNumber;

        //used for loop because we know how many iterations we want
        //variable i is an integer and is initialized to the array length minus 1
        //if i is less than zero
        //the body gets updated by adding 1 each time i goes through the body
        for(int i = 0; i < array.length - 1; i++)
        {
            //the program will the number at index i wiht commas in between each number
            System.out.print(array[i] + ",");
        }

        //the program will print the number at the index arraylength minus 1
        System.out.println(array[array.length - 1]);
        
        //the program will print a blank line
        System.out.println();
    }

    /**
     * Exercise 5:
     * Write a function count that takes an array of integers and a target value as 
     * parameters and returns the number of occurrences of the target value in the 
     * array. For example, if an array called list stores the sequence of values 
     * [3, 5, 2, 1, 92, 38, 3, 14, 5, 73] then the following call:
     * int n = count(list, 3);
     * would return 2 because there are 2 occurrences of the value 3 in the list.
     */
    public static int count(int[] array, int target) 
    {
        //count is a integer variable set to 0
        int count = 0; 
        
        //used for loop because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than the array length
        //the body gets updated by adding 1 each time i goes through the body
        for(int i = 0; i < array.length; i++)
        {
            //if the number at the index i is equal to the target
            if(array[i] == target)
            {
                //increment count
                count++;
            }
        }
        //return count
        return count;
    }

    /**
     * Exercise 6:
     * Write a function called stretch that takes an array of integers as an
     * argument, and returns a new array twice as large as the original that
     * 'replaces' every integer from the original list with a pair of integers,
     * each half the original, and then returns it. If a number in the original
     * list is odd, then the first number in the new pair should be one higher
     * than the second so that the sum equals the original number. For example,
     * suppose a variable called list stores this sequence of values
     * 
     * [18, 7, 4, 24, 11]
     * 
     * The number 18 is stretched into the pair (9, 9), the number 7 is stretched
     * into (4, 3), the number 4 is stretched into (2, 2), the number 24 is
     * stretched into (12, 12) and the number 11 is stretched into (6, 5).
     * Thus,the call:
     * 
     * stretch(list);
     * 
     * should replace list with the following list which is twice the length of
     * the original:
     * 
     * [9, 9, 4, 3, 2, 2, 12, 12, 6, 5]
     */

    public static int[] stretch(int[] array) 
    {
        //an array of integers is declared and set to new array twice as large as the original
        int[] newarray = new int[2 * array.length];

        //used for loop we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than length of array
        //the body gets updated by adding 1 each time i goes through the body
        for(int i = 0; i < array.length; i++)
        {
            //if a number in the original list is even 
            if(array[i] % 2 == 0)
            {
                //newarray at index i multiplied by 2  is set the array number at index i divided by 2
                newarray[i * 2] = array[i] / 2;

                //newarray at index i multiplied by 2 plus 1 is set to the array number at index i divided by 2
                newarray[i * 2 + 1] = array[i] / 2;
            }

            //If a number in the original list is odd
            if(array[i] % 2 != 0)
            {
                //newarray at index i multiplied by 2 is set the array number at index i divided by 2 plus 1
                newarray[i * 2] = array[i] / 2 + 1;

                //newarray at index i multiplied by 2 plus 1 is set to the array number at index i divided by 2
                newarray[i * 2 + 1] = array[i] / 2;
            }
        }
        //the progrma will return newarray
        return newarray;
    }

    /**
     * main method for testing the above methods
     */
    public static void main(String[] args) 
    {
        //for exercises 1, 2
        double[] oddSet = {0.5, 3.1415, 7.6, 42, 799.4};
        double[] evenSet = {0.5, 2.2, 3.1415, 7.6, 42, 799.4};
        double[] notSorted = {3.4, 0.01, 8.7, 2.3};

        System.out.println("Exercise 1: ");
        System.out.println(median(oddSet));
        System.out.println(median(evenSet));
        System.out.println();

        System.out.println("Exercise 2: ");
        System.out.println(isSorted(evenSet));
        System.out.println(isSorted(notSorted));
        System.out.println();

        //for exercises 3, 4, 5
        int[] a1 = {3, 8, 5, 6, 5, 8, 9, 2};
        int[] a2 = {5, 15, 4, 6, 7, 3, 9, 11, 9, 3, 12, 13, 14, 9, 5, 3, 13};
        int[] common = new int[a1.length];

        System.out.println("Exercise 3: ");
        findCommon(a1,a2,common);

        // Add your own tests here
        for(int i = 0;i < common.length - 1; i++){
            System.out.print(common[i] + ", ");
        }
        System.out.println(common[common.length - 1]);
        System.out.println();

        System.out.println("Exercise 4: ");
        int[] test2 = {3, 8, 19, 7};
        rotateRight(test2);

        System.out.println("Exercise 5: ");
        System.out.println(count(a2, 5));
        System.out.println();

        System.out.println("Exercise 6: ");
        int[] test = {18, 7, 4, 24, 11};
        stretch(test);
        for(int i = 0; i < stretch(test).length - 1; i++){
            System.out.print(stretch(test)[i] + ", ");
        }
        System.out.println(stretch(test)[stretch(test).length - 1]);
    }
}
