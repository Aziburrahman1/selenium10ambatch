package array;

public class Program97 {

	public static void main(String[] args) {
	
		int[] ar = {20,30,4,5,6,7,8,9};
		int[] cpar = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			
			cpar[i] = ar[i];	
		}
		for (int i = 0; i < cpar.length; i++) {
			System.out.println(cpar[i]);
		}
	}
}
