import java.math.BigInteger;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		BigInteger nrTotal= new BigInteger("1");
		Scanner scanner= new Scanner(System.in);
		System.out.println("Introduce-ti nr de casute de sah");
		int nr_casute = scanner.nextInt();
		
		
		
			 nrTotal = nrTotal.multiply(BigInteger.valueOf(2).pow(nr_casute));
		 
		
		System.out.println("Nr de boabe de orez pe ultima casuta este "+ nrTotal);
		
		
		
		

	}

}
