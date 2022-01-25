import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import BreezySwing.GBFrame;

public class GUI extends GBFrame {
	
	LinkedQueue[] a = new LinkedQueue[10];
	static RadixSort rs = new RadixSort();
	String input = "";
	static LinkedQueue<String> q = new LinkedQueue<String>();;
	static JFrame frm;
	JTextField keyField;
	JTextField messageField;
	JButton EncryptButton;
	JButton DecryptButton;
	
	public void MainMenu() {
		
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
		if(buttonObj == EncryptButton) {
			
		} else if(buttonObj == DecryptButton) {
			
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
		rs.addToInput("1");
		rs.addToInput("2");
		rs.addToInput("3 4 ");
		rs.addToInput("5 6 7 ");
		System.out.println(rs.input);
		rs.toArray();
		rs.sort();
//		String s = "1 2 3 4 ";
//		String[] sa = s.split(" ");
//		for(int i = 0; i < sa.length; i++) {
//			System.out.println(sa[i]);
//		}
		
		
		
		frm = new GUI();
//		frm.setTitle("Encryption");
//		frm.setSize(450, 200);
//		frm.setVisible(true);
	}

}
