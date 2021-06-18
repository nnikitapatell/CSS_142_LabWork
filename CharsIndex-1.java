
/**
 * Write a description of class Chars_Index here.
 *
 * @author Nikita Patel
 * @version 2/16/2018
 */
public class CharsIndex
{
    public static void main (String [] args)
    {
        //sentence1 is a variable that is a string 
        String sentence1 = "I love programming languages, especially Java.";
        //The program will print sentence1 
        System.out.println(sentence1);
        //the program will print a blank line
        System.out.println();
        //the program will output sentence1
        output(sentence1);

        //sentence2 is a variable that is a string 
        String sentence2 = "I love  programming languages, especially Java.";
        //The program will print sentence2
        System.out.println(sentence2);
        //the program will print a blank line
        System.out.println();
        //the program will output sentence2
        output(sentence2);        
    }
    
    public static void output(String str)
    {
        //the program will print a b c d e f g h i j
        System.out.println(" a  b  c  d  e  f  g  h  i  j");
        //the program will print =============================
        System.out.println("=============================");
        //the program will print
        System.out.println(str.lastIndexOf("a") + " " + str.lastIndexOf("b") + "  " + str.lastIndexOf("c") + "  " + str.lastIndexOf("d") + " " + 
            str.lastIndexOf("e") + " " + str.lastIndexOf("f") + " " + str.lastIndexOf("g") + " " + str.lastIndexOf("h") + " " + 
            str.lastIndexOf("i") + " " + str.lastIndexOf("j"));
        //the program will print a blank line
        System.out.println();

        //the program will print k l m n o p q r s t
        System.out.println(" k  l  m  n  o  p  q  r  s  t");
        //the program will print =============================
        System.out.println("=============================");
        //the program will print
        System.out.println(str.lastIndexOf("k") + " " + str.lastIndexOf("l") + "  " + str.lastIndexOf("m") + "  " + str.lastIndexOf("n") + " " + 
            str.lastIndexOf("o") + " " + str.lastIndexOf("p") + " " + str.lastIndexOf("q") + " " + str.lastIndexOf("r") + " " + 
            str.lastIndexOf("s") + " " + str.lastIndexOf("t"));
        //the program will print a blank line
        System.out.println();
        
        //the program will print u v w x y z
        System.out.println(" u  v  w  x  y  z");
        //the system will print ==================
        System.out.println("==================");
        //the program will print 
        System.out.println(str.lastIndexOf("u") + " " + str.lastIndexOf("v") + "  " + str.lastIndexOf("w") + "  " + str.lastIndexOf("x") + " " + 
            str.lastIndexOf("y") + " " + str.lastIndexOf("z"));
        //the program will print a blank line
        System.out.println();

    }
}