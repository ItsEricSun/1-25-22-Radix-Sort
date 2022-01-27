import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import BreezySwing.GBFrame;

public class GUI extends GBFrame {
	
	LinkedQueue[] a = new LinkedQueue[10];
	static RadixSort rs = new RadixSort();
	String input = "";
	static LinkedQueue<String> q = new LinkedQueue<String>();;
	static JFrame frm;
	JTextField inputField;
	JTextField outputField;
	JTextArea inputTextArea;
	JTextArea outputTextArea;
	JButton SortButton;

	
	public void MainMenu() {
		JLabel inputLabel = addLabel("Input Numbers with a Space Between Each Number (Can't Input Numbers Greater than 2147483647)", 1,1,1,1);
		inputField = addTextField("", 2, 1, 1, 1);
		JLabel outputLabel = addLabel("Output", 3,1,1,1);
		outputTextArea = addTextArea("", 4, 1, 4, 5);
		outputTextArea.setLineWrap(true);
		SortButton = addButton("Add Numbers to List and Radix Sort", 10,1,1,1);
	}
	
	public void buttonClicked(JButton buttonObj) {
		String input = inputField.getText();
		try {
			String[] sa = input.split(" ");
			for(int i = 0; i < sa.length; i++) {
				Integer.parseInt(sa[i]);
			}
			rs.addToInput(input);
			rs.sort();
			outputTextArea.setText(rs.getNumbers());
		} catch (Exception e) {
			messageBox("Input Error");
		}
	}
	
	public GUI() {
		MainMenu();
	}
	
	public static void main(String[] args) {
		frm = new GUI();
		frm.setTitle("Radix Sort");
		frm.setSize(650, 600);
		frm.setVisible(true);
	}

}
