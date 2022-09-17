package string;

public class Student2 {

	int rollno;
	String name;
	
	Student2(int rollno,String name)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
        public String toString()    // it is over ridden method of object class..helping in printing values instead of printing address
            {                                       //this method works internally ...showing just for learning purpose
	         return name+" "+rollno;
            }
	     public static void main(String[] args) {
		
	    	 
	    	 Student2 s = new Student2(120,"pawan");
	    	 System.out.println(s);
	    	 System.out.println(s.toString());
			}

}
