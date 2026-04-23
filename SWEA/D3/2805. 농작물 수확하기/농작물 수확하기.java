import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[][] grid = new int[N][N];
			int mid = N / 2; //가운데 좌표
					
			for(int i=0; i<N; i++) {
				String num = sc.next();
				for(int j=0; j<N; j++) {
					grid[i][j] = num.charAt(j) - '0';
				}
			}
			
			int sum = 0;
			//mid 안에 있는 값이면 다 더하기
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					if(Math.abs(r-mid) + Math.abs(c-mid) <= mid) {
						sum += grid[r][c];
					}
				}
			}
			
			System.out.println("#" + test_case + " " + sum);
		}
		
	}
}