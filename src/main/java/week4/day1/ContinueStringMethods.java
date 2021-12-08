package week4.day1;

public class ContinueStringMethods {

	public static void main(String[] args) {
		String str="Welcome123";
		
		String subStr = str.substring(4);
		System.out.println(subStr);
		
		String subStrBound = str.substring(3, 8);
		System.out.println(subStrBound);
		
		/*
		 * String noSpaceStr = str.replaceAll("[^0-9]", "");
		 * System.out.println(noSpaceStr);
		 */
		
		/*
		 * //replace 'e' with 'x'
		 * 
		 * String newStr = str.replace('e', 'x');
		 * 
		 * System.out.println(newStr);
		 * 
		 * int OriginalLen=str.length();
		 * 
		 * //remove the letter 'e'
		 * 
		 * String replaceStr = str.replace("e", ""); System.out.println(replaceStr);
		 * 
		 * int modifiedLen=replaceStr.length();
		 * 
		 * System.out.println(OriginalLen-modifiedLen);
		 */

	}

}
