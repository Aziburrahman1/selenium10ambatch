package pattern;

public class Program20 {

	public static void main(String[] args) {
		
        int n=5;
        char ch ='A';
		for(int i=0;i<n;i++)  //row
		{
			
			for(int j=0;j<n;j++) //column
			{
				if(!(i+j<=1||i+j>=7||i-j>=3||j-i>=3))
				System.out.print(ch++  +" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
