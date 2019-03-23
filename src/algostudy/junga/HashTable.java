package algostudy.junga;
import java.util.LinkedList;

class Hash{
	class Node{
		String key; 
		String value;
		public Node(String key,String value) {
			this.key = key;
			this.value = value;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
   LinkedList<Node>[] data;
   Hash(int size){
	   this.data = new LinkedList[size];
   }
   
   public int getHashCode(String key) {
	   int hashCode = 0;
	   for(char c: key.toCharArray()) {
		   hashCode += c;
	   }
	   return hashCode;
   }
   
   public int convetToIndex(int hashCode) {
	   return hashCode % data.length;
   }
   
   public Node searchKey(LinkedList<Node> list,String key) {
	   if(list == null) return null;
	   for(Node node : list) {
		   if(node.key.equals(key)) {
			   return node;
		   }
	   }
	   return null;
   }
   
   public void put(String key, String value) {
	   int hashcode = getHashCode(key);
	   int index = convetToIndex(hashcode);
	   LinkedList<Node> list = data[index];
	   if(list == null) {
		   list = new LinkedList<Node>();
		   data[index] = list;
	   }
	   Node node = searchKey(list, key);
	   if(node == null) {
		   list.addLast(new Node(key, value));
	   }else {
		   node.setValue(value);
	   }
   }
   public String getKey(String key) {
	   int hashCode = getHashCode(key);
	   int index = convetToIndex(hashCode);
	   LinkedList<Node> list = data[index];
	   Node node = searchKey(list, key);
	   return node ==  null ? "Not found" : node.getValue();
	   
   }
	
}
public class HashTable {
	public static void main(String[] args) {
		Hash h = new Hash(3);
		h.put("sung", "She is pretty");
		h.put("jin", "She is a model");
		h.put("hee", "She is an angel");
		h.put("min", "She is cute");
		h.put("sung", "바꿨당.");
		System.out.println(h.getKey("sung"));
		System.out.println(h.getKey("jin"));
		System.out.println(h.getKey("hee"));
		System.out.println(h.getKey("min"));
	}
}
