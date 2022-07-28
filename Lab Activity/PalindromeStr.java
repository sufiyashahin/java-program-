package Java;

public class PalindromeStr {

	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer("wow");
		String c=sb.toString();
		
		sb.reverse();
		
		if(c.contentEquals(sb)) {
			System.out.println("string is a palindrome");
		}
		else {
			System.out.println("string is not a palindron");
		}
		
	}

}
