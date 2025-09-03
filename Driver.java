import java.util.Scanner;  //may be necessary for input

import javax.swing.JOptionPane;  //may be necessary for input

import kareltherobot.*;

public class Driver implements Directions {
// declared here so it is visible in all the methods!! 
// It will be assigned a value in the getInfo method
	private static Robot r; 


	// You will add very many variables!!

	
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		Driver d = new Driver();

  /**
	 * This section of code gets info from the user in the following order: 1. Ask the user
	 * which world file they wish to process. Right now, that world file name is
	 * hardcoded in. 2. Ask the user for the starting location and direction of the
	 * Robot. A new Robot should be constructed and assigned to the global
	 * (instance) variable named r that is declared on line 10.
	 * 
	 * An inelegant way to interact with the user is via the console, using
	 * System.out.println and a Scanner that scans System.in (input from the
	 * console). A more elegant way to get user input might include using a
	 * JOptionPane.
	 */

    String wrldName = "basicRoom.wld";

		World.readWorld(wrldName);
    World.setVisible(true);
	World.setDelay(5);
		Robot r = new Robot (7, 7, East, 0);

// 1) Clean this row
for(int num = 1; num<=5;num++){
while (r.frontIsClear()==true) {
	r.move();
	while (r.nextToABeeper()==true) {
		r.pickBeeper();
		
	}
}
if (r.facingEast()==true) {
	r.turnLeft();
	if (r.frontIsClear()==true){
	r.move();
	}
	if (r.frontIsClear()==false){
		r.turnOff();
	}
	r.turnLeft();
}
else if (r.facingWest()){
	r.turnLeft();
	r.turnLeft();
	r.turnLeft();
	r.move();
	r.turnLeft();
	r.turnLeft();
	r.turnLeft();
}

}

  


}

	}
