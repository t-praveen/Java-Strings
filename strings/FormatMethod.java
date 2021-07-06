//Format() Method//

package strings;

public class FormatMethod {

	public static void main(String[] args) {

		String language = "Java";
	    int number = 30;
	    String result;
	    result = String.format("Language: %s", language);
	    System.out.println(result);
	    result = String.format("Hexadecimal Number: %x", number);
	    System.out.println(result); 

		
	    int n1 = 47;
	    float n2 = 35.864f;
	    double n3 = 44534345.76d;
	    System.out.println(String.format("n1 in octal: %o", n1));
	    System.out.println(String.format("n1 in hexadecimal: %x", n1));  
	    System.out.println(String.format("n1 in hexadecimal: %X", n1));
	    System.out.println(String.format("n1 as string: %s", n1));
	    System.out.println(String.format("n3 in scientific notation: %g", n3)); 
	    
	    
	    int n4 = 47;
	    String text = "Result";
	    System.out.println(String.format("%s\nhexadecimal: %x", text, n4));

	    
	    float n5 = -452.534f;
	    double n6 = -345.766d;
	    System.out.println(String.format("n1 = %.2f", n5)); 
	    System.out.println(String.format("n2 = %.2f", n6)); 
	    
	    int n7 = 46, n8 = -46;
	    String result1;
	    result1 = String.format("|%5d|", n7);
	    result1 = String.format("|%05d|", n7); 
	    System.out.println(result);
	    result1 = String.format("%+d", n7); 
	    System.out.println(result1);
	    result1 = String.format("%+d", n8); 
	    System.out.println(result1);
	    result1 = String.format("%(d", n8); 
	    System.out.println(result1);




	    
	    
	}

}
