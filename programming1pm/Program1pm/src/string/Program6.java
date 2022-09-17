package string;

public class Program6 {

	public static void main(String[] args) {
		//reverse the string
		String s ="Mohan";
		char[] ch = s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) 
		{
			rev = rev+ch[i];
		}
      System.out.println(rev);
	}

}
