// 생활코딩 참조 : https://opentutorials.org/module/1335/8857#entirecode

package algostudy.sujin.datastructure;

public class LinkedList {
	
	private Node head; 
	private Node tail;
	private int size = 0;
	private class Node {
		// data 저장 field
		private Object data;
		// 다음 node를 가리키는 field
		private Node next;
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		// Node의 내용 출력하여 확인
		public String toString() {
			return String.valueOf(this.data);
		}
	}
	
	public void addFirst(Object input) {
		// Node 생성
		Node newNode = new Node(input);
		// newNode의 다음 Node로 head 지정
		newNode.next = head;
		// head로 newNode 지정
		head = newNode;
		
		size++;
		
		if(head.next == null) {
			tail = head;
		}
	}
	
	public void addLast(Object input) {
		// Node 생성
		Node newNode = new Node(input);
		// Node가 없다면 addFirst() 호출하여 첫 번째 Node 생성
		if(size==0) {
			addFirst(input);
		} else {
			// 마지막 Node의 다음 Node로 생성한 newNode 지정
			tail.next = newNode;
			// update tail
			tail = newNode;
			// size++
			size++;
		}
	}
	
	// 특정 위치의 Node 찾기
	Node node(int index) {
		Node x = head;
		for(int i=0; i<index; i++) 
			x = x.next;
			return x;
	}
	
	// node() 이용 => """특정 위치"""에 Node 추가하는 method 만들기
	public void add(int k, Object input){
        // 만약 k가 0이라면 첫번째 노드에 추가하는 것이기 때문에 addFirst를 사용합니다.
        if(k == 0){
            addFirst(input);
        } else {
            Node temp1 = node(k-1);
            // k번째 노드를 temp2로 지정
            Node temp2 = temp1.next;
            // 새로운 노드를 생성합니다.
            Node newNode = new Node(input);
            // temp1의 다음 노드로 새로운 노드
            temp1.next = newNode;
            // 새로운 노드의 다음 노드로 temp2를 지정
            newNode.next = temp2;
            size++;
            // 새로운 노드의 다음 노드가 없다면 새로운 노드가 마지막 노드 => tail로 지정
            if(newNode.next == null){
                tail = newNode;
            }
        }
    }
    public String toString() {
        // 노드가 없을 경우
        if(head == null){
            return "[]";
        }       
        Node temp = head;
        String str = "[";
        // 마지막 노드는 다음 노드가 없기 때문에 while에서 마지막 노드는 제외 ==> 하단 str += temp.data로 마지막 노드를 포함 
        while(temp.next != null){
            str += temp.data + ",";
            temp = temp.next;
        }
        str += temp.data;
        return str+"]";
    }
    public Object removeFirst(){
        // 첫번째 노드를 temp / head의 값을 두번째 노드로 변경
        Node temp = head;
        head = temp.next;
        // 데이터를 삭제하기 전에 리턴할 값을 임시 변수에 담기 
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }
    public Object remove(int k){
        if(k == 0)
            return removeFirst();
        // k-1번째 노드를 temp의 값으로 지정
        Node temp = node(k-1);
        // 삭제 노드를 todoDeleted에 저장
        // 삭제 노드를 지금 제거하면 삭제 앞 노드와 삭제 뒤 노드를 연결할 수 없습니다.  ????  
        Node todoDeleted = temp.next;
        // 삭제 앞 노드의 다음 노드로 삭제 뒤 노드를 지정합니다.
        temp.next = temp.next.next;
        // 삭제된 데이터를 리턴하기 위해서 returnData에 데이터를 저장
        Object returnData = todoDeleted.data; 
        if(todoDeleted == tail){
            tail = temp;
        }
        // cur.next 삭제
        todoDeleted = null; 
        size--;
        return returnData;
    }
    public Object removeLast(){
        return remove(size-1);
    }
    public int size(){
        return size;
    }
    public Object get(int k){
        Node temp = node(k);
        return temp.data;
    }
    public int indexOf(Object data){
        // 탐색 대상 노드를 temp로 지정
        Node temp = head;
        int index = 0;
        // 탐색 값과 탐색 대상의 값을 비교 
        while(temp.data != data){
            temp = temp.next;
            index++;
            // 더 이상 탐색 대상이 없음; return -1
            if(temp == null)
                return -1;
        }
        // 탐색 대상을 찾은 후 -> 인덱스 값 리턴
        return index;
    }
 
    // Iterator 생성
    public ListIterator listIterator() {
        return new ListIterator();
    }
     
    class ListIterator{
        private Node lastReturned;
        private Node next;
        private int nextIndex;
         
        ListIterator(){
            next = head;
            nextIndex = 0;
        }
         
        // next의 참조값이 기존 next.next로 변경됨 
        public Object next() {
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.data;
        }
         
        public boolean hasNext() {
            return nextIndex < size();
        }
         
        public void add(Object input){
            Node newNode = new Node(input);
            if(lastReturned == null){
                head= newNode;
                newNode.next = next;
            } else {
                lastReturned.next = newNode;
                newNode.next = next;
            }
            lastReturned = newNode;
            nextIndex++;
            size++;
        }
         
        public void remove(){
            if(nextIndex == 0){
                throw new IllegalStateException();
            }
            LinkedList.this.remove(nextIndex-1);
            nextIndex--;
        }
         
    }
 
}