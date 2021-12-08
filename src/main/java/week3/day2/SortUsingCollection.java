package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class SortUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		
		List<String> listValues = new ArrayList<String>();
		
		for (String eachInput : input) {
			listValues.add(eachInput);
		}
		
		for (String values : listValues) {
			System.out.println(values);
		}

	}

}
