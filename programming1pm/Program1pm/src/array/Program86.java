package array;

import java.util.Scanner;

public class Program86 {

		
		static int[] createArray(int size)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the array elements");
			int[] ar = new int[size];
			for (int i = 0; i < ar.length; i++) 
			{
				ar[i]=sc.nextInt();
			}
			//return ar[ar.length-2];
			return ar;
		}

	public static void main(String[] args) {
		int[] x = createArray(4);
		for(int i=0;i<x.length;i++) 
		{
			System.out.println(x[i]);
		}
		
	}

}
