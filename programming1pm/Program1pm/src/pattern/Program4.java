package pattern;

public class Program4 {

	public static void main(String[] args) {
	
		int n=5;
		for(int i=0;i<n;i++)  //row
		{
			for(int j=0;j<n;j++) //column
			{
				if(i==0||j==0||j==4||i==2)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}
