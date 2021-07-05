//CompareTo() Method//

package strings;
import java.util.Scanner ;

public class CompareToMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String S1 = sc.nextLine();
		System.out.print("Enter Second String : ");
		String S2 = sc.nextLine();
		System.out.print("Enter Third String : ");
		String S3 = sc.nextLine();
		int result ; 
		result = S1.compareTo(S2);
		System.out.println("After implmenting the CompareTo Method , the first result is : "+result);
		result = S1.compareTo(S3);
		System.out.println("After implmenting the CompareTo Method , the second result is : "+result); //str1 comes before str3 in the dictionary order. Hence, str1.compareTo(str3) returns negative
		result = S3.compareTo(S1);
		System.out.println("After implmenting the CompareTo Method , the third result is : "+result);  //str3 comes after str1 in the dictionary order. Hence, str3.compareTo(str1) returns positive
		
		//TO Check Two Strings are equal or not
		if(S1.compareTo(S2) == 0)
			System.out.println("Yes , the given 2 strings are equal .");
		else
			System.out.println("Yes , the given 2 strings are not equal .");
		
		//Compare with case
		result = S2.compareTo(S3);
		System.out.println("After implmenting the CompareTo Method , the result is : "+result);
		sc.close();
	}

}
