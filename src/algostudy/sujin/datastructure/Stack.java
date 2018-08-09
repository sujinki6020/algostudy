package algostudy.sujin.datastructure;

public class Stack {
	
	int maxSize = 0;
	int top = 0;
	int[] stack;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stack = new int[maxSize];
	}
	
	// push : maxSize보다 작을 경우에만 data 삽입 
	public void Push(int number) {
		if(top < maxSize) {
			stack[top] = number;
			top++;
		}
		else {
			System.out.println("Overflow");
		}
	}
	
	// top element 반환
	public Object Pop() {
		if(top>0) {
			return stack[--top];
		} else {
			System.out.println("No Data in Stack");
			return null;
		}
	}
}
