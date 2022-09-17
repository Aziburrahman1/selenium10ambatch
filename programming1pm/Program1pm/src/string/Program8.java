package string;

public class Program8 {

	public static void main(String[] args) {
		
		//split() method...split the string on the basis of array index
		String s = "Java is a programming language";
		String[] s1 = s.split(" ");
		//String[] s1 = s.split("a");
		//String[] s1 = s.split(" a ");
		
		for (int i = 0; i < s1.length; i++) 
		{
			System.out.println(s1[i]);
			
		}
	}

}
