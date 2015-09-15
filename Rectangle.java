import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		System.out.println("Please enter the width of the rectangle: ");
		int width = keyboard.nextInt();
				
		System.out.println("Please enter the height of the rectangle: ");
		int height = keyboard.nextInt();
		
		System.out.println("The area is: " + width * height);
		System.out.println("The perimeter is: " + (width + width + height + height));
		
		keyboard.close();
	}
}
