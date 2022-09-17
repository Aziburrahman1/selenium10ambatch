package string;

public class Program133 {

	public static void main(String[] args) {
		//To reverse the word in a string
		String s ="java is a programming language";
		char ch[] = s.toCharArray();
		String out ="";
		for(int i=0;i<ch.length;i++) {
			String temp="";
			while (i<ch.length && ch[i]!= ' ' )
			{
				temp = ch[i]+temp;
				i++;
			}
			out = out+temp+" ";
		}
       System.out.println(out);
	}

}
