package algostudy.junga;

// 소수란 - 2,3,5,7,11... 등 약수가 1과 자기 자신 뿐인 수 
// 특정 숫자를 입력받으면, 그 수까지의 소수를 모두 출력하기 
public class PrimeN {
	 public static void getPrime(int num){
		 boolean flag;
		 int cnt = 0;  // 소수 개수를 구함
	        for(int i=2; i<=num; i++){
	            flag = true;
	            for(int j=2; j<i; j++){    
	                if(i%j ==0){        
	                    flag = false;
	                    break;	//마법의 코드
	                }
	            }
	            if(flag == true){
	                cnt++;
	                System.out.println(i);
	            }        
	        }
	        System.out.println("소수 개수 : " + cnt);
	    }

	    public static void main(String[] args){
	        long start = System.currentTimeMillis();
	        getPrime(4);
	        long end = System.currentTimeMillis();
	        System.out.println("실행 시간 : " + (double)(end-start)/1000 + "(s)");
	    }



}
