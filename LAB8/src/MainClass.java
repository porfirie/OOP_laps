import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("introduceti pin-ul ");
		int pin = 0;
		do {
	    try {
			pin = input.nextInt();
	    }catch(InputMismatchException e){
	    	System.out.println("Ati gresit pin-ul!");
	    	input.next();
	    }
	    try {
	    	float hash=1/pin;
	    }catch(Exception ex){
	    	System.out.println("exceptie");
	    	input.next();
	    }
		}while(true);	
	    
		

	
	}
}
