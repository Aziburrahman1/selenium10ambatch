package array;

public class Program99 {

	public static void main(String[] args) {
	
		 int[] ar = {20,30,40,25,35};
		 int[] temp = new int [ar.length+1];
		 for(int i=0;i<temp.length;i++)
		 {
			 if(i<2)
			 {
				temp[i] =ar[i];
			 }
			 else if(i==2)
			 {
				 temp[i]=50;
			 }
			 else
			 {
				 temp[i]=ar[i-1];
			 }
		 }
		 for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}

	}

}
