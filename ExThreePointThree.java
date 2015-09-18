//FoxhoundCoding
//CSC200-Chapter3.3 
//9-17-2015
import java.util.Scanner;

public class ExcersizeThreePointThree {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		String Username = (""); 
		String Password = ("");
		
		System.out.println("Set Username: ");
		Scanner UserInput = new Scanner(System.in);   //Sets Username
		Username = UserInput.nextLine();
		System.out.println("Set Password: ");
		Scanner PassInput = new Scanner(System.in);	//Sets Password
		Password = PassInput.nextLine();
		
		
		
		boolean PassLoop = true;	//prompts loop if password is incorrect
		while (PassLoop == true){
				
		System.out.println("Please enter your username: ");
		String userin = keyboard.next();
		System.out.println("Please enter your password: ");
		String userpass = keyboard.next();
		 	if ((userin.equals(Username) && (userpass.equals(Password)))) //Confirms input is the same as determined password
		 	{
		 		System.out.println("Welcome " + Username + "!");
		 		PassLoop = false; //Ends loop
		 	}
		 	else
		 	{
		 		System.out.println("Wrong username or password, please try again");
		 	}
		} 	keyboard.close();	//closes keyboard
	}
}
		 	
		 	
	