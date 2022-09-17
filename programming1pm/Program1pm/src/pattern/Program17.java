package pattern;

public class Program17 {

	public static void main(String[] args) {
		
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)  //row
		{
			
			for(int j=0;j<n;j++) //column
			{
				if(i>=j)
				System.out.print(ch++ +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}


	}

}
