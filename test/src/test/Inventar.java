package test;

public class Inventar {
   Produs[] produse;
   int SpatiuRamasInInventar;
   int i;
   
   
   public Inventar(int n) {
      this.produse = new Produs[n]; 
      this.SpatiuRamasInInventar=n;
      this.i=0;
   }
   
   public String getprodus(int x) {
	   return produse[x].getdenumire();
   }
   
   public void insertProdus(Produs produsul) {
	   int ok=0;
	   if(SpatiuRamasInInventar>0) {
		   for(int j=0;j<SpatiuRamasInInventar;j++) {
			   if(this.produse[0]==produsul) {
				   ok=1;
				 
			   }		   
		   }
	   }
	   if(ok==1) {
		   System.out.println("acest produse exista deja");
	   }else {
			this.produse[i]=produsul;
			SpatiuRamasInInventar--;
			i++;
	   }
	   
	  
   }
   
   public void listeazaProduse() {
	   for(int j=0;j<i;j++) {
		   System.out.println(produse[j].getdenumire());
	   }
   }
   
   public void gasesteProdus(String Nume) {
	   for(int j=0;j<i;j++) {
		   if(produse[j].getdenumire().equals(Nume)) {
			   System.out.println("Produsul "+Nume+" a fost gasit");
		   }
	   }
   }
   
   
   
   
   
   
}
