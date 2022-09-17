package string;

public class Program5 {

	public static void main(String[] args) {
	         //Methods in string 
		//charAt()                           ...it gives index value
		String s = "Manmohan";
		char c= s.charAt(1); //a
		char b = s.charAt(0); //M
		System.out.println(c);
		System.out.println(b);
		
		
		//toUpperCase()
		String d = "Mohan";
		String e = d.toUpperCase();
		System.out.println(e);
		
		//toLowerCase()
		
		String f = "Mohan";
		String g =f.toLowerCase();
		System.out.println(g);
		
		//length()
		String h = "Mohan";
		System.out.println(h.length());
		
		//trim() ..removes space before starting of string
		String i = "    Java Program ";
		System.out.println(i);   //space coming
		String j = i.trim();
		System.out.println(j);  //removed space
		
		//subString() ..it is overloaded method 
		String k = "Maharastra";
		String l = k.substring(2);   //it will return subString after this index included this index
		System.out.println(l);
		
		//subString(begin index,end index)
		
		String m = k.substring(2, 10);
		System.out.println(m);
		
		//toCharArray()
		
		String n ="Sohan";
		char ch[] = n.toCharArray();
		
		for(int z=0;z<ch.length;z++)
		 {
			System.out.println(ch[z]);
		 }
		

	}

}
