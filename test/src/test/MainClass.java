package test;

public class MainClass {

	public static void main(String[] args) {
		Inventar a = new Inventar(10);
		Furnizor ClujInport = new Furnizor("ImportCluj","ABC123",1234);
		Furnizor AlbaInport = new Furnizor("ImportAlba","DEF456",456);
		Furnizor BrasovInport = new Furnizor("ImportBrasov","GHI789",7890);
		
		Produs Ciocolata = new Produs("CiocolataMilka",ClujInport,4,100);
		Produs Lapte = new Produs("Lapte",AlbaInport,5,100);
		Produs Smantana = new Produs("Smantana",ClujInport,8,50);
		Produs Pui = new Produs("Piept de pui",BrasovInport,32,60);
		Produs Orez = new Produs("Orez basmate",BrasovInport,5,30);
		
		a.insertProdus(Orez);
		a.insertProdus(Orez);
		a.insertProdus(Pui);
		a.insertProdus(Smantana);
		a.insertProdus(Lapte);
		a.insertProdus(Ciocolata);
		
        a.gasesteProdus("Piept de pui");
		
        a.listeazaProduse();

 }
}
