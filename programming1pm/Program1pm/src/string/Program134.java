package string;

public class Program134 {

	public static void main(String[] args) {
	
		//make first character of each word in upper case
		String s="manohar singh rathore";
		String s1[]=s.split(" ");
		String upper="";
		for(String s2:s1)
		{
			String first=s2.substring(0, 1);
			String afterFirst=s2.substring(1);
			upper=upper+first.toUpperCase()+afterFirst+" ";	
		}
        System.out.println(upper);
	}

}
