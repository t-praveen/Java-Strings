//Replace() String//

package strings;

public class ReplaceString {

	public static void main(String[] args) {
		
		String s1 = "Pqaveen";
		System.out.println("After implementing replace method ,  the 1st String is : "+s1.replace('q' , 'r'));
		String s2 = "Organisation";
		System.out.println("After implementing replace method ,  the 2nd String is : "+s2.replace('s' , 'z'));
		String s3 = "C++ Programming";
		System.out.println("After implementing replace method ,  the 3rd String is : "+s3.replace("C++" , "Java"));
		String s4 = "I Love You";
		System.out.println("After implementing replace method ,  the 4th String is : "+s4.replace("You" , "Myself"));
		String s5 = "Basketball";
		System.out.println("After implementing replace method ,  the 5th String is : "+s5.replace('o' , 'r'));
		String s6 = " I am Praveen";
		System.out.println("After implementing replace method ,  the 6th String is : "+s6.replace("You" , "Yes"));
		String s7 = "xxxyyyzzzz";
		System.out.println("After implementing replace method ,  the 7th String is "+s7.replace("xx" , "x"));
		// replace() method replaces substrings starting from the start to the end.
	}

}
