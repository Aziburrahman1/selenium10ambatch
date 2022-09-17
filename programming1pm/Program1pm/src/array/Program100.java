package array;

public class Program100 {

	public static void main(String[] args) {
		
		int[] ar = {10,20,30,25,12};
		int[] temp= new int[ar.length-1];
		
		for (int i = 0; i < temp.length; i++) 
		{
			if(i<2)
			{
				temp[i]=ar[i];
			}
			else
				temp[i]=ar[i+1];
		}
		for (int i = 0; i < temp.length; i++) 
		{
			System.out.println(temp[i]);
		}

	}

}
