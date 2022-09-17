package string;

public class Program130 {

	public static void main(String[] args) {
		//program to find the occurance of each character in a string & print which repeat more than one time
		String s = "Manohar singh ratore";
		char ch[] = s.toCharArray();
		int temp[]= new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			int count =1;
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]) {
					count++;
					temp[j]=-1;
			}
			
		}
        if(temp[i]!=-1 && ch[i]!= ' ' && count>1 )
        	System.out.println(ch[i]+" "+count);
	}


	}

}
