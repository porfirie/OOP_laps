
public class MainClass {
	

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	
	    public static void findPrimePair(int num) {
	        for (int i = 2; i <= num / 2; i++) {
	            if (isPrime(i) && isPrime(num - i)) {
	                System.out.println(num + " = " + i + " + " + (num - i));
	                return;
	            }
	        }
	        System.out.println("Nu se poate găsi o pereche de numere prime pentru " + num);
	    }
	    
	    
	    public static void ex1(int start,int end) {
	    	
	    	for (int i = start; i <= end; i += 2) {
	            findPrimePair(i);
	        }
	    }
	
	
	
	public static void ex2() {
		int varsta = 18;
		int gen = 1;
		int inaltime = 180;
		short wrap = 0; 
		wrap = (short)varsta;
		wrap = (short)(wrap << 1);
		wrap = (short)(wrap | gen);
		wrap = (short)(wrap << 8);
		wrap = (short)(wrap | inaltime);
		String test;
		
		System.out.println("varsta in binar   "+Integer.toBinaryString(varsta));
		System.out.println("gen in binar      "+Integer.toBinaryString(gen));
		System.out.println("inaltime in binar "+Integer.toBinaryString(inaltime));
		test= Integer.toBinaryString(wrap);
		System.out.println("wrap in binar     "+test);
	    
		inaltime = wrap & 0xff;
		gen = (wrap >> 8) & 1;
		varsta =(wrap >> 9) & 0x7f;
		
		System.out.println(inaltime);
		System.out.println(gen);
		System.out.println(varsta);
	}
    
	public static void consoane(String text) {
		int len= text.length();
		int consoane=0;
		int vocale=0;
		
		
		for(int i=0 ;i<len;i++) {
			int ch=text.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vocale++;
			}else {
				consoane++;
			}
		}
		System.out.println("consoane "+consoane);
		System.out.println("vocale "+vocale);
	}
	
	
	
	
	public static void main(String[] args) {
	//ex2();
	//ex1(10,20);
		//consoane("masina");
		
		String st1="ana are ";
		String st2="mere";
		String st3="ana are mere";
		System.out.println(st1+st2);
		System.out.println(st1+st2==st3);
		System.out.println((st1+st2).equals(st3));
	}
	
}
