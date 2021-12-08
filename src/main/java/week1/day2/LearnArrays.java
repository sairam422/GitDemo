package week1.day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		int arr[] = new int[5]; // array declaration
		arr[0]=4;
		arr[1]=7;
		arr[2]=2;
		arr[3]=3;
		arr[4]=9;
		
		int arr1[]= {10,20,30,5,15};
		String names[]= {"Sai","Ram","Chandra","Bhanu"};
		
		System.out.println("Array length: "+arr.length);
		Arrays.sort(arr1);

		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i]); }
		 * 
		 * for (int i = arr.length-1; i >=0; i--) { System.out.println(arr[i]); }
		 */
		
		
		/*
		 * for (int arr_var : arr) { System.out.println(arr_var); }
		 */
		
		for (int arr1_v : arr1) {
			System.out.println(arr1_v);
		}
		
		for (String string_nam : names) {
			System.out.println(string_nam);
		}
		
		int mul_arr[][]= {{10,20}, {30,40},{50}};
		System.out.println(mul_arr.length);
		System.out.println(mul_arr[2].length);
		for (int i = 0; i < mul_arr.length; i++) {
			for (int j = 0; j < mul_arr[i].length; j++) {
				
				System.out.print(mul_arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		

	}

}
