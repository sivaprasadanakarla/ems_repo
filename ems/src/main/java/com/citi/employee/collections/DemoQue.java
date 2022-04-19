package collections;

import java.util.PriorityQueue;

public class DemoQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
pq.add(12);
pq.add(13);
pq.add(1);
pq.add(3);
System.out.println("Display From queue");
System.out.println(pq);
pq.add(2);
System.out.println("display from queue");
System.out.println(pq);
pq.add(11);
System.out.println("display from queue");
System.out.println(pq);
System.out.println("remove="+pq.remove(3));
System.out.println("display from queue");
System.out.println(pq);
System.out.println("peek="+pq.peek());
System.out.println("element"+pq.element());
	}

}
