import java.util.Arrays;

public class Prac3 {
	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		int[] ar2= {3,4,5,6,7,8,8,9,10,11};
		
		System.arraycopy(ar,0,ar2,4,6);
		System.out.println(Arrays.toString(ar2));
		
		
	}
}