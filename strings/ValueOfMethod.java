//ValueOf() Method//

package strings;
import java.util.ArrayList;

public class ValueOfMethod {

	public static void main(String[] args) {
		
		 int a = 5;
		    long l = -2343834L;
		    float f = 23.4f;
		    double d = 923.234d;
		    System.out.println(String.valueOf(a));  
		    System.out.println(String.valueOf(l));  
		    System.out.println(String.valueOf(f)); 
		    System.out.println(String.valueOf(d));
		    
		    
		    char c = 'J';
		    char ch[] = {'J', 'a', 'v', 'a'};
		    System.out.println(String.valueOf(c)); 
		    System.out.println(String.valueOf(ch));
		    
		    
		    char ch1[] = {'p', 'r', 'o', 'g', 'r', 'a', 'm'};
		    int offset = 2;
		    int length = 4;
		    String result;
		    result = String.valueOf(ch1, offset, length);
		    System.out.println(result); 
		    
		    
		    ArrayList<String> languages = new ArrayList<String>();
		    languages.add("Java");
		    languages.add("Python");
		    languages.add("Kotlin");

		    String result1;
		    result1 = String.valueOf(languages);
		    System.out.println(result1);



		    

		
		
	}

}
