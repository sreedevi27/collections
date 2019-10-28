import java.util.ArrayList;


public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("1");
	al.add("Sre");
	al.add(null);
	al.add("2");
	System.out.println("Elements in list :" + al);
	/*for(int i=0;i<=al.size();i++) {
	
		if( al.get(i).equalsIgnoreCase("sreedevi")) 
			System.out.println("Equals " + al.get(i));
			else 
				
			
				System.out.println("Not Equal: " +al);
			
		}*/
	for(String s:al) {
		//al.get(1);
		
		if(s.equalsIgnoreCase("sre")) {
			System.out.println("String :" + s);
			System.out.println("Equal" + al);	
		}
	}
	}
	
 

}
