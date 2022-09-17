package array;

public class Program88 {

	public static void main(String[] args) {

		int [] ar = {20,30,40,25,35};
		int big = ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(big<ar[i]) 
			{
				big = ar[i];
			}
			
		}
		System.out.println(big);
	}

}
