
public class NumarComplex {
	private int R;
	private int I;
	
	public NumarComplex(int R,int I) {
	this.R=R;
	this.I=I;
	}
	
	public NumarComplex adunare(NumarComplex b) {
		NumarComplex rezultat = new NumarComplex(0,0);
		rezultat.R=b.R+R;
		rezultat.I=b.I+I;
		return rezultat;
	}
	
	public NumarComplex diferenta(NumarComplex b) {
		NumarComplex rezultat = new NumarComplex(0,0);
		rezultat.R=R-b.R;
		rezultat.I=I-b.I;
		return rezultat;
	}
	
	public NumarComplex inmultire(NumarComplex b) {
		NumarComplex rezultat = new NumarComplex(0,0);
		rezultat.R=R*b.R-I*b.I;
		rezultat.I=R*b.I+I+b.R;
		return rezultat;
	}
	
	public int getR() {
		return this.R;
	}
	
	public int getI() {
		return this.I;
	}
	
	
	public String toString() {
		return R +"+"+I+"i";
	}
	
	
	
	
	
}
