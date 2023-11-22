
public class Autobuz extends Autovehicul {
     int ruta;
      
     public Autobuz(int ruta) {
    	 super(new Sofer());
    	 this.ruta=ruta;
     }
     
     void acceleratie(int delta) {
    	 if(vitezaCurenta<vitezaMaxima) {
    		 vitezaCurenta+=delta;
    	 }
     }
     
}
