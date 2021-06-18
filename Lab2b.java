/**
 * Write a description of class Lab2b here.
 *
 * @author Nikita Patel
 * @version 1/13/2018
 */
import java.util.Scanner;
//What imports do you need?
public class Lab2b{
    public static void main(String[] args){
        //Part 4a here:
        double maxNumber1 = Math.max(22.3, 34.5);
        double minNumber1 = Math.min(3.6/7.2, 3.8/6.9); 
        double maxNumber2 = Math.max(2.0/3, 0.1); 
        double minNumber2 = Math.min(13.5555, 13.5556); 
        
        System.out.println ("Max number1: " + maxNumber1);
        System.out.println ("Min number1: " + minNumber1);
        System.out.println ("Max number2: " + maxNumber2);
        System.out.println ("Min number2: " + minNumber2);
        
        //Part 4b here:
        //I will declare some variables for you;
        System.out.println ("Please enter your name followed by three numbers (space separated):");
        Scanner keyboard = new Scanner(System.in).useDelimiter("\\s");
        String name = keyboard.next();
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();
        double num3 = keyboard.nextDouble();
        
        double max = Math.max(Math.max(num1, num2), num3);
        double min = Math.min(Math.min(num1, num2), num3);
        double mid = num1 + num2 + num3 - max - min;
        
        System.out.println ("Hi there, " + name + "! Here are the numbers you entered in descending order");
        System.out.println (max + " " + mid + " and " + min);
        System.out.println ("Thank you for using the three-number-sorting system! Good-bye.");
        //take over!
    }
}
