import java.util.LinkedList;

public class CyclicLL {
	public static LinkedList<Integer> ll = new LinkedList<Integer>();
	public static void iscyclic(LinkedList<Integer> link) {
		int head=link.getFirst();
		int tail=link.getLast();
		if(head==tail) {
			System.out.println("CYCLIC");
		}
		else {
			System.out.println("NON-CYCLIC");
		}
	}
	public static void main(String[] args) {
		ll.add(101);
		ll.add(102);
		ll.add(101);
		ll.add(104);
		ll.add(105);
		System.out.println(ll);
		iscyclic(ll);
		
	}
	
}
