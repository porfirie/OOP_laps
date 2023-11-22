
public class MainClass {

	public static void main(String[] args) {
		NumarComplex a= new NumarComplex(5,2);
		NumarComplex b= new NumarComplex(1,-1);
		NumarComplex suma =new NumarComplex(0,0);
		NumarComplex diferenta =new NumarComplex(0,0);
		NumarComplex produs =new NumarComplex(0,0);
		suma=a.adunare(b);
		diferenta=a.diferenta(b);
		produs=a.inmultire(b);
		//System.out.println(suma);
	//	System.out.println(diferenta);
		//System.out.println(produs);
		
		int [] arr=new int[] {1,2,3};
		int [] arr2=new int[3];
		
		//System.arraycopy(arr, 0, arr2, 0, 0);
		//System.out.println(arr2[1]);
		
		
		
		int [][]matrice= new int[3][3];
		int row=matrice.length;
		int col=matrice[0].length;
		
		MatriceComplex mat1= new MatriceComplex(2,2);
		mat1.matrice[0][0]=new NumarComplex(2,3);
		mat1.matrice[0][1]=new NumarComplex(3,5);
		mat1.matrice[1][0]=new NumarComplex(5,7);
		mat1.matrice[1][1]=new NumarComplex(1,1);
		
		
		MatriceComplex mat2= new MatriceComplex(2,2);
		mat2.matrice[0][0]=new NumarComplex(2,3);
		mat2.matrice[0][1]=new NumarComplex(3,5);
		mat2.matrice[1][0]=new NumarComplex(5,7);
		mat2.matrice[1][1]=new NumarComplex(1,1);
		
		MatriceComplex rez= new MatriceComplex(2,2);
		
		rez = mat1.adunare(mat2, 2, 2);
	
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				//System.out.print(rez.matrice[i][j]+" " );
			}
			//System.out.println();
		}
	}

}
