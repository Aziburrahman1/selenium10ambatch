package string;

public class Program133b {

	public static void main(String[] args) {
		//reversing each word using split() method in a string
		String s="java is a programming language";
		String s1[] = s.split(" ");
		for(String s2:s1)
		{
			char ch[]=s2.toCharArray();
			String rev="";
			for(int i=ch.length-1;i>=0;i--) 
			{
			rev = rev+ch[i];	
			}
			System.out.println(rev);
		}

	}

}
