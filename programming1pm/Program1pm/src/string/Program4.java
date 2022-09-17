package string;

public class Program4 {

	public static void main(String[] args) {
		
		// we can create duplicate object with the help of new keyword but there will be different address
		
		String s = new String("Manhoman");
		System.out.println(s);           //print values not address
		String s1 = new String("Manhoman");
		System.out.println(s1);            //print values not address
		System.out.println(s==s1);     //equals operator == compares address only ..false
		System.out.println(s.equals(s1)); //equal method compare values of object...true
		System.out.println(s.contains(s1));
		

	}

}
