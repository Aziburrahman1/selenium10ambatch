package string;

public class Program127 {

	public static void main(String[] args) {
		//conversion of Upper case string into lower case string
		String s = "MOHAN";
	    char ch[]= s.toCharArray();
	    String small = "";
	    for (int i = 0; i < ch.length; i++) 
	    {
			char c = (char)(ch[i]+32);       // 32-----difference of (A and a) ...downcast it
			small = small+c;
		}
      System.out.println(small);
	}

}
