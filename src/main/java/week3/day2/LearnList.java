package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		/*
		 * List values = new ArrayList();
		 * 
		 * values.add("Sai"); values.add(100); values.add(true); values.add(9.453);
		 */

		List<String> values = new ArrayList<String>();

		values.add("Sai");
		values.add("Ram");
		values.add("Gubbala");
		values.add("Chandra");
		values.add("Sai");
		values.add("Moni");

		List<String> newValues = new ArrayList<String>(values);
		// to copy data from one collection to another collection
		// newValues.addAll(values);
		newValues.add("maddela");
		values.remove(4);
		values.remove("Gubbala");

		System.out.println(values.size());

		/*
		 * System.out.println(values.get(0)); System.out.println(values.get(1));
		 * System.out.println(values.get(values.size()-1));
		 */

		Collections.sort(newValues);

		for (String getValues : newValues) {

			System.out.println(getValues);
		}

		/*
		 * for (int i = 0; i < values.size(); i++) { System.out.println(values.get(i));
		 * 
		 * }
		 */

		/*
		 * List<Integer> values = new ArrayList<Integer>();
		 * 
		 * values.add(100); values.add(200); values.add(300); values.add(400);
		 */

	}

}
