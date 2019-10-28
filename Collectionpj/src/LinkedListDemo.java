import java.util.LinkedList;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     LinkedList<Object> ll=new LinkedList<Object>();
	
     ll.add(1);
     ll.add("devi");
     ll.add(1);
     ll.add(null);
     System.out.println("Elements in List:" +ll);
     System.out.println("First element in list: " +ll.getFirst());
     System.out.println("Remove First Element: " +ll.removeFirst());
     System.out.println("Element inlist " + ll);
     System.out.println("Set first Element: " +ll.set(1,"sree"));
     System.out.println("Elements in list :" + ll);
     
     
     
	}
	
	

}
