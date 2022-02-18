
public class Microwave {

	private int time = 0;
	private int level = 1;

	
	public void timeButton() {
		time = time + 30;
	}
	
	public void powerButton() {
		if (level == 1)
			level = 2; 
		
		else 
		if (level == 2) {
			level = 1; }
	}
	
	public void resetButton() {
		time = 0;
		level = 1;
	}
	
	public void startButton() {
		System.out.println("Cooking for " + time + " seconds at level " +level);	
	
	resetButton();
		
	}

	}
 

