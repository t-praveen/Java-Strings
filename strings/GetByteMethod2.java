package strings;
import java.nio.charset.Charset;
import java.util.Arrays;


public class GetByteMethod2 {

	public static void main(String[] args) {
		
		String str = "Praveen";
		byte[] byteArray ;
		byteArray = str.getBytes(Charset.forName("UTF-8"));
		System.out.println(Arrays.toString(byteArray));
		byteArray = str.getBytes(Charset.forName("UTF-16"));
		System.out.println(Arrays.toString(byteArray));

	}

}
