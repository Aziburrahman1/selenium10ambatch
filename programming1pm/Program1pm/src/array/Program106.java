package array;

public class Program106 {

		
		static int[] sortArray(int a[]) 
		{
			for (int i = 0; i < a.length; i++) 
			{
			for (int j = 0; j < a.length-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
			}
			//return a[a.length-1];//return only last value which is highest
			return a;
		}
		
			public static void main(String[] args) {
				
				int ar[] = {20,30,45,32,21};
				int r[] = sortArray(ar);
				for (int i = 0; i < r.length; i++) {
					System.out.println(r[i]);
					
				}
			}

}
