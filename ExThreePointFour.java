import javax.swing.JOptionPane;
/**
 * 
 * @author colin_000
 *PROMPT user for people and players
 *DIVIDE number into teams
 *PRINT groups and teams
 *aannndd boom goes the dynamite.
 *
 */
public class ExcersizeThreePointFour {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
	//initiating variables	
	int NumOfPeople;
	int NumOfPlayers;
	int GroupSize = 0;
	int TeamSize = 0;
	//"Fire all weapons and open a hailing frequency for my victory yoddle" - Zapp Branigan
	NumOfPeople = Integer.parseInt(JOptionPane.showInputDialog("Enter number of people: "));{ // (Integer.parseInt) Takes Input as integer
	
	if (NumOfPeople > 10){ 
	GroupSize = NumOfPeople / 2; //Group is 1/2 of Number of people (if NumOfPeople is less than 10)
	JOptionPane.showMessageDialog(null, "Number of people is: " + NumOfPeople + " Group size: " + GroupSize);} 
	
	else if (NumOfPeople <=10 && NumOfPeople >=3){ 
			GroupSize = NumOfPeople /3; //If NumOfPeople is greater than or equal (and/or less than or equal to 3)
			JOptionPane.showMessageDialog(null, "Group size: " + GroupSize + " Number of people is: " + NumOfPeople);}
	else{
			JOptionPane.showMessageDialog(null,  "Insufficient Amount Of People!");}
	
	NumOfPlayers = Integer.parseInt(JOptionPane.showInputDialog("Enter number of players: "));{
	
	if (NumOfPlayers >=11 && NumOfPlayers <=55){
	TeamSize = NumOfPlayers / 11;
	JOptionPane.showMessageDialog(null, "Number of players is: " + NumOfPlayers + "  Team size is: " + TeamSize );}
	
	else{
		TeamSize = 1; 
		JOptionPane.showMessageDialog(null, "Team size is: " + TeamSize);
			}
		}
	}

}
}