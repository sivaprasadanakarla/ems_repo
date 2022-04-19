package collections;

import java.util.Iterator;
import java.util.Stack;

public class DemoStack2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack<Integer> st=new Stack<Integer>();
st.push(11);
st.push(1);
st.push(13);
st.push(9);
System.out.println("display from stack");
System.out.println(st);
System.out.println("display using iterator");
Iterator<Integer> it=st.iterator();
while(it.hasNext()) {
	System.out.println(it.next()+" ");
}
st.add(3,25);
System.out.println("\n display the elements ");
System.out.println(st);
	}

}
