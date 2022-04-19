package collections;
import java.util.*;

public class ArraySort {
	public static void main(String[]args)
	{
		int i;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter the element");
			int no=s.nextInt();
			ArrayList<Integer> al=new ArrayList<Integer>();
			System.out.println("enter the elemenet");
			for(i=0;i<=no;i++) {
				{
					al.add(s.nextInt());
				}
				System.out.println("display before sorting");
				Iterator<Integer> it=al.iterator();
				while (it.hasNext())
					{
					System.out.println(it.next()+" ");
				}
				Collections.sort(al);
				System.out.println("display after string");
				
				ListIterator<Integer> it1=al.listIterator();
				while (it.hasNext())
				{
					System.out.println(it1.next()+" ");
				}
				System.out.println("\n display decending order");
				while(it1.hasPrevious())
				{
					System.out.println(it1.previous()+" ");
				}
						
			}
		}
		
	}
}
