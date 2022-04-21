import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner; 

/**
   This program demonstrates how an action listener can access 
   a variable from a surrounding block.
*/
public class ButtonViewer {

	 private static final int FRAME_WIDTH = 300;
	   private static final int FRAME_HEIGHT = 300;
	   
	   
	   public static void main(String[] args)
	   {
		  
		   Scanner in = new Scanner(System.in);
		   
		      Measurable[] bank = new Measurable[3];
		      bank[0] = new BankAccount(176220);
		      bank[1] = new BankAccount(513120);
		      bank[2] = new BankAccount(30510);
	  
		      Measurable[] countries = new Measurable[3];
		      countries[0] = new Country("Uruguay", 176220);
		      countries[1] = new Country("Thailand", 513120);
		      countries[2] = new Country("Belgium", 30510);
		      
		      Measurable[] quiz = new Measurable[5];
		       quiz[0] = new Quiz(95);
		       quiz[1] = new Quiz(80);
		       quiz[2] = new Quiz(90);
		       quiz[3] = new Quiz(50);
		       quiz[4] = new Quiz(75);

		      System.out.print("Enter metric to use, 1 for maximum, 2 for minimum, " + "3 for average: ");
		      int whichMetric = in.nextInt();

		       String metricToUse="average";
		       if (whichMetric == 1) {metricToUse = "Maximum";}
		       if (whichMetric == 2) {metricToUse = "Minimum";}
		       if (whichMetric == 3) {metricToUse = "Average";}
		       
		  //Create frame and panel where buttons will be shown
		  JPanel panel = new JPanel();
		  JFrame frame = new JFrame();
		  frame.add(panel);
		      
		  //Create button and listener for BankAccount
	      JButton button = new JButton("Get " + metricToUse + " Balance");
	      panel.add(button);
	      ActionListener listener = new ButtonListener(bank, metricToUse);
	      button.addActionListener(listener);

	      //Create button and listener for Country
	      JButton button2 = new JButton("Get " + metricToUse + " Area");
	      panel.add(button2);
	      ActionListener listener2 = new ButtonListener(countries, metricToUse);
	      button2.addActionListener(listener2);
	     
	      //Create button and listener for Quiz
	      JButton button3 = new JButton("Get " + metricToUse + " Score");
	      panel.add(button3);
	      ActionListener listener3 = new ButtonListener(quiz, metricToUse);
	      button3.addActionListener(listener3);

	      //Now display frame with buttons
	      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      frame.setVisible(true);
	      
	      
	   }
	}
