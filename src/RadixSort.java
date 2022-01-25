import java.util.ArrayList;
import java.util.List;

public class RadixSort {
	LinkedQueue[] a = new LinkedQueue[10];
	List<String> output = new ArrayList<String>();
	public String input = "";
	
	RadixSort() {
		for(int i = 0; i < 10; i++) {
			a[i] = new LinkedQueue<String>();
//			a[i].enqueue(i);
		}
	}
	
	public void addToInput(String s) {
		input += s;
//		if(input.length() == 0) {
//			input += s;
//		} else {
//			
//		}
		if(s.charAt(s.length()-1) != ' ') {
			input += " ";
		}
	}
	
	public void toArray() {
		String[] sa = input.split(" ");
		for(int i = 0; i < sa.length; i++) {
//			Integer.decode(sa[i]);
			System.out.println(sa[i]);
		}
	}
	
	public void sort() {
		int maxLength = 0;
		String[] sa = input.split(" ");
//		for(int i = 0; i < sa.length; i++) {
//			Integer.decode(sa[i]);
//			System.out.println(sa[i]);
//		}
		for(int i = 0; i < sa.length; i++) {
			String s = sa[i];
			a[Integer.decode("" + s.charAt(s.length()-1))].enqueue(s);
		}
	}
	
	public void addToOutput() {
		
	}
}
