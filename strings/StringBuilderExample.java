package strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello ");  
		sb.append("Java");
		System.out.println(sb);
		sb.insert(1,"Java");
		System.out.println(sb);
		sb.replace(1,3,"Java");  
		System.out.println(sb);
		sb.delete(1,3);  
		System.out.println(sb);
		sb.reverse();  
		System.out.println(sb);
		System.out.println(sb.capacity());
		sb.append("Java");  
		System.out.println(sb.capacity()); 
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());
		sb.append("All");  
		System.out.println(sb.capacity());
		sb.append("java is my favourite language");  
		System.out.println(sb.capacity());
		sb.ensureCapacity(10); 
		System.out.println(sb.capacity());
		sb.ensureCapacity(50); 
		System.out.println(sb.capacity());
		sb.ensureCapacity(100); 
		System.out.println(sb.capacity());
	}

}
