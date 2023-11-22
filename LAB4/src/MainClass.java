import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		  Sofer driver = new Sofer("andre","pop",18,1234);
		Autovehicul auto = new Autovehicul("Porsche",Color.BLACK,350,7,driver);
     
		auto.accelerare(20);
		System.out.println(auto);
		 auto.accelerare(150);
		System.out.println(auto);
		auto.decelerare(90);
		System.out.println(auto);
		auto.decelerare(20);
		System.out.println(auto);
		auto.oprire();
		System.out.println(auto);
		auto.accelerare(400);
		System.out.println(auto);
		
		String test;
		
		test=auto.getNumeSofer();
		System.out.println(test);
	}

}
 