
public class MatriceComplex {
	NumarComplex[][] matrice;
	
	MatriceComplex(int rows,int col){
		matrice=new NumarComplex[rows][col];	
	}
	
	public MatriceComplex adunare(MatriceComplex b,int n,int m) {	
		MatriceComplex rezultat = new MatriceComplex(n,m);
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				rezultat.matrice[i][j]=b.matrice[i][j].adunare(matrice[i][j]);	
			}
		}
		return rezultat;
	}
	
	
	

	
}
