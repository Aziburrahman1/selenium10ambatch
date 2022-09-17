package array;

public class Program92 {

	public static void main(String[] args) {
		int arr[] = {20,30,40,50,60,70,12,23,45};
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			if(i%2==0)
				sum=sum+arr[i];
		}
				System.out.println(sum);
}
}
