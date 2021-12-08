package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		String test = "feeling good";
		
		char[] charArray = test.toCharArray();
		
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.print(charArray[i]);
		}
		
		System.out.println("");
		test.length();
		
		for (int i = test.length()-1; i >=0; i--) {
			System.out.print(test.charAt(i));
		}
		

	}

}
