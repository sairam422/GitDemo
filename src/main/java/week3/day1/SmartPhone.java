package week3.day1;

public class SmartPhone extends AndroidPhone{
	public void connectWhatsapp() {
		System.out.println("Connect WhatsApp");
	}
	
	
	public void takeVideo() {
		System.out.println("Taking Video from smart phone");	

		}
	
	public static void main(String[] args) {
		
		SmartPhone myPhone = new SmartPhone();
		myPhone.connectWhatsapp();
		myPhone.takeVideo();
		myPhone.makeCall();
		myPhone.sendMsg();
		myPhone.saveContact();
	}

}
