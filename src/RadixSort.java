import java.util.ArrayList;
import java.util.List;

public class RadixSort {
	LinkedQueue[] a = new LinkedQueue[10];
	List<Integer> output = new ArrayList<Integer>();
	public String input = "";
	
	RadixSort() {
		for(int i = 0; i < 10; i++) {
			a[i] = new LinkedQueue<Integer>();
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
		int[] ia = new int[sa.length];
		for(int i = 0; i < sa.length; i++) {
			ia[i] = Integer.decode(sa[i]);
		}
//		for(int i = 0; i < sa.length; i++) {
//			Integer.decode(sa[i]);
//			System.out.println(sa[i]);
//		}
		for(int i = 0; i < sa.length; i++) {
			int n = ia[i];
			maxLength = Math.max(maxLength, Integer.valueOf(n).toString().length());
			a[getValue(n, 0)].enqueue(n);
		}
//		for(int j = 0; j < 10; j++) {
//			System.out.println("size " + a[j].size());
//		}
//		System.out.println("****" + maxLength);
		if(maxLength > 1) {
			for(int i = 1; i < maxLength; i++) {
				for(int j = 0; j < 10; j++) {
					LinkedQueue<Integer> temp = a[j];
					int size = temp.size();
//					for(int p = 0; p < size; p++) {
//						
//					}
//					System.out.println("temp size " + size);
					for(int k = 0; k < size; k++) {
						Integer n = temp.dequeue();
						if(n.toString().length() <= i) {
//							System.out.println("***");

							a[0].enqueue(n);
						} else {
//							System.out.println("******");
							a[getValue(n, i)].enqueue(n);
						}
					}
				}
			}
		}
		
	}
	
	public int getValue(int number, int place) {
		number = (int) (number / Math.pow(10, place));
		return number % 10;
	}
	
	public String getNumbers() {
		output.clear();
		String s = "";
		for(int i = 0; i < 10; i++) {
			LinkedQueue<Integer> temp = a[i];
			while(!temp.isEmpty()) output.add(temp.dequeue());
		}
		for(Integer n : output) {
			s += n.toString() + "\n";
		}
		return s;

	}
}
