//GetBytes() Method//

package strings;
import java.util.Arrays;


public class GetBytesMethod {

	public static void main(String[] args) {
		
		String str = "Praveen";
		byte[] byteArray ;
		byteArray = str.getBytes();
		System.out.println(Arrays.toString(byteArray));
		

	}

}
