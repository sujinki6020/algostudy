package algostudy.basic.junga;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
    	String d = "";
    	//String s = "3:40:30 PM"; //12시간으로 입력해서 오전오후표시하면 반환은 24시로 
    	try {
        	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    		Date date = sdf.parse(s);
    		if(s.endsWith("PM")) {
        		Calendar c= Calendar.getInstance();
    			c.setTime(date);
    			c.add(Calendar.HOUR,12);
    			SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
    			d = f.format(c.getTime());
    		
    		}else{
    			SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss");
    			d = f.format(date);
    		};
        	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       return d;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

       // bw.write(result);
       // bw.newLine();

       // bw.close();
    	
    }
}