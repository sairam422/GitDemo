package week1.day1;

public class LearnConditionalStatements {

	public static void main(String[] args) {
		int age=10;
		
		if(age<18) {
			System.out.println("child");
		}
		else if(age>=18 && age <60) {
			System.out.println("adult");
		}
		else if(age>=60) {
			System.out.println("senior citizen");
		}
		
		/*if(age>17) {
			System.out.println("adult");
		}
		else {
			System.out.println("Child");
		}*/

	}

}
