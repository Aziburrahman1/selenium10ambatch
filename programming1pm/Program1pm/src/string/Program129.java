package string;

public class Program129 {

	public static void main(String[] args) {
		//duplicate character present in string
		String s = "Manohar singh rathore";
		char ch[] = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j])
					System.out.println(ch[i]);
			}
			
		}

	}

}
