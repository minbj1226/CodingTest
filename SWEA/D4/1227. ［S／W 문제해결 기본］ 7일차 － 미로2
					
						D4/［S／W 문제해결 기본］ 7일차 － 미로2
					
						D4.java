import java.util.Scanner;

class Solution
{
	static char[][] arr;
	static int[] moveR = {0, 1, 0, -1};
	static int[] moveC = {1, 0, -1, 0};
	static int ans;
	static boolean[][] visited;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++) {
            int tc = sc.nextInt();
			arr = new char[100][100];
			visited = new boolean[100][100];
			
			for(int r=0; r<100; r++) {
				String num = sc.next();
				for(int c=0; c<100; c++) {
					arr[r][c] = num.charAt(c);
				}
			}
			
			ans = 0;
			dfs(1, 1);
			
			System.out.println("#" + test_case + " " + ans);
		}
	}
	
	static void dfs(int r, int c) {
		if(arr[r][c]=='3') {
			ans = 1;
			return;
		}
		
		visited[r][c] = true;
		
		for(int dir=0; dir<4; dir++) {
			int nr = r + moveR[dir];
			int nc = c + moveC[dir];
			
			if(!visited[nr][nc]) {
				if(arr[nr][nc] == '0' || arr[nr][nc] == '3') {
					dfs(nr, nc);
				}
			}
		}
	}

}