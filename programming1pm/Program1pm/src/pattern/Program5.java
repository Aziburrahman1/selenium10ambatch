package pattern;

public class Program5 {

	public static void main(String[] args) {
	
		int n=5;
		for(int i=0;i<n;i++)  //row
		{
			for(int j=0;j<n;j++) //column
			{
				if(j==2||i==j&&i>=2||i+j==n-1&&i<=2)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}
