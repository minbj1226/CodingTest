import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		char[][] grid;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			grid = new char[8][8];
			
			for (int r = 0; r < 8; r++) {
				String word = sc.next();
				for (int c = 0; c < 8; c++) {
					grid[r][c] = word.charAt(c);
				}
			}

			int cnt = 0;
			
			if (N==1) {
				cnt = 64;
				return;
			}
			
			//행 검사
			for (int r = 0; r < 8; r++) {
				for (int c = 0; c <= 8 - N; c++) {
					boolean isPal = true;
					for (int i = 0; i < N / 2; i++) {
						//대칭이 안되면 false 반환
						if(grid[r][c+i] != grid[r][N+c-1-i]) {
							isPal = false;
							break;
						}
					}
					if(isPal) {
						cnt++;
					}
				}
			}
			
			
			//열 검사
			for (int c = 0; c < 8; c++) {
				for (int r = 0; r <= 8 - N; r++) {
					boolean isPal = true;
					for (int i = 0; i < N / 2; i++) {
						//대칭이 안되면 false 반환
						if(grid[r+i][c] != grid[N+r-1-i][c]) {
							isPal = false;
							break;
						}
					}
					if(isPal) {
						cnt++;
					}
				}
			}
			
			System.out.println("#" + test_case + " " + cnt);
		}
		
	}
}