package collections;

import java.util.Scanner;
import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		int choice=0;
		int position,element;
		Scanner s=new Scanner(System.in);
		int ch=s.nextInt();
		System.out.println("enter the value for choice");
		
	while(choice<4) {
		System.out.println(":stack operations");
		System.out.println("1.push()");
		System.out.println("2.pop()");
		System.out.println("3.search()");
		System.out.println("4.exit()");
		System.out.println("enter year choice");
		choice =s.nextInt();
	
		switch(choice)
		{
		case 1:
			System.out.println("enterthe elements");
		element=s.nextInt();
		st.push(element);
		break;
		case 2:
			Integer obj=st.pop();
		System.out.println("the poped ele:"+obj);
		break;
		case 3:
			System.out.println("which element");
		element=s.nextInt();
		position=st.search(element);
		
		if(position==-1) 
			System.out.println("element not found");
		else
			System.out.println("element position="+position);
		break;
		default:return;
		}
		System.out.println("stack elements are"+st);
	}	
	
}
	}

	
	

