package strings;

public class MatchesMethod {

	public static void main(String[] args) {

		String regex = "^a...s$";

	    System.out.println("abs".matches(regex)); // false
	    System.out.println("alias".matches(regex)); // true
	    System.out.println("an abacus".matches(regex)); // false
	    System.out.println("abyss".matches(regex)); // true

	    
	    String regex1 = "^[0-9]+$";

	    System.out.println("123a".matches(regex1)); // false
	    System.out.println("98416".matches(regex1)); // true
	    System.out.println("98 41".matches(regex1)); // false

	    
		
	}

}
