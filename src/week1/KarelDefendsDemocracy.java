package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {

	public void run() {
		while (frontIsClear()) {
			move();
			scanBallot(); // Scans ballots for Chads/beepers and deletes them  */
			move();
		}
		 
	}
	private void scanBallot() {
		if (beepersPresent()) {
			move();
			move();
			scanBallot();
							
		} else {
			turnLeft();
			move();
			clearChad(); // Detects/deletes Chads/beepers */
			turnAround();
			move();
			move();
			clearChad();
			turnAround();
			move();
			turnRight();
						
		}
	}
	private void clearChad() {
		while (beepersPresent()) {
			pickBeeper();
		}
	}
}
