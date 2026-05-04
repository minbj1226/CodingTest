import java.util.HashSet;
import java.util.Scanner;

class Solution
{
	static int[][] grid;
	static int[] moveR = {1, 0, -1, 0};
	static int[] moveC = {0, -1, 0, 1};
	static char[] num;
	static HashSet<String> hash;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			grid = new int[4][4];
			hash = new HashSet<String>();
			num = new char[7];
			
			for(int r=0; r<4; r++) {
				for(int c=0; c<4; c++) {
					grid[r][c] = sc.nextInt();
				}
			}
			
			for(int r=0; r<4; r++) {
				for(int c=0; c<4; c++) {
					dfs(r, c, 0);
				}
			}
			
			System.out.println("#" + test_case + " " + hash.size());
		}
		
	}
	
	static void dfs(int r, int c, int depth) {
		if(depth==7) {
			hash.add(new String(num));
			return;
		}
		
		for(int dir=0; dir<4; dir++) {
			int nr = r + moveR[dir];
			int nc = c + moveC[dir];
			
			if(nr<0 || nr>=4 || nc<0 || nc>=4) {
				continue;
			}
			
			num[depth] = (char) (grid[nr][nc] - '0');
			dfs(nr, nc, depth+1);
		}
		
	}
}