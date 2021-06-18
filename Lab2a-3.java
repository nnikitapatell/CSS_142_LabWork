
/**
 * Write a description of class Lab2a here.
 *
 * @author Nikita Patel
 * @version 1/12/2018
 */
public class Lab2a{
        public static void main(int[] args){
        //what is result1?
        int result1 = (7 * 3) % 4 - (2 * 6) / 5 + 10 / (3 / 2);
        
        //what is result2?
        int result2 = 2 / (4 -3) + ((5 * 4 % 3 * 5 - 6) * 2) -5;
       
        //what is k?
        int i = 10, j = 20, k;
        k = ++i - j--;
        
        System.out.println (result1);
        System.out.println (result2);
        System.out.println (k);
        
        // Lab2a Part2 tests
        System.out.println (Kelvins(55));   
        System.out.println (Kelvins(32)); 
        System.out.println (Kelvins(61)); 
        System.out.println (Kelvins(63)); 
        System.out.println (Kelvins(40)); 
        
        // Lab2a Part3 Tests
        SecondTime(5000);
        InSeconds(1,23,20);
        System.out.println ("Please enter totalSeconds:");
        SecondTime(args[0]);
    }
    /**
       * Part 1 - kelvins method  - takes as argument a double 
       * corresponding to degrees Fahrenheit, then returns a double 
       * corresponding to the same input temperature in degrees 
       * Kelvin.
       */

        public static double Kelvins (double f){
        double kelvin = 0.0;
        kelvin = (5.0 / 9) * ( f - 32) + 273.15;
        TemperaturePrinter(f, kelvin);
        return kelvin;}
    /**
     * Part 2 - temperaturePrinter method - takes as arguments two doubles. The
     * first is a temperature in degrees Fahrenheit and the second is the
     * same temperature in degrees Kelvin. This method is void and it 
     * prints to the screen:
     * 
     * <arg1> F corresponds to <arg2> K
     */
    //This method's signature (and code) is all on you!
        public static void TemperaturePrinter(double f, double k){
        System.out.println (f + " F corresponds to " + k + " K");
    }
    /**
     * Part 3 - secondTime method - write a clear and consice 
     * description for this method here:
     * Part 3 - secondTime method - takes as argument an integer 
     * coresponding to a number of seconds, computes the exact time in 
     * hours, minutes and seconds, 
     * then prints the following message to the screen:
     * 
     * <inputseconds> seconds corresponds to:
     * <hour> hours, <minute> minutes and <second> seconds
     */
         public static void SecondTime (int inputSeconds){
        
             int hours = inputSeconds/60/60;
             int minutes = (inputSeconds - (hours * 60 * 60))/60;
             int seconds = inputSeconds - (hours * 60 * 60) - (minutes * 60);
             System.out.println (inputSeconds + " Seconds corresponds to: ");
             System.out.println (hours + " hours, " + minutes + " minutes and " + seconds + " seconds"); 
    }

    /**
     * Part 3 - inSeconds method - takes as arguments 
     * three integers: hours, 
     * minutes and seconds, computes the exact time in seconds, them 
     * returns the total number of seconds and prints a message 
     * to the screen.
     */
     public static int InSeconds(int hours, int minutes, int seconds){
         int totalSeconds = (hours * 60 * 60) + (minutes * 60) + seconds;
         System.out.println (hours + " hours, " + minutes + " minutes and " + seconds + " seconds corresponds to:");
         System.out.println (totalSeconds + " seconds");
         return totalSeconds;
     }
}