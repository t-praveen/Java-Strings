package strings;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		
		
		    String str = "Java Programming";
		    char result[];
		    result = str.toCharArray();
		    System.out.println(result);
		    
		    String s1 = "Welcome to Javatpoint";  
	        char[] ch = s1.toCharArray();  
	        int len = ch.length;  
	        System.out.println("Char Array length: " + len);  
	        System.out.println("Char Array elements: ");  
	        for (int i = 0; i < len; i++) {  
	            System.out.println(ch[i]);  
	        }  

		
	}

}
