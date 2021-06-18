//necessary imports for file i/o
import java.io.FileInputStream;         //"turns" the file into a read stream
import java.util.Scanner;               //reads from stream
import java.io.IOException;             //this exception must be caught and handled when dealing with streams!         
import java.io.FileOutputStream;       //"turns" the file into a write stream
import java.io.PrintWriter;            //writes to the stream
import java.io.FileNotFoundException; //this exception must be caught and handled when dealing with streams!

/**
 * Write a description of class Diary here:
 * a program that prompts users to enter the date as three integers 
 * seperated by spaces then it prompts the user to enter as many lines of 
 * prose they wish.
 *
 * @author Nikita Patel
 * @version 2/9/2018
 */
public class Diary
{
    public static void main(String[] args) throws IOException {
        //integer variables are mm, dd, and yyyy
        int mm = 0;
        int dd = 0;
        int yyyy = 0;
        //Empty string to read prose
        String prose = "";   

        FileOutputStream fos = null;
        PrintWriter output = null;
        //call scanner keyboard
        Scanner keyboard = new Scanner(System.in);
        //print the statement
        System.out.println("Enter the date as three integers separated by spaces (i.e mm dd yyyy) ");
        
        //prompt the user to type in integer values for mm, dd, yyyy
        mm = keyboard.nextInt();
        dd = keyboard.nextInt();
        yyyy = keyboard.nextInt();
        
        //print statements
        System.out.println("Enter as many lines of prose you wish (for your to-do list or diary entry)");
        System.out.println("Press CTRL + Z to end your entry");
        
        //statements that can cause an exception
        try
        {
            output = new PrintWriter(new FileOutputStream("diaryLog.txt", true));
        }
        //code inside the catch block is what we do in case an error is caught
        catch(FileNotFoundException e)
        {
            System.out.println("Could not open the file");
            System.exit(0);
        }
        
        //while loop is used
        while(keyboard.hasNext())
        {
            prose = keyboard.nextLine();
            break;
        }
        
        output.println("Date: " + mm + "/" + dd + "/" + yyyy);
        output.println(prose);
        output.close();
        System.out.println("Info Transfered");
    }
}
