package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_4446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
		
			String line = sc.nextLine();
			String result = "";
			System.out.print(getROT(String.valueOf(line.charAt(0)).toLowerCase()).toUpperCase());
			for(int i = 1; i < line.length(); i++) {
				result += getROT(String.valueOf(line.charAt(i)));
			}
			System.out.println(result);
		}
	}
	public static String getROT(String s) {
		String result = s;
		
		String[] consonant = {"b","k","x","z","n","h","d","c","w","g","p","v","j","q","t","s","r","l","m","f"};
		String[] vowel = {"a","i","y","e","o","u"};
		
		List<String> conList = putList(consonant);
		List<String> vowList = putList(vowel);
		
		if(conList.contains(s)) {
			int index = conList.indexOf(s)-10;
			if(index < 0) index += conList.size();
			result = conList.get(index);
			
		}else {
			if(vowList.contains(s)) {
				int index = vowList.indexOf(s)-3;
				if(index < 0) index += vowList.size();
				result = vowList.get(index);
			}
		}
		return result;
	}
	
	public static List<String> putList(String[] sArr){
		List<String> list = new ArrayList<>();
		for(String s : sArr) {
			list.add(s);
		}
		return list;
	}
}
