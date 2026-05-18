import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;

		for(int test_case = 1; test_case <= T; test_case++) {
			int[][] grid = new int[100][100];
			int tc = sc.nextInt();
			
			for(int r=0; r<100; r++) {
				for(int c=0; c<100; c++) {
					grid[r][c] = sc.nextInt();
				}
			}
			
			int start = 0;
			
			for(int c=0; c<100; c++) {
				if(grid[99][c] == 2) {
					start = c;
				}
			}
			
			int r=99;
			int c=start;
			
			while(r>0) {
				if(c-1 >=0 && grid[r][c-1]==1) {
					while(c-1 >=0 && grid[r][c-1]==1) {
						c--;
					}
				} else if(c+1 <= 99 && grid[r][c+1]==1) {
					while(c+1 <= 99 && grid[r][c+1]==1) {
						c++;
					}
				}
				r--;
			}
			
			System.out.println("#" + tc + " " + c);
		}
	}
}