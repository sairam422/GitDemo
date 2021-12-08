package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		
		char[] charArray = str.toCharArray();
		int charCount=0;
		
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='e') {
				charCount+=1;
			}
		}
		
		System.out.println(charCount);
		
		

	}

}
