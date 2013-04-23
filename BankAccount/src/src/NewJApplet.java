package src;

import java.awt.Dimension;

import javax.swing.JApplet;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class NewJApplet extends javax.swing.JApplet {
	private JInternalFrame jInternalFrame1;
	private JScrollPane jScrollPane1;

	/**
	* Auto-generated main method to display this 
	* JApplet inside a new JFrame.
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame();
				NewJApplet inst = new NewJApplet();
				frame.getContentPane().add(inst);
				((JComponent)frame.getContentPane()).setPreferredSize(inst.getSize());
				frame.pack();
				frame.setVisible(true);
			}
		});

	}
	
	public NewJApplet() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setSize(new Dimension(400, 300));
			{
				jInternalFrame1 = new JInternalFrame();
				getContentPane().add(jInternalFrame1);
				jInternalFrame1.setVisible(true);
				jInternalFrame1.setPreferredSize(new java.awt.Dimension(165, 119));
				jInternalFrame1.setBounds(185, 5, 165, 119);
			}
			{
				jScrollPane1 = new JScrollPane();
				getContentPane().add(jScrollPane1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
