package string;

public class Program2 {

	public static void main(String[] args) {
		String s = "Manmohan";
		System.out.println(s);          //because toString() method is working internally by compiler

		s="Mohan";             //String is immutable but it is creating another object for "Mohan" in string constant pool(scp) in heap just for memory management
		System.out.println(s);  // address will be assigned to new string...address will also change...it tells string is immutable
		
		String s1="Mukesh";
		String s2="Mukesh";
		System.out.println(s1==s2);        // true..because both string are same/duplicate so same address is assigned
		System.out.println(s==s1);        //false..because both string is different so  assigned address is also different
	}

}
