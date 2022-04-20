package collections;
import java.util.*;
import java.util.HashMap;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner s=new Scanner(System.in);
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(101, "vijay");
		hm.put(102, "Rahul");
		hm.put(103, "AMIT");
		hm.put(104, "RAHL");
		System.out.println("iterating hash map");
		for(Map.Entry m : hm.entrySet()) 
                                    		 {
                                   			 System.out.println(m.getKey()+"" +m.getValue()); 
                                    		 }
	}
	
	
                                    	
}