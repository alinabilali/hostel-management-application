package group11_oopproject;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.Exception;

/* Class to test the program */
public class Manage extends HostelApplicationSystem {

	/* Main method*/
	public static void main(String[] args) {
		
		try {
			/* An object named frame created for HostelApplicationSystem class */
			HostelApplicationSystem frame = new HostelApplicationSystem();
			
			/*Set the measurement for .setBounds()*/
			frame.setHeight(600);
			frame.setWidth(700);
			frame.setX(10);
			frame.setY(10);
			
			/* Title of frame */
	        frame.setTitle("UTHM Hostel Application System");
	        
	        /* Set frame visible to users */
	        frame.setVisible(true);
	        
	        /* Set size of the frame (x, y, width, height) */
	        frame.setBounds(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight());
	        
	        /* Frame will close if Java is closed */
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        /* Frame is not resizable*/
	        frame.setResizable(false);
		}
		
		/* 
		 * To handle exception.
		 * If an error existed, a popup will be displayed with type of error.
		 *  */
		catch(Exception e)	{								 
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}
}
