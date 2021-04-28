package strings;

public class IndexOfMethod1 {

	public static void main(String[] args) {

		String str1 = "Learn Java";
	    int result;
	    result = str1.indexOf('J');
	    System.out.println("After implementing the IndexOf method on the following string , the result is : "+result); 
	    result = str1.indexOf('a');
	    System.out.println("After implementing the IndexOf method on the following string , the result is : "+result);
	    result = str1.indexOf('j');
	    System.out.println("After implementing the IndexOf method on the following string , the result is : "+result); 
	    result = str1.indexOf("ava");
	    System.out.println("After implementing the IndexOf method on the following string , the result is : "+result); 
	    result = str1.indexOf("java");
	    System.out.println("After implementing the IndexOf method on the following string , the result is : "+result); 
	    result = str1.indexOf("");
	    System.out.println("After implementing the IndexOf method on the following string , the result is : "+result);
	  }
}


