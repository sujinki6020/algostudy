package algostudy.eunbee.algoritm;

public class Maze {
   private static int PATH_WAY = 0;
   private static int WALL = 1;
   private static int VISITED_WAY = 2;
   
   private static int[][] MAZE = {
            { 0, 0, 0, 0, 0, 0, 0, 1 },
            { 0, 1, 1, 0, 1, 1, 0, 1 },
            { 0, 0, 0, 1, 0, 0, 0, 1 },
            { 0, 1, 0, 0, 1, 1, 0, 0 },
            { 0, 1, 1, 1, 0, 0, 1, 1 },
            { 0, 1, 0, 0, 0, 1, 0, 1 },
            { 0, 0, 0, 1, 0, 0, 0, 1 },
            { 0, 1, 1, 1, 0, 1, 0, 0 }
     };

   public static boolean findPath(int x, int y) {
      // 미로의 범위를 벗어나면 false
      if(x<0 || y<0 || x>7 || y>7) {
         return false;
      }
      // xy의 값이 지나갈 수 있는 길이 아니면 false
      else if(MAZE[x][y] != PATH_WAY) {
         return false;
      }
      // xy의 값이 출구의 값과 일치하면 true
      else if(x==7 && y==7) {
         MAZE[x][y] = VISITED_WAY;
         return true;
      } 
      // 길 찾기
      else {
         MAZE[x][y] = VISITED_WAY;
         if (findPath(x, y+1) || findPath(x+1, y) || findPath(x, y-1) || findPath(x-1, y)) {
            return true;
         }
         return false;
      }
   }
   
   
   public static void printMaze(){
        for(int i = 0; i < MAZE.length; i++){
               for(int j = 0; j<MAZE[i].length; j++){
                     System.out.print(MAZE[i][j]);
                     if(j != MAZE[i].length-1){
                            System.out.print(", ");
                     }
               } //inner for end
               System.out.println();
        } //outer for end
    }// function end
   
   
   public static void main(String[] args) {
      if(findPath(0, 0)){
            System.out.println("출구 발견!!");
            printMaze();
        }else{
            System.out.println("출구가 없습니다...ㅜㅜ");
            printMaze();
        }
   }
}
