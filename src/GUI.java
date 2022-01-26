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
		JLabel inputLabel = addLabel("Input Numbers with a Space Between Each Number", 1,1,1,1);
		inputField = addTextField("", 2, 1, 1, 1);
		JLabel outputLabel = addLabel("Output", 3,1,1,1);
		outputTextArea = addTextArea("", 4, 1, 4, 5);
		outputTextArea.setLineWrap(true);
		SortButton = addButton("Add Numbers to List and Radix Sort", 10,1,1,1);
//		for(int i = 0; i < 10; i++) {
//			System.out.println(a[i].dequeue());
//			a[i] = new LinkedQueue<String>();
//			a[i].enqueue(i);
//		}
		
//		JLabel inputLabel = addLabel("Enter Key (One Space in between each Number):", 1,1,1,1);
//		keyField = addTextField("", 2,1,1,1);
//		JLabel inputLabel2 = addLabel("Enter Message to be Encrypted or Decrypted:", 3,1,1,1);
//		messageField = addTextField("", 4,1,1,1);
//		EncryptButton = addButton("Encrypt", 5,1,1,1);
//		DecryptButton = addButton("Decrypt", 6,1,1,1);
	}
	
	public void buttonClicked(JButton buttonObj) {
		String input = inputField.getText();

		try {
			String[] sa = input.split(" ");
			for(int i = 0; i < sa.length; i++) {
				Integer.decode(sa[i]);
			}
			rs.addToInput(input);
			rs.sort();
			outputTextArea.setText(rs.getNumbers());
		} catch (Exception e) {
			messageBox("Input Error");
			System.out.println(e.getMessage());
		}
	}
	
	public void addToInput(String s) {
		if(input.length() == 0) {
			input += s;
		}
		if(s.charAt(s.length()-1) == ' ') {
			input += " ";
		}
	}
	
	public void sort() {
		
	}
	
	public GUI() {
//		for(int i = 0; i < 10; i++) {
//			a[i] = new LinkedQueue<String>();
////			a[i].enqueue(i);
//		}
		MainMenu();
	}
	
	public static void main(String[] args) {
//		System.out.println(rs.getValue(1235234, 3));
		
//		rs.addToInput("4");
//		rs.addToInput("254");
//		rs.addToInput("37 48 ");
//		rs.addToInput("55 63345 70 ");
//		System.out.println(rs.input);
//		rs.toArray();
//		rs.sort();
//		rs.addToInput("55 63345 70 ");
//		rs.sort();
//		rs.addToInput("52345 65345 74560 1 2 3 4 2 1");
//		rs.sort();
//		String s = "1 2 3 4 ";
//		String[] sa = s.split(" ");
//		for(int i = 0; i < sa.length; i++) {
//			System.out.println(sa[i]);
//		}
		
		
		
		frm = new GUI();
		frm.setTitle("Radix Sort");
		frm.setSize(450, 600);
		frm.setVisible(true);
	}

}
