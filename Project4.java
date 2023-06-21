import javax.swing.JFrame;
/*
 * Author: Azizullah Wazir
 * Course: COP3503
 * Project #: 4
 * Title: GUI's
 * Due Date: 05/01/2023
 * 
 * Creates a GUI that represents a Diet Survey
 */
public class Project4  {
    /**
     * Initializes and Displays a CustomJFrame
     * @param args
     */
	public static void main(String[] args) {
	// Initializes a CustomJFrame constructor called JFrame	
	CustomJFrame frame = new CustomJFrame();
    
	// CustomJFrame closes
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// The pack method sizes the CustomJFrame
	frame.pack();
	//Makes the CustomJFrame visible
	frame.setVisible(true);
		
		
	}

}
