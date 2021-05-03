package strings;
import java.util.ArrayList;

public class ObjectHashCodeMethod {

	public static void main(String[] args) {
		
		Object obj1 = new Object();
	    System.out.println(obj1.hashCode());  
	    Object obj2 = new Object();
	    System.out.println(obj2.hashCode()); 
	    Object obj3 = new Object();
	    System.out.println(obj3.hashCode());  
	    
	    
	    String str = new String();
	    System.out.println(str.hashCode());
	    ArrayList<Integer> list = new ArrayList<>();
	    System.out.println(list.hashCode());  

		
	    Object obj4 = new Object();
	    Object obj5 = obj4;
	    System.out.println(obj4.equals(obj5));
	    System.out.println(obj4.hashCode());   
	    System.out.println(obj5.hashCode());


	    
	}

}
