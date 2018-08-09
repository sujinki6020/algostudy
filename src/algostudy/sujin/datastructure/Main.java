package algostudy.sujin.datastructure;

public class Main{
	
	// LinkedList
//	  public static void main(String[] args) {
//	        LinkedList numbers = new LinkedList();
//	        numbers.addLast(10);
//	        numbers.addLast(20);
//	        numbers.addLast(30);
//	        LinkedList.ListIterator li = numbers.listIterator();
//	        while(li.hasNext()){
//	            if((int)li.next() == 15)
//	                li.remove();
//	        }
//	        System.out.println(numbers);
//	  }
	
	// Stack
//	public static void main(String[] args) {
//		Stack stack = new Stack(5);
//		stack.Push(5);
//		stack.Push(4);
//		stack.Push(3);
//		stack.Push(2);
//		stack.Push(1);
//		System.out.println(stack.Pop());
//		System.out.println(stack.Pop());
//		System.out.println(stack.Pop());
//		System.out.println(stack.Pop());
//		System.out.println(stack.Pop());
//	}
	
	// LinearQueue
//	public static void main(String[] args) {
//		LinearQueue lq = new LinearQueue(5);
//		lq.enqueue(1);
//		lq.enqueue(2);
//		lq.enqueue(3);
//		lq.enqueue(4);
//		lq.enqueue(5);
//		System.out.println("1 : " + lq.rear);
//		lq.dequeue();
//		System.out.println("2 : " + lq.rear);
//		lq.dequeue();
//		System.out.println("3 : " + lq.rear);
//	}
	
	// CircularQueue
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(5);
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);
		System.out.println("1 : " + cq.rear + "/" + cq.front);
		cq.dequeue();
		System.out.println("2 : " + cq.rear + "/" + cq.front);
		cq.dequeue();
		System.out.println("3 : " + cq.rear + "/" + cq.front);
		
	}
}