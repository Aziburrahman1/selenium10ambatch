package array;

public class Program94 {

	public static void main(String[] args) {
		int arr[] = {20,30,40,50,60,70,12,23,45};
		int big=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0)
			{
				if(big<arr[i]){
					big= arr[i];
					
				}
			}	
		}
				System.out.println(big);
	}
}
