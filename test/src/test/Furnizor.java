package test;

public class Furnizor {
	
	private String numeSRL;
	private String infoFiscal;
	private int bilant;
	
	public Furnizor() {
		
	}

	public Furnizor(String nume,String Fiscal ,int bilant ) {
		this.numeSRL=nume;
		this.infoFiscal=Fiscal;
		this.bilant= bilant;
	}
	
	public void setNumeSRL(String nume) {
		this.numeSRL=nume;
	}
	public void setInfoFiscal(String fiscal) {
		this.infoFiscal=fiscal;
	}
	public void setBilant(int bilant) {
		this.bilant=bilant;
	}
	
	public String getNumeSRL() {
		return numeSRL;
	}
	
	public String getinfoFiscal() {
		return infoFiscal;
	}
	
	public int getBilant() {
		return bilant;
	}
	
	public String toString() {
		return "Firma "+numeSRL+" cu fiscalul "+infoFiscal+" are bilantul de "+bilant;
	}
	
	
	
}
