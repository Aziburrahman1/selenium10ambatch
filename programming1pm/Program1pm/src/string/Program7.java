package string;

public class Program7 {

	public static void main(String[] args) {
		//check whether String is palindrome or not
		String s ="MOM";
		char[] ch = s.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--) 
		{
			rev = rev+ch[i];
		}
      if(s.equals(rev)) {
    	  System.out.println("Palindrome String");
      }
      else {
    	  System.out.println("Not Palindrome");
      }
	}

}
