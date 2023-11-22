package test;

public class Produs {
	private String denumire;
	private Furnizor furnizorul;
	private int pret;
	private int cantitate;
	
	public Produs() {
		
	}
	
	public Produs(String denumire,Furnizor furnizor,int pret,int cantitate) {
		this.denumire=denumire;
		this.furnizorul=furnizor;
		this.pret=pret;
		this.cantitate=cantitate;		
	}
	
	public Furnizor getFurnizor() {
		return furnizorul;
	}
	
	public int getCantitate() {
		return cantitate;
	}
	
	public String getdenumire() {
		return denumire;
	}
	
	public int getPret() {
		return pret;
	}
	
	public void setFurnizor(Furnizor furnizor) {
		this.furnizorul=furnizor;
	}
	
	public void setCantitate(int n) {
		this.cantitate=n;
	}
	
	public String toString() {
		return "produsul " + denumire+ " cu pretul de " +pret+ " lei " + " furnizat de catre " + furnizorul.getNumeSRL();
	}
	
	
	
	
}
