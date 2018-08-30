package algostudy.junga;

public class ArrayExam2 {
	public static void main(String[] args) {
		/*
		 *  0 -> 0 0 0 0 
		 *  1 -> 0 0 0 0 
		 *  2 -> 0 0 0 0 
		 **/
		int[][] array4 = new int[3][4]; // 2차원 배열 
		array4[0][1] = 10; // 0이 가르키는 1번째 배열에 10을 넣겠단 얘기
		
		// 2차원 배열을 선언할때는 크기가 다른 배열을 생성할 수도 있다.
		int[][] array5 = new int[3][]; // 뒤에 있는 배열의 사이즈를 비워줄 수 있다.
		/*
		 *  array 5 0 - ?
		 *          1 - ?
		 *          2 - ? 
		 *          0 , 1, 2 가 가르키는 배열은 아직 생성되지안음.
		 * */
		
		array5[0] = new int[1]; // 0번째 인덱스가 가르키는 1번째 배열을 만들어야 실행했을때 에러가나지 않음.
		array5[0][0] = 10; // 가르키는게 비어있으면 에러난다.
		array5[1] = new int[2];
		array5[2] = new int[3];
		/*
		 * array 5 0 -> 0
		 *         1 -> 0 0 
		 *         2 -> 0 0 0
		 */
		 int[][] array6 = {{1},{1,2},{1,2,3}};//선언과 동시에 초기화도 가능
		 System.out.println(array6[0][0]);
		 System.out.println(array6[2][2]);
		}
}
