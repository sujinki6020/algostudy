package algostudy.eunbee.algoritm;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_10845 {
	public static void main(String[] args) {
		getInput();
		
	}
	public static void getInput() {
		
		Scanner sc = new Scanner(System.in);
		int rows = Integer.parseInt(sc.nextLine());
		String[] lineArr = new String[rows];
		String line = null;
		for(int i = 0; i < rows; i++) {
			lineArr[i]= sc.nextLine();
		}
		makeQueue(lineArr);
	}
	public static void makeQueue(String[] lineArr) {
			int result = -2;
			String command = null;
			List<Integer> queueList = new ArrayList<>();
			for(int i = 0; i < lineArr.length; i++) {
				command = lineArr[i].split(" ")[0];
					
				
				switch(command) {
				case "push":
					int num = Integer.parseInt(lineArr[i].split(" ")[1]);
					queueList.add(num);
					result = -2;
					break;
					
				case "pop":
					if(queueList.size() == 0) {
						result = -1;
					}else{
						result = queueList.get(0);
						List<Integer> newQueue = new ArrayList<>();
						for(int j = 1; j < queueList.size(); j++) {
							newQueue.add(queueList.get(j));
						}
						queueList.clear();
						for(int k = 0; k < newQueue.size(); k++) {
							queueList.add(newQueue.get(k));
						}
					}
					break;
					
				case "size":
					result = queueList.size();
					break;
					
				case "empty": 
					if(queueList.isEmpty()) result = 1;
					else result = 0;
					break;
					
				case "front": 
					if(queueList.isEmpty()) result = -1;
					else {
						result = queueList.get(0);
					}
					break;
				case "back": 
					if(queueList.isEmpty()) result = -1;
					else {
						result = queueList.get(queueList.size()-1);
					}
					break;
				}
				if(result != -2) {
					System.out.println(result);
				}
			}
		
	}
}
