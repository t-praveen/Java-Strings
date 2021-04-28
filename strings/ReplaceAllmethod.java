package strings;

public class ReplaceAllmethod {

	public static void main(String[] args) {

		String s1 = "My nami es Praviin" ;
		System.out.println("After implementing the ReplaceAll method on the following string , the result is : "+s1.replaceAll("i" , "e"));
		String s2 = "I was a very good boy . I was a obedient person . I was honest .";
		System.out.println("After implementing the ReplaceAll method on the following string , the result is : "+s2.replaceAll("was" , "am"));
		String s3 = " I Love Basketball " ; 
		System.out.println("After implementing the ReplaceAll method on the following string , the result is : "+s3.replaceAll("\\s" , "")); //For removing all the white spaces .
		
	}

}
