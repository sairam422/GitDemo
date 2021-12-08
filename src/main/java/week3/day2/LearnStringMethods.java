package week3.day2;

public class LearnStringMethods {

	public static void main(String[] args) {
		
		String str = "Welcome to java session";
		String[] words = str.split(" ");
		
		/*
		 * for (int i = words.length-1; i >=0; i--) { System.out.print(words[i]+" "); }
		 */
		
		System.out.println(str.replace("e", "x"));
		
		System.out.println(str.replace("e", ""));
		

		/*
		 * String str1 = "Welcome";
		 * 
		 * for (int i = 0; i < str1.length(); i++) { System.out.println(str1.charAt(i));
		 * }
		 * 
		 * for (int i = str1.length()-1; i >=0; i--) { System.out.print(str1.charAt(i));
		 * }
		 * 
		 * char[] charArray = str1.toCharArray();
		 * 
		 * for (int i = 0; i < charArray.length; i++) {
		 * System.out.println(charArray[i]); }
		 * 
		 * //System.out.println(str1.length());
		 * 
		 * String str2 = "Welcome"; String str4 = str2.concat("12");
		 * 
		 * String str3 = new String ("welcome");
		 * 
		 * 
		 * System.out.println(str1==str2);
		 * 
		 * System.out.println(str1==str4);
		 * 
		 * System.out.println(str1 == str3);
		 * 
		 * 
		 * //System.out.println(str1.equals(str3));
		 * //System.out.println(str1.equalsIgnoreCase(str3));
		 * 
		 */ }

}
