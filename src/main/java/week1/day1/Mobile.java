package week1.day1;

public class Mobile {
	
	public void sendSMS() {
		System.out.println("Sending SMS");
	}
	public void takePhoto() {
		System.out.println("Take Photo");
	}
	public void makeCall() {
		System.out.println("Make Call");
	}
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.sendSMS();
		mob.takePhoto();
		mob.makeCall();
	}

}
