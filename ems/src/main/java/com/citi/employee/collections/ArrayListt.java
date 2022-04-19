package collections;

import java.util.Scanner;
import java.util.*;
public class ArrayListt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of elements");
				int  no=s.nextInt();
				ArrayList<Integer>al=new  ArrayList<Integer>();
				System.out.println("enter the element");
				for(int i=0;i<no;i++) {
					al.add(s.nextInt());//auto boxing
				}
				System.out.println("display from arrayList");
				System.out.println("al");
				Integer sum=0;
				Iterator it=al.iterator();
				
				while(it.hasNext()) {
					Integer k=(Integer)it.next();
					sum=sum+k;
				}

	}

}
