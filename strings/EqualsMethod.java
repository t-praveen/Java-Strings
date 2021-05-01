package strings;

public class EqualsMethod {

	public static void main(String[] args) {
		
		 	String str1 = "Learn Java";
	        String str2 = "Learn Java";
	        String str3 = "Learn Kolin";
	        String str4 = "learn Java";
	        Boolean result;
	        result = str1.equals(str2);
	        System.out.println(result); 
	        result = str1.equals(str3);
	        System.out.println(result); 
	        result = str3.equals(str1);
	        System.out.println(result); 
	        
	        if (str1.equals(str3)) {
	            System.out.println("str1 and str3 are equal");
	        }
	        else {
	            System.out.println("str1 and str3 are not equal");
	        }
	        
	        
	        result = str1.equals(str4);// Equals method takes case consideration
	        System.out.println(result);		

	}

}
