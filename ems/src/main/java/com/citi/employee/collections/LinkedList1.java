package collections;
import java.util.*;

public class LinkedList1 {
	public static void main(String[]args) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(12);
		ll.add(17);
		ll.add(12);
		ll.add(14);
		System.out.println("display from linkedlist");
		System.out.println(ll);
		ll.addFirst(10);
		ll.addLast(11);
		System.out.println("display the add first and add lst elements");
		ll.add(3,19);
		System.out.println("displayt after add elements postion 2");
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println("display elements after sorting");
		ListIterator<Integer> it=ll.listIterator();
		System.out.println("assending order");
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println("decending order");
	
while(it.hasPrevious()) {
		System.out.println(it.previous()+" ");
	}
	}
}
