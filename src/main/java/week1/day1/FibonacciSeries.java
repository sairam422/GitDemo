package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=10,firstNum=0,secNum=1,sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=2;i<range;i++) {
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			/*secNum=firstNum;
			firstNum=sum;*/
			System.out.println(sum);
		}

	}

}
