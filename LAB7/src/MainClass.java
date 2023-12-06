
public class MainClass {

	public static void main(String[] args) {
		Masina trabant=new Masina("trabant","rosie",1);
		
		Masina m=new Masina("porsch","galbena",2);
		Masina m1=new Masina("bmw","negara",3);
		Masina m2=new Masina("bac","gri",44);
		
		Masina arr[]=new Masina[3];
		arr[0]=m;
		arr[1]=m1;
		arr[2]=m2;
		
		
		
		Student s=new Student("David",10,trabant);
		
		Student s1;
		s1=s.clone();
		
		System.out.println(s);
		System.out.println(s1);
		
		s1.getMasina().revopsire("neagra");
		
		System.out.println(s1);
		System.out.println(s);

	}

}
