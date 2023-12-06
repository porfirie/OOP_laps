
public class Bankaccount {

	int sold;
	
	void retragereNumerar(int suma) {
		if(suma>sold) {
			throw new Fondinsuficient ("mesaj");
		}
	}
	
}
