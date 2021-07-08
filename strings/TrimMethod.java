//Trim() Method//

package strings;
import java.util.Scanner;

public class TrimMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
		String S1 = sc.nextLine();
		System.out.print("Enter Second String : ");
		String S2 = sc.nextLine();
		String S3 = "I Love\n Basketball\n\n";
		System.out.println("After implementing the trim method on 2nd String is : "+S1.trim());
		System.out.println("After implementing the trim method on 2nd String is : "+S2.trim());
		System.out.println("After implementing the trim method on 2nd String is : "+S3.trim());
		sc.close();

	}

}
