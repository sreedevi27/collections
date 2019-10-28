import java.util.*;

public class EnumerationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<Integer> v=new Vector<Integer>();
for(int i=0;i<=10;i++) {
	v.addElement(i);	
}
System.out.println("Vector elements: "+v);
Enumeration<Integer> e= v.elements();

	while(e.hasMoreElements()) {
		Integer i=(Integer)e.nextElement();
		if((i%2)==0)
			System.out.println("Even Numbers:" + i);
		
		
		
	}
	
	System.out.println("Vector elements: "+v);
	
	}
	
}
