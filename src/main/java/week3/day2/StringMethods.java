package week3.day2;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Hello World";
		String str1= "HEllo World";
		//System.out.println(str.charAt(1));
		//System.out.println(str.codePointAt(0));
		//System.out.println(str.codePointBefore(2));
		System.out.println(str.codePointCount(6, 8));
		System.out.println(str.compareTo(str1));
		
	}

}
