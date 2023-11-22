package a;

public class MainClass {

	public static void main(String[] args) {
	 int varsta = 18;
	 int sex = 1;
	 int inaltime = 200;
	 
	 short saorma=0;
	 
	 saorma= (short) varsta;
	 
	 System.out.println(Integer.toBinaryString(saorma));
	 
	 saorma= (short)(saorma<<1);
	 
	 System.out.println(Integer.toBinaryString(saorma));
	 
	 saorma=(short)(saorma|sex);
	 
	 System.out.println(Integer.toBinaryString(saorma));
	 
	 saorma=(short)(saorma<<8);
	 
	 saorma=(short)(saorma|inaltime);
	
	 System.out.println(Integer.toBinaryString(saorma));
	 
	 inaltime=saorma & 0b11111111;
	 sex=(saorma >> 8 ) & 0b1;
	varsta=(saorma >> 9) & 0b11111; 
	
	 System.out.println(Integer.toBinaryString(inaltime));
	 System.out.println(Integer.toBinaryString(sex));
	 System.out.println(Integer.toBinaryString(varsta));
	}

}
