//Join() Method//

package strings;
import java.util.ArrayList ;

public class JoinMethod {

	public static void main(String[] args) {
	
		String result;

	    result = String.join("-", "Java", "is", "fun");
	    System.out.println(result);
	    
	    ArrayList<String> text = new ArrayList<>();

	    // adding elements to the arraylist
	    text.add("Java");
	    text.add("is");
	    text.add("fun");

	    String result1;

	    result1 = String.join("-", text);
	    System.out.println(result1);


		
	}

}
