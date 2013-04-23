import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import nvcc.edu.view.AdminGUI;
import nvcc.edu.view.BPanels;
import nvcc.edu.view.YPanels;


public class MainFrame {

	public MainFrame() {
		createAndShowGUI();
	}
	
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("PanelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        JPanel mainPanel = new JPanel();
        mainPanel.add(new YPanels());
        mainPanel.add(new BPanels());
        
        mainPanel.setBackground(Color.CYAN);
        //Add content to the window.
        frame.add(mainPanel);
         
        //Display the window.
        frame.pack();
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    public static void main(String [] args) {
    	MainFrame mf = new MainFrame();
    }
}
