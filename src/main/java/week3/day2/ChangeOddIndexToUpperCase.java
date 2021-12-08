package week3.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";

		for (int i = 0; i < test.length(); i++) {

			if (i % 2 != 0) {
				System.out.print(Character.toUpperCase(test.charAt(i)));
			} else
				System.out.print(test.charAt(i));

		}

		System.out.println("");
		
		  char[] charArray = test.toCharArray();
		  
		  for (int i = 0; i < charArray.length; i++) {
		  
		  if(i%2!=0) { System.out.print(Character.toUpperCase(charArray[i])); } else
		  System.out.print(charArray[i]); }
		  
		 

	}

}
