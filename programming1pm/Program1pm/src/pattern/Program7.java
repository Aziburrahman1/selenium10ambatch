package pattern;

public class Program7 {

	public static void main(String[] args) {
	
		int n=5;
		for(int i=0;i<n;i++)  //row
		{
			for(int j=0;j<n;j++) //column
			{
				if(i>=j)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}
