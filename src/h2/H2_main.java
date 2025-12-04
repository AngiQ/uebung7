package h2;
import java.util.Arrays;

public class H2_main {

	public static void main(String[] args) {
		int [] c = {2,7,1,9};
		int [] d = {2,7,1,9};
		int st = 3;
		int en = 2;
		int [] neu = change(c,d, st, en);
		System.out.println (Arrays.toString(neu));

	}
	
	public static int [] change (int [] a, int [] b, int start, int end) {
		int com = Arrays.compare(a,b);
		int [] er = {};
		int [] el = {0};
		
		if ((end > start) && (com!=0)) {
			return Arrays.copyOfRange(a, 0, a.length);
		}
		
		if ((end > start) && (com==0)) {
			Arrays.sort(a);
			return Arrays.copyOfRange(a, start, end);
		}
		
		if ((end < start) || (end == start)) {
			return er;
			
		}
		
		else {
			return el;
		}
	}
	
	
	

}
