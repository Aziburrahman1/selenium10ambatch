package string;

public class Program9 {

	public static void main(String[] args) {
		
		// equalsIgnoreCase() method ...ignore the case be it upper or lower
		String s = "Mohan";
		String s1 = "mohan";
		
		System.out.println(s.equals(s1));  //false
		
		System.out.println(s.equalsIgnoreCase(s1));  //true
		
	}

}
