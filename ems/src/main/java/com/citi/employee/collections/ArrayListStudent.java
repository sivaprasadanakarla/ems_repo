package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

class Employee implements Comparable
{
	String name,id;
	int bSal;
	Employee(String name,String id,int bSal){
		this.name=name;
		this.id=id;
		this.bSal=bSal;
	}
	public String toString() {
		return "name="+name+"\n id="+id+" \n bsal="+bSal;
	}
	public int compareTo(Object obj) {
		Employee e =(Employee)obj;
		if(bSal==e.bSal)
		{
			return 0;
		}
		else if(bSal>e.bSal)
		{
		return 1;	
		}
		else {
			return -1;
		}
		
	}
}
public class ArrayListStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the nuber of emplooyees");
		int no=Integer.parseInt(s.nextLine());
		ArrayList al=new ArrayList();
		System.out.println("enter the emp data");
		for(int i=0;i<=no;i++)
		{
			System.out.println("enter the name");
			String name=s.nextLine();
			System.out.println("enter the id");
		String id=s.nextLine();
		System.out.println("enter the bsal");
		int bsal=Integer.parseInt(s.nextLine());
		al.add(new Employee (name,id,bsal));
		
		}
		
		Collections.sort(al);
System.out.println("dis employee data ");
Iterator it=al.iterator();
while(it.hasNext()) {
	Employee k=(Employee) it.next();
	System.out.println(k);
}

	}

}
