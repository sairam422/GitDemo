package week1.day1;

public class LearnLoopingStatements {

	public static void main(String[] args) {
		
	/*	for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}*/
		
		for (int i = 1; i < 10; i++) {
			if(i==3) {
				System.out.println("Three");
				//break;
				continue;
			}
			System.out.println(i);
			
		}
		/*for(int i=2;i<=10;i=i+2) {
			System.out.println(i);
		}*/
		/*for(int i=10;i>0;i--) {
			System.out.println(i);
		}*/
		
		
		/*for(int i=1; i<=10;i++) {
			System.out.println(i);
		}*/

	}

}
