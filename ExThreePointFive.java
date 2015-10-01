import javax.swing.JOptionPane;
/**
 * 
 * @author colin_000
 *Init UserSelect
 *Init While loop 
 *Prompt user of 1-7 inputs
 *Init Switch with 7 cases
 *Prints output
 */
public class ExThreePointFive {

	public static void main(String[] args) {
		//"The only winning move, is not to play" - Wargames
		int UserSelect = 0;
		String UserR = "";
		//" "What makes a man turn neutral ... Lust for gold? Power? Or were you just born with a heart full of neutrality?" - Zapp Branigan
		while (UserSelect !=6){//runs unitl user selects 6(kill switch)
			UserSelect = Integer.parseInt(JOptionPane.showInputDialog("Enter role!: 1. Administrator  2. Faculty  3. Staff  4. Student  5. Guest 6. Exit"));
		
		if (UserSelect <1 || UserSelect >6)
			UserSelect = 7; //Set to 7 
		
		switch(UserSelect){//creates selection 
			case 1:
				UserR = "Admin";
				JOptionPane.showMessageDialog(null, "Welcome " + UserR);
				break;
			case 2:
				UserR = "Faculty";
				JOptionPane.showMessageDialog(null, "Welcome " + UserR);
				break;
			case 3:
				UserR = "Staff";
				JOptionPane.showMessageDialog(null, "Welcome " + UserR);
				break;
			case 4:
				UserR = "Student";
				JOptionPane.showMessageDialog(null, "Welcome " + UserR);
				break;
			case 5:
				UserR = "Guest"; 
				JOptionPane.showMessageDialog(null, "Welcome " + UserR);
				break;
			case 6:
				UserR = "User";
				JOptionPane.showMessageDialog(null, "Goodbye " + UserR);
				break;
			case 7: //ends sequence
				JOptionPane.showMessageDialog(null, "Invalid Input!", "Error", JOptionPane.WARNING_MESSAGE);
				break;
				
			
		}
	

	}

}
}