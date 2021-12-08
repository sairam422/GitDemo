package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";

		String[] textSplit = text.split(" ");
		
		Set<String> setValues = new LinkedHashSet<String>();
		
		/*
		 * for (String textSplitValues : textSplit) { setValues.add(textSplitValues); }
		 * 
		 * 
		 * 
		 * for (String setValuesEach : setValues) { System.out.print(setValuesEach+" ");
		 * }
		 */
		
		

		
		for (int i = 0; i < textSplit.length; i++) {
			for (int j = i + 1; j < textSplit.length; j++) {

				if (textSplit[i].equals(textSplit[j])) {
					textSplit[j] = "";
				}
			}


			if (textSplit[i] != "")
				System.out.print(textSplit[i] + " ");

		}
		 
	}

}