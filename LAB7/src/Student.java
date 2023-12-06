
public class Student implements Cloneable {
   private String nume;
   private int id;
   private Masina masina;
   
   public Student(String nume,int id, Masina masina) {
	   this.nume=nume;
	   this.id=id;
	   this.setMasina(masina);
   }
   
   public Student clone() {
	     
	   Student copie;
	try {
		copie = (Student)super.clone();
		// copie.masina=masina.clone();
		copie.masina=new Masina(masina.getModel(),masina.getCuloare());
	} catch (CloneNotSupportedException e) {
	     return null;
	}   
	   return copie;
	
   }
   
   
   public String toString() {
	   return "numele stundetului este " + nume + " cu id ul "+id+" si masina "+getMasina();
   }

   public Masina getMasina() {
	   return masina;
	}

	public void setMasina(Masina masina) {
		this.masina = masina;
	}
   
   
   
}
