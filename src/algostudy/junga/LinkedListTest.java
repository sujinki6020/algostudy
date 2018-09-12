package algostudy.junga;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		//list.addFirst("10");
		//list.addFirst("20");
		//list.addFirst("30");
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		System.out.println(list.node(0));
		System.out.println(list.removeFirst());
		System.out.println(list.toString());
	}
}
