package collections;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.size());
	    System.out.println(cars.get(0));
	     cars.remove(0);
	   	 for (int i = 0; i < cars.size(); i++) {
	         System.out.println(cars.get(i));
	       }
	}

}
