import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		Autovehicul auto = new Autovehicul("Porsche",Color.BLACK,350,7);

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
	}

}
 