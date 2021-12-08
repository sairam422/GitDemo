package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input=371;
		int rem, calculated=0, original=input;
				
		while(input>0) {
			rem=input%10;
			calculated+=(rem*rem*rem);
			input=input/10;
		}
		
		if(calculated==original)
		{
			System.out.println(original+" is an Armstrong number");
		}
		else
			System.out.println(original+" is not an Armstrong Number");

	}

}
