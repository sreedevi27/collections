import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> al=new ArrayList<Integer>();
     for(int i=0;i<=10;i++) {
    	 al.add(i);
    	 
     }
     System.out.println("Elements in list :" + al);
     Iterator<Integer> it= al.iterator();
     while(it.hasNext()) {
    	 Integer i= (Integer) it.next();
    	 if((i%2)==0)
    		 System.out.println("Even number"+ i);
    	 else
    		// System.out.println("odd number"+ i);
    	 it.remove();
     }
     System.out.println("Even number"+ al);
	}
	

}
