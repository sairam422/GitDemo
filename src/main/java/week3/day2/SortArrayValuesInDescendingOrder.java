package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayValuesInDescendingOrder {

	public static void main(String[] args) {
		String[] input = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		List<String> listValues = new ArrayList<String>();
		
		for (String eachInput : input) {
			listValues.add(eachInput);
		}
		
		Collections.sort(listValues);
		
		for (int i = listValues.size()-1; i >= 0; i--) {
			System.out.println(listValues.get(i));
		}
	}

}
