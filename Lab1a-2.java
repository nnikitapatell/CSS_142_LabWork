
/**
 * Write a description of class Lab1a here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab1a
{
    public static void main(String[] args) {
		compareNumbers();
		calculateDist();
	}
	
	public static void compareNumbers() {
		int firstNum = 5;
		int secondNum = 2;
		System.out.println( "Sum is: " + firstNum + secondNum );
		System.out.println( "Difference is: " + (firstNum - secondNum ));
		System.out.println( "Product is: " + firstNum * secondNum );
	}
	
	public static void calculateDist() {
		int velocity = 10; //miles-per-hour
		int time = 2; //hours
		int distance = velocity * time;
		System.out.println( "Total distance is: " + distance);
	}
}
