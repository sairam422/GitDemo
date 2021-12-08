package week3.day2;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		String text = "Tes12Le79af65";
		int sum=0;
		for (int i = 0; i < text.length(); i++) {
			if(Character.isDigit(text.charAt(i))) {
				sum=sum+Character.getNumericValue(text.charAt(i));
			}
		}System.out.println(sum);
		
		
		/*
		 * int sum=0; String textDigits=text.replaceAll("[^\\d.]", ""); char[] charArray
		 * = textDigits.toCharArray(); for (int i = 0; i < charArray.length; i++) {
		 * sum=sum+Character.getNumericValue(charArray[i]);
		 * 
		 * } System.out.println(sum);
		 */
		

	}

}
