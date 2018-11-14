package algostudy.eunbee.algoritm;

import java.util.ArrayList;
import java.util.Scanner;
//import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import static org.junit.Assert.assertEquals;
public class BOJ_10539 {
	
	/**
	 * 
	 * @param args
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] bArr = new int[count];
		int[] aArr = new int[count];
		
		for(int i = 0; i < count; i++) {
			bArr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<count; i++) {
			aArr[i] = bArr[i] *(i+1);
			if(i >0) {
			aArr[i] = bArr[i] *(i+1) - bArr[i-1]*i;
			}
			
		}
		
		for(int i = 0; i < aArr.length; i++) {
			System.out.println(aArr[i]);
		}
	}
	 */
//	   //@Test
//	   public static void main(String[] args) throws Exception {
//
//	       // 2줄을 받는다
//	       int inputLine = 2;
//	       List<String> inputData = getInputDataFromKeyBoard(inputLine);
//
//	       assertEquals(inputLine,inputData.size());
//	       // 해당 값을 출력 한다.
//
//	       int length =  Integer.parseInt(inputData.get(0)) ;
//	       String[] sData =  inputData.get(1).split(" ") ;
//
//	       Long[] lData = new Long[sData.length];
//	       for(int i = 0; i<sData.length ; i++){
//	           lData[i] = Long.parseLong(sData[i]);
//	       }
//
//	       StringBuffer sb = new StringBuffer();
//	       Long pre = 0L;
//	       for(int i = 0; i<lData.length ; i++) {
//	           sb.append(getData(i+1 , pre, lData[i])).append(" ");
//	           pre = lData[i];
//	       }
//	       System.out.println(sb.toString());
//	   }
//	   public  void testGetData() throws Exception {
//
//	       Long value = getData(4, (long) 3, 5);
//
//	       Long ok = 11L;
//
//	       assertEquals(ok, value);
//	   }
//	   //@Test
//
//
//	   private static long getData(int index, Long pre , long resultData){
//
//	       // resultData = ( ( pre * (index - 1) ) + currentData )  /  index
//	      //  resultData * index =   ( pre * (index - 1) + currentData
//	      //  (resultData * index ) - ( pre * (index - 1) =  currentData
//	     return (resultData * index ) - ( pre * (index - 1)) ;
//	   }
//
//
//	   private static List getInputDataFromKeyBoard(int line){
//	       Scanner sc = new Scanner(System.in);
//	       ArrayList<String> returnList = new ArrayList<String>();
//	       int inputLine = 0;
//	       while(sc.hasNext()) {
//	           returnList.add(sc.nextLine());
//	           if(++inputLine == line){break;}
//	       }
//	       return returnList;
//	   }
}
