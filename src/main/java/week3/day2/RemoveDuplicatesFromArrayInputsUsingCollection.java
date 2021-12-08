package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayInputsUsingCollection {

	public static void main(String[] args) {
		String[] input = {"HCL", "Wipro",  "Infosys", "Aspire Systems", "CTS","Infosys"};
		
		Set<String> setValues = new LinkedHashSet<String>();
		
		for (String eachInput : input) {
			setValues.add(eachInput);
		}
		
		for (String values : setValues) {
			System.out.println(values);
		}

	}

}
