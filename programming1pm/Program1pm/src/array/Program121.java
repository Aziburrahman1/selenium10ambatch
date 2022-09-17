package array;

public class Program121 {

	public static void main(String[] args) {
	
		int ar[] = {20,30,40,30,20,30,20,30};
		int temp[] = new int[ar.length];
		for(int i=0;i<temp.length;i++)
		{
			int count=1;
			for(int j=i+1;j<temp.length;j++)
			{
				if(ar[i]==ar[j]) 
				{
					count ++;
				temp[j]=-1;
				}
			}
			if(temp[i]!=-1&&count>1)
			{
				System.out.println(ar[i]+"  "+count);
			}
		}

	}

}
