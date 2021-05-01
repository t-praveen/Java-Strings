package strings;

public class StartsWithMethod {

	public static void main(String[] args) {
	

	    String str = "Java Programming";
	    System.out.println(str.startsWith("Java")); 
	    System.out.println(str.startsWith("J")); 
	    System.out.println(str.startsWith("Java Program")); 
	    System.out.println(str.startsWith("java")); 
	    System.out.println(str.startsWith("ava")); 
	
	    String str1 = "Java Programming";
	    System.out.println(str1.startsWith("Java", 3)); 
	    System.out.println(str1.startsWith("a Pr", 3)); 

		

	}

}
