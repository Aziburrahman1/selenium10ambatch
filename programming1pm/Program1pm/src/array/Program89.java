package array;

public class Program89 {

	public static void main(String[] args) {
		int [] ar = {20,30,40,25,35};
		int smallest = ar[0];
		for(int i=1;i<ar.length;i++)
		{
			if(smallest>ar[i]) 
			{
				smallest = ar[i];
			}
			
		}
		System.out.println(smallest);

	}

}
