import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainClass {

	public static void main(String[] args) {
		List<String> cars =new ArrayList<String>();
		ListIterator<String> carsIt= cars.listIterator();
		
		
		cars.add("dacia");
        cars.add("Porsche");
        cars.add("mercedes");
        
        for(int i=0;i<cars.size();i++) {
        	if(cars.get(i).equals("daacia")) {
        		System.out.println("dacia");
        	}
        }
        
        int i=0;
        for(String car : cars) {
        	
        	if(car.equals("dacia")) {
        		cars.set(i,"toyota");
        	}
        	i++;
        }
        
        for(String car: cars) {
        	System.out.println(car+" ");
        }
        
        
//        while (carsIt.hasNext()) {
//            String car = carsIt.next();
//            if (car.equals("dacia")) {
//                carsIt.remove();  
//                cars.add("toyota"); 
//            }
//        } 
	}

}
