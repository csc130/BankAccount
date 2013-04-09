
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * An applet that uses a label to display text.
 */
public class CustomerFormApplet extends JApplet implements ActionListener {
	private JLabel label1,label2;
	private JTextField txtName, text1;
	private JTextArea txtArea;
	private JButton createAcButton, listReportButton;
	private final int SIZE =10;
	private Account accountList [] = new Account[SIZE];
	public void init() {
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.YELLOW);
		text1 = new JTextField("Status");
		// Create labels:
		label1 = new JLabel("Hello ");
		label2 = new JLabel("out there!");
		
		createAcButton = new JButton("New Account");
		createAcButton.addActionListener(this);
		
		listReportButton = new JButton("Print Account List");
		listReportButton.addActionListener(this);
		
		txtName = new JTextField("Enter Customer Name");
		txtArea = new JTextArea();
		// Add labels:
		contentPane.setLayout(new FlowLayout());
		contentPane.add(label1);
		contentPane.add(label2);
		contentPane.add(text1);
		contentPane.add(txtName);
		contentPane.add(createAcButton);
		contentPane.add(listReportButton);
		contentPane.add(txtArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getActionCommand().equals("New Account")) {
			//Step1: Greet customer
			label2.setText(txtName.getText());
			//Step2: show status
			text1.setText("New Account Created!");
			//Step3: create new account
			Account theAc = new Account(txtName.getText());
			accountList[Account.getNumAccount()-1] = theAc;
			//Step4: Show customer info.
			txtArea.setText(theAc.toString());
			//createAcButton.setEnabled(false);
			createAcButton.setVisible(false);
		} else if(e.getActionCommand().equals("Print Account List")){
			for(int i=0; i<accountList.length; i++)
				System.out.println("account["+i+"]"+"\t"+accountList[i]);
		} else {
			txtArea.setText("Error!");
		}
	}
}
