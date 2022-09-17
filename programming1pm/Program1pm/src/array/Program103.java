package array;

public class Program103 {

	public static void main(String[] args) {
	
		int[] ar= {50,40,20,30,45,10};
		for (int j = 0; j < ar.length; j++) 
		{
		for (int i = 0; i < ar.length-1; i++) 
		{
			if(ar[i]>ar[i+1])
			{
				int temp = ar[i];
				ar[i] = ar[i+1];
				ar[i+1]=temp;
			}
		}
		}
	for (int i = 0; i < ar.length; i++) 
	{
		System.out.println(ar[i]);
		//System.out.println(ar.length-1+"highest element");
		//System.out.println(ar.length-2+"second highest element");
	}

		}
}
