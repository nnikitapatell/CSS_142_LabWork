import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
/**
 * Write a description of class Advice here: 
 * the program gives and takes advice on program writing
 * 
 *
 * @author Nikita Patel
 * @version 2/9/2018
 */
public class Advice
{
    public static void main(String[] args)
    {
        //empty string to read statement 
        String statement = "";       
        //the program will overwrite the old text file so that I 
        //wouldn't have to delete the old file just to see the result 
        //of the changes made in the code
        PrintWriter replace = null;
       
        PrintWriter output = null;
        //call scanner keyboard = new Scanner(System.in)
        Scanner keyboard = new Scanner(System.in);
        
        //statements that can cause an exception
        try
        {
            
            replace = new PrintWriter(new FileOutputStream("advice.txt"));
            output = new PrintWriter(new FileOutputStream("adviceLog.txt", true));    
        }
        //statements responding to an exception
        //FileNotFoundException is theexception we are trying to detect and "catch"
        //e is an object of the FileNotFoundException
        //code inside th e catch block is what we do in case an error is caught
        catch(FileNotFoundException e)
        {
            System.out.println("Could not access the file.");
            System.exit(0);
        }
        
        
        String advice = "";
        advice = keyboard.nextLine();
        replace.println(advice);
        output.println(advice);
        replace.close();
        //closes the outputstream
        output.close();
    }
}
