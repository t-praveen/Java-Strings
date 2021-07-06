//EqualsIgnoreCase() Method//

package strings;

public class EqualsIgnoreCaseMethod {

	public static void main(String[] args) {

        String str1 = "Learn Java";
        String str2 = "learn java";
        String str3 = "Learn Kolin";
        String str4 = "LEARN JAVA";
        Boolean result;
        result = str1.equalsIgnoreCase(str2);
        System.out.println(result); 
        result = str1.equalsIgnoreCase(str3);
        System.out.println(result);
        result = str3.equalsIgnoreCase(str1);
        System.out.println(result);
        
        
        if (str1.equalsIgnoreCase(str4)) {
            System.out.println("str1 and str4 are equal");
        }
        else {
            System.out.println("str1 and str4 are not equal");
        }

        
        
    }
}

			
	
