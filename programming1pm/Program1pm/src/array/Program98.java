package array;

public class Program98 {

	public static void main(String[] args) {
		
		int[] ar = {20,30,25,15};
		int[] cpar = new int[ar.length];
		for (int i =0;i<cpar.length; i++)
		{
			cpar[i] = ar[ar.length-1-i];
			
		}
		for (int i=0;i<cpar.length;i++)
		{
			System.out.println(cpar[i]);
		}

	}
}

