package strings;

public class ContainsMethod {

	public static void main(String[] args) {
		
		 String str1 = "Learn Java";
		    String str2 = "Java";
		    String str3 = "java";
		    boolean result ;
		    result = str1.contains("Java");
		    System.out.println(result);
		    
		    result = str1.contains("Python");
		    System.out.println(result);
		    
		    result = str1.contains("");
		    System.out.println(result); 


		    if (str1.contains(str2)) {
		      System.out.println(str1 + " contains " + str2);
		    }
		    else {
		      System.out.println(str1 + " doesn't contains " + str2);
		    }
		    if (str1.contains(str3)) {
		      System.out.println(str1 + " contains " + str3);
		    }
		    else {
		      System.out.println(str1 + " doesn't contain " + str3);
		    }
	}

}
