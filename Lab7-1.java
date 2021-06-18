import java.util.*;

/**
 * Write a description of class Lab7 here.
 *
 * @author Nikita Patel
 * @version 2/16/2018
 */
public class Lab7
{
    public static void main(String [] args) 
    {
        //prints the text in with
        capitalizeLetter("I really enjoy attending lab!");
        System.out.println(nameIntials("Bertrand Arthur William Russell"));
        letterCount("I am the very model of a modern major general", "m");
        lexLargest("I am the very model of a modern major general");
        largestBy("I am the very model of a modern major general");
    } 

    //Exercise 1 - Capitalizing First Letters of Input Text

    //1.1 capitalizes the first letter of each word in a sentence
    public static void capitalizeLetter(String input)
    {

        String capText = "";

        //split each word in given text
        String arrayName[] = input.split(" ");

        for (int i = 0; i < arrayName.length; i++)
        {
            //Capitalize the first letter of each word and add it to make final string
            capText = capText + arrayName[i].substring(0,1).toUpperCase() 
            + arrayName[i].substring(1,arrayName[i].length())+ " ";
        }

        //capWord will return the text with first letter capital in each word.
        System.out.println(capText);
    }
    
    //1.2: prints name's initials
    public static String nameIntials(String name)
    {
        //newName is a assigned to empty string
        String newName = "";

        //split each word in the given text
        String arrayInput [] = name.split(" ");

        for (int i = 0; i < arrayInput.length; i++)
        {
            //
            newName = newName + arrayInput[i].substring(0,1).toUpperCase() + ".";
        }

        //newName will return the first letter of each word capitalized
        return newName;
    }

    //1.3
    public static int letterCount(String sentence, String letter)
    {
        //countMs is a integer variable set to 0
        int countMs = 0;

        for (int i = 0; i < sentence.length(); i++)
        {

            if (sentence.substring (i, i + 1) .equals(letter))
            {
                //increments the integer variable countMs
                countMs++;                 
            }
        }

        //the program prints out countMs
        System.out.println(countMs);
        //the program returns countMs
        return countMs;
    }

    //Exercise 2: Finding the Lexicographic or by Length Largest String

    //2.1 
    public static String lexLargest(String sentence)
    {
        //
        String arrayName[] = sentence.split(" ");
        String largestLex = arrayName [0];

        //used for loop because we know how many iterations we want 
        //initialization of i is set to 0 
        //if i is less than the length of the arrayName
        //the body gets upated by adding 1 each time
        for(int i = 1; i < arrayName.length; i++)
        { 
            //
            if(largestLex.compareToIgnoreCase(arrayName[i]) < 0)
            {
                largestLex = arrayName[i]; 
            }
        }
        
        //print the largestLex
        System.out.println(largestLex);
        //return largestLex
        return(largestLex);
    }

    //2.2 returns the largest by length word
    public static void largestBy (String sentence)
    {
        //String arrayName is assigned to 
        String arrayName[] = sentence.split(" ");
        String largestLengthWord = arrayName [0];

        for(int i = 1; i < arrayName.length; i++)
        {
            if(largestLengthWord.length()<arrayName[i].length())
            {
                //the largestLengthWord is arrayName with the greatest length
                largestLengthWord = arrayName[i];
            }
        }

        //the program will print the largestLengthWord
        System.out.println(largestLengthWord);
    }
}
