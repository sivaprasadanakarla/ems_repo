package collections;
import java.util.*;
public class ArrayListNumbesr {
	public static void main(String []args)
	{
		 ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		    myNumbers.add(10);
		    myNumbers.add(15);
		    myNumbers.add(20);
		    myNumbers.add(25);
		    System.out.println(myNumbers.size());
		    System.out.println(myNumbers.get(0));
		    myNumbers.remove(0);
		   	 for (int i = 0; i < myNumbers.size(); i++) {
		         System.out.println(myNumbers.get(i));
		       }
		   /* for (int i : myNumbers)
		    {
		      System.out.println(i);
		    }*/
	}

}
