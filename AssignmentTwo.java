import java.util.Scanner;
import java.util.Arrays;
/**
 * 
 * @author colin_000
 *
 */
public class AssignmentTwo {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
	//PartOne
		System.out.println("The expression 1/2 is equal to: " + 1/2);
		System.out.println("The expression 1%2 is equal to: " + 1%2);
		System.out.println("The expression 1.0/2 is equal to: " + 1.0/2);
		System.out.println("The expression  5 + 7 / 2 is equal to: " +  (5 + 7 / 2));
		System.out.println("The expression \"Beat\" + ' ' + \"Army\" is equal to: " + "Beat" + ' ' + "Army");
		System.out.println("The expression 6 + 13 / 5 - 35 % 3 is equal to: " + (6 + 13 / 5 - 35 % 3));
		System.out.println("The expression 3.5 * (5/4) is equal to: " + (3.5 * (5/4)));
		System.out.println("The expression (3.5 * 5)/4 is equal to: " + ((3.5 * 5)/4));
	
	//PartTwo
		Scanner keyboard = new Scanner (System.in);
		//Creates Array [5]
		  int[] NumberArray =new int[5];
		  
		  System.out.println("Enter 5 integers: ");
          Scanner userinput=new Scanner(System.in);
          for(int i=0;i<5;i++){
          NumberArray[i] = keyboard.nextInt();
          }
          for(int i=0;i<5;i++){
        	  System.out.print(""+NumberArray[i]+", ");
          }
          	  System.out.println("");
              keyboard.close();
           
		Arrays.sort(NumberArray);
		 int sum = 0;

		  for (int i : NumberArray)
		      sum += i;
		System.out.println("The sum is " + sum);
		System.out.println("Average: " + ((sum)/5));
		System.out.println("Median: "  + NumberArray[2]);
		System.out.println("Min: " + NumberArray[0]);
		System.out.println("Max: " + NumberArray[4]);

		    
	}

}
