package algostudy.jongmin.algorithm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze {

   static int N, M;
   static String map[][];
   static boolean visisted[][];
   static int x[] = { 1, 0, -1, 0 }; // 대각선으로 갈 수 없다 .한번에 한칸 만큼만 움직일 수 있다.
   static int y[] = { 0, 1, 0, -1 };

   static int startX, startY;
   static int endX, endY;
   
   public void generateMaze(int mazeSize) {
	      N = mazeSize;
	      M = mazeSize;
	      
	      
	      // Martix : 5 <= N, M <= 254
//	      N = (int) (Math.random() * 254) + 5;
//	      M = (int) (Math.random() * 254) + 5;

	      map = new String[N][M];
	      visisted = new boolean[N][M];
	      int result = 0;

	      int startPoint = getPoint(N);
	      int endPoint = getPoint(N);

	      while (true) {

	         for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {

	               int randomNumber = (int) (Math.random() * 100000) + 1;

	               // Build Edge "#" && Set start/end point
	               if (i == 0 || i == N - 1) {
	                  map[i][j] = "#";
	               }

	               else if (j == 0 || j == M - 1) {

	                  if (j == 0 && i == startPoint) {
	                	  						//시작점과 끝을 아는 상태로 탐색
	                     map[i][j] = "S";		// 시작점
	                     startY = i;
	                     startX = j;            // S, G 찍을 때 좌표값 저장
	                     
	                  } else if (j == M - 1 && i == endPoint) {
	                     map[i][j] = "G";
	                     endY = i;
	                     endX = j;
	                  } else {
	                     map[i][j] = "#";
	                  }
	               }

	               // Build inside maze
	               else {

	                  if (randomNumber % 5 == 0) {
	                     map[i][j] = "#";
	                  } else {
	                     map[i][j] = " ";
	                  }
	               }

	            }
	         }
	         result = bfs(new Point(startX, startY, 0));
	         if (result > 0) {
	             for(int i = 0; i<map.length; i++) {
	                 System.out.println();
	                 for(int j = 0; j<map[i].length; j++) {
	                    System.out.print(map[i][j]);
	                 }
	              } 
	        	System.out.println(); 
	            System.out.println(result);
	            break;
	         }
	         else {
	        	 System.out.println("미로생성 실패");
	        	 generateMaze(mazeSize);
	        	 break;
	         }
	      }
   }
   
   public static void main(String[] args) {
      
      int result = 0;
      while(result == 0) {    	  
    	  Scanner input = new Scanner(System.in);
    	  System.out.print("미로의 크기 (n x n) : ");
    	  int mazeSize = input.nextInt();
    	  Maze m = new Maze();
    	  if(mazeSize <= 254) {
    		  m.generateMaze(mazeSize);
    		  break;
       	  }
    	  else
    		  System.out.println("최대 크기는 254 입니다.");
      }
   }

   public static int bfs(Point P) {
      Queue<Point> q = new LinkedList<>();

      q.add(P);
      visisted[P.y][P.x] = true;

      while (!q.isEmpty()) {

         Point p = q.poll();
         
         if (p.x == endX && p.y == endY) {
            return p.depth;
         }
         
         for (int i = 0; i < 4; i++) {
            int nextX = x[i] + p.x;
            int nextY = y[i] + p.y;

            if (nextX < 0 || nextX >= M || nextY < 0 || nextY >= N)
               continue;

            if (visisted[nextY][nextX] == false && (map[nextY][nextX] == " "||map[nextY][nextX] == "G")) {
               visisted[nextY][nextX] = true;					// S를 시작점으로 너비탐색 
               q.add(new Point(nextX, nextY, p.depth + 1));
            }
         }
      }
      return 0;
   }

   static int getPoint(int input) {

      int val = 0;

      while (true) {
         int temp = (int) (Math.random() * 253) + 1;
         if (temp < input) {
            val = temp;
            return val;
         }
      }

   }
}

class Point {
   int x, y, depth;

   Point(int x, int y, int depth) {
      this.x = x;
      this.y = y;
      this.depth = depth;
      ;
   }
}