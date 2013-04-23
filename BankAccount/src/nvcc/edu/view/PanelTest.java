package nvcc.edu.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class PanelTest extends JFrame {

    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TabbedPaneDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //Add content to the window.
        frame.add(new BPanels(), BorderLayout.CENTER);
         
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createAndShowGUI();
	}

}
