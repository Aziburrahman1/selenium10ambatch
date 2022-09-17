package string;

public class Student1 {
		
		int rollNo;
		String name;
		
		Student1 (int rollNo,String name)
		{
			this.name = name;
			this.rollNo = rollNo;
		}
		
	        
		     public static void main(String[] args) 
		        {
		    	 Student1 s = new Student1(120,"pawan");
		    	 System.out.println(s);                      //printing address only not value
		    	 System.out.println(s.toString());           //printing address only not value
				}

	}


