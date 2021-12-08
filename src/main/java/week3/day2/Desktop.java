package week3.day2;

public class Desktop implements HardWare, Software{

	public void desktopModel() {
		System.out.println("Desktop Model");

	}

	public void softwareResources() {
		System.out.println("Software Resources");
		
	}

	public void hardwareResources() {
        System.out.println("Hardware Resources");
		
	}
	
	public static void main(String[] args) {
		Desktop dktp = new Desktop();
		dktp.desktopModel();
		dktp.softwareResources();
		dktp.hardwareResources();
	}
}
