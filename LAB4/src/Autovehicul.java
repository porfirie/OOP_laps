import java.awt.Color;

public class Autovehicul {
	
private Sofer driver;	
private String marca;
private Color culoare;
private int treaptaDeViteza;
private int treaptaMax;
private float vitezaMax;
private float vitezaCurenta;


public Autovehicul() {
	
}
public Autovehicul(String marca,Color culoare,float vitezaMax,int treaptaMax) {
	
	this.marca = marca;
	this.culoare = culoare;
	this.vitezaMax = vitezaMax;
	this.treaptaMax = treaptaMax;
	this.vitezaCurenta=0;
	this.treaptaDeViteza=0;
}

public String getMarca() {
	return marca;
}


public Color getCuloare() {
	return culoare;
}

public float getVitezaMax() {
	return vitezaMax;
}

public int getTreaptaDeViteza() {
	return treaptaDeViteza;
}

public int getTreaptaMax() {
	return treaptaMax;
}

 

public void calculeazaTreapta(int i) {
	i=i/10;
	if(i<=treaptaMax) {
       this.treaptaDeViteza=i;
	}else {
		this.treaptaDeViteza=treaptaMax;
	}
}

public void accelerare(float delta) {
	if(vitezaCurenta+delta<vitezaMax) {
	this.vitezaCurenta = vitezaCurenta + delta;
	calculeazaTreapta((int)vitezaCurenta);
	}else {
		System.out.println("STAHL");
	}
}

public void decelerare(float delta) {
	this.vitezaCurenta = vitezaCurenta - delta;
	calculeazaTreapta((int)vitezaCurenta);
}

public void oprire() {
	 this.vitezaCurenta=0;
	 this.treaptaDeViteza=0;
 }

public String toString() {
	return "Marca este " +marca+ " are viteza curenta de "+vitezaCurenta+"km/h "+"si se afla in treapta "+treaptaDeViteza;
}

}
