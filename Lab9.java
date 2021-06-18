import java.util.*;
/**
 * Write a description of class Lab9 here.
 *
 * @author Nikita Patel
 * @version 3/2/2018
 */
public class Lab9
{
    //returns an N-by-N matrix of random integers ranging from start to end
    public static int[][] random(int N, int start, int end)
    {
        //random is 
        Random random = new Random();
        int[][] matrix = new int[N][N];

        //used for loop because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than N
        //the body gets updated by adding 1 each time i goes through the body
        for(int i = 0; i < N; i++)
        {
            //used for loop because we know how many iterations we want
            //variable j is an integer and is initialized to 0
            //if j is less than  N
            //the body gets updated by adding 1 each time j goes through the body
            for(int j = 0; j < N; j++)
            {
                //num is an integer variable set generate a number between 0 to input              
                int num = start + random.nextInt(end-start+1); 
                
                //num is set to the matrix od i by j
                matrix[i][j] = num;
            }
        }
        //the program returns matirix
        return matrix;
    }

    // returns sum of all the elements in that row
    public static int rowSum(int[][]a, int k)
    {
        //sum is an integer variable set to 0
        int sum = 0;

        //rowIndex is an integer varaible set to k - 1
        int rowIndex = k - 1;

        //used for loop to find the countC because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than length of the sequence
        //the body gets updated by adding 1 each time i goes through the body
        for(int col = 0; col < a[rowIndex].length;col++)
        {
            //sum is set to sum plus array time rowIndex times col
            sum += a[rowIndex][col];
        }
        //return rum
        return sum;
    }

    //Returns sum of all elements in the column
    // if there is no column in some rows, we are skipping that row
    public static int colSum(int[][]a, int l)
    {
        //sum is an integer variable set to 0
        int sum = 0;

        //cloIndex variable is an integer variable set to l minus 1
        int colIndex = l - 1;

        //used for loop to find the countC because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than length of the sequence
        //the body gets updated by adding 1 each time i goes through the body
        for(int row = 0; row < a.length;row++)
        {
            //if the row lenth of array 1 is greater than or equal to 1
            if(a[row].length >= l)
            {
                //sum is set to array a row multiplied by colIndex
                sum += a[row][colIndex];
            }
        }
        //the program returns sum
        return sum;
    }

    //the program checks if each row size is equal to number of rows
    public static boolean isSquare(int[][] a)
    {
        //tF is a boolean variable set to true
        boolean tF = true;

        //used for loop to find the countC because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than length of the sequence
        //the body gets updated by adding 1 each time i goes through the body
        for(int row = 0; row < a.length ; row++)
        {
            if(a.length != a[row].length)
            {
                //tF is set to false
                tF = false;
                //break statement
                break;
            }
        }
        //the program will return tF
        return tF;
    }

    // Latin means : it should be perfect square
    // All the values should be between 1 to rowsize
    // 1 to rowsize value should repeat only once in a row
    public static boolean isLatin(int[][] a)
    {
        //r is a boolean variable set to true
        boolean r = true;

        //used for loop to find the countC because we know how many iterations we want
        //variable i is an integer and is initialized to 0
        //if i is less than length of the sequence
        //the body gets updated by adding 1 each time i goes through the body
        for(int i = 0; i < a.length; i++)
        {
            //count is an integer array set to new a[i].length
            int[] count = new int[a.length];
            //if the length of a does not equal to the length of array length of index i 
            if(a.length != a[i].length)
            {
                //r is set to false
                r = false;

                //break 
                break;
            }

            //used for loop to find the countC because we know how many iterations we want
            //variable i is an integer and is initialized to 0
            //if i is less than length of the sequence
            //the body gets updated by adding 1 each time i goes through the body
            for(int j = 0; j < a[i].length;j++)
            {
                if((a[i][j] > a.length) || (a[i][j] <= 0 )|| count[a[i][j]-1] != 0)
                {
                    //r is set to false 
                    r = false;

                    //break 
                    break;
                }                  

                //count is array a at index i times j - 1 is set to 1
                count[a[i][j]-1] = 1;
            }

            //if not r
            if(!r)
            {
                //then break
                break;
            }
        }

        //the program will return r
        return r;
    }

    public static void main(String args[]) 
    {
        int[][] allneg = { {-10,-12,-3}, {-4,-5,-6,-8}, {-7,-8}};
        int[][] nonsquare = {{1,2,3},{4,5},{6,7,8,9}};
        int[][] latin = {{1,2,3},{2,3,1},{3,1,2}};
        int[][] nonlatin = {{0,1,3},{2,3,1},{3,1,2}};

        int[][] array1 = random(5,6,9);
        int[][] array2 = random(4,6,12);
        int[][] array3 = random(2,3,8);
        int[][] array4 = random(4,3,9);
        int[][] array5 = random(3,5,7);

        //the following are the bring statements to show the test results
        
        System.out.println("Results of testing methods on allneg");
        System.out.println("Sum of row: " + rowSum(allneg, 3));
        System.out.println("Sum of column: " + colSum(allneg,3));
        System.out.println("It's a square.  " + isSquare(allneg));
        System.out.println("It's a latin." + isLatin(allneg));

        System.out.println("Results of testing methods on nonsquare");
        System.out.println("Sum of row: " + rowSum(nonsquare, 1));
        System.out.println("Sum of column: " + colSum(nonsquare,1));
        System.out.println("It's a square.  " + isSquare(nonsquare));
        System.out.println("It's a latin." + isLatin(nonsquare));

        System.out.println("Results of testing methods on latin");
        System.out.println("Sum of row: " + rowSum(latin, 1));
        System.out.println("Sum of column: " + colSum(latin,1));
        System.out.println("It's a square. " + isSquare(latin));
        System.out.println("It's a latin." + isLatin(latin));

        System.out.println("Results of testing methods on nonlatin");
        System.out.println("Sum of row: " + rowSum(nonlatin, 1));
        System.out.println("Sum of column: " + colSum(nonlatin,1));
        System.out.println("It's a square." + isSquare(nonlatin));
        System.out.println("It's a latin." + isLatin(nonlatin));

        System.out.println("Results of testing methods on array1");
        System.out.println("Sum of row: " + rowSum(array1, 1));
        System.out.println("Sum of column: " + colSum(array1,1));
        System.out.println("It's a square. " + isSquare(array1));
        System.out.println("It's a latin." + isLatin(array1));

        System.out.println("Results of testing methods on array2");
        System.out.println("Sum of row: " + rowSum(array2, 1));
        System.out.println("Sum of column: " + colSum(array2,1));
        System.out.println("It's a square. " + isSquare(array2));
        System.out.println("It's a latin. " + isLatin(array2));

        System.out.println("Results of testing methods on array3");
        System.out.println("Sum of row: " + rowSum(array3, 1));
        System.out.println("Sum of column: " + colSum(array3,1));
        System.out.println("It's a square. " + isSquare(array3));
        System.out.println("It's a latin." + isLatin(array3));

        System.out.println("Results of testing methods on array4");
        System.out.println("Sum of row: " + rowSum(array4, 1));
        System.out.println("Sum of column: " + colSum(array4,1));
        System.out.println("It's a square. " + isSquare(array4));
        System.out.println("It's a latin." + isLatin(array4));

        System.out.println("Results of testing methods on array5");
        System.out.println("Sum of row: " + rowSum(array5, 1));
        System.out.println("Sum of column: " + colSum(array5,1));
        System.out.println("It's a square. " + isSquare(array5));
        System.out.println("It's a latin." + isLatin(array5));
    }
}