import java.util.Scanner;

class Solution
{
	static int[] moveR = {1, 0, -1, 0};
    static int[] moveC = {0, -1, 0 ,1};
    static int[][] arr;
    static int possible;
    static boolean[][] visited;
    public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
        arr = new int[16][16];
        
		for(int test_case = 1; test_case <= 10; test_case++) {
            int T = sc.nextInt();

            for(int i=0; i<16; i++) {
                String s = sc.next();
                for(int j=0; j<16; j++) {
                    arr[i][j] = s.charAt(j) - '0';
                    visited = new boolean[i][j]; 
                }
            }

            possible = 0;
            dfs(1, 1);
            System.out.println("#" + test_case + " " + possible);
		}
	}

    static void dfs(int r, int c) {
        if(visited[r][c]) {
            return;
        }

        visited[r][c] = true;
        //(13, 13)에 도달하면 성공
        if(arr[r][c]==3) {
            possible = 1;
            return;
        }

        //좌표 이동
        for(int dir=0; dir<4; dir++) {
            
            int nr = r + moveR[dir];
            int nc = c + moveC[dir];

            if (nr < 0 || nr >= 16 || nc < 0 || nc >= 16) continue;
            if (arr[nr][nc] == 1) continue;

            dfs(nr, nc);
        }
    }
}