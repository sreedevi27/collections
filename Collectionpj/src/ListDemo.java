//import java.util.*;
import java.util.ArrayList;
import java.util.List;



public class ListDemo {

	public static void main(String[] args) {
		
		
		
		List<String> l=new ArrayList<>();
	
		
		List<Integer> l1=new ArrayList<>();
      
		List<Object> o =new ArrayList<>();
		l.add("D1");
		l1.add(2);
		l.add(null);
		o.add("Devi");
		o.addAll(1,o);
		System.out.println("String :" + l);
		System.out.println("integer :" + l1);
		System.out.println("Null :" + l);
		System.out.println("First occurance: " +o.indexOf(o));
		System.out.println("Object: " +o);
		
		System.out.println("Get :" + o.get(0));
		System.out.println("Replace :"+ o.set(1,"sree"));
		System.out.println("Last occurance: " +o.lastIndexOf(o));
		System.out.println("After Replace: " + o);
		System.out.println("Removing Element: " +o.remove(1));
		System.out.println("False,having 0 index value : " +o.remove(o));
		System.out.println("Empty Object: " +o.removeAll(o));
		System.out.println( "Object: " +o);
	}
	
	
	
	

}
