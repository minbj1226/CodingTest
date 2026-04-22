import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		int[][] magnetic;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int n = sc.nextInt();
			magnetic = new int[n+2][n];
			int deadLock = 0; //교착 상태
			
			
			//자석 위치 입력(행이 0일때는 1, 행이 n+1일때는 2)
			for(int r=1; r<n+1; r++) {
				for(int c=0; c<n; c++) {
					magnetic[0][c] = 1;
					magnetic[r][c] = sc.nextInt();
					magnetic[n+1][c] = 2;
				}
			}
			
			for(int c=0; c<n; c++) {
				boolean down = false;
				for(int r=1; r<n+1; r++) {
					if(magnetic[r][c]==1) {
						down = true;
					} else if(magnetic[r][c]==2) {
						if(down) {
							deadLock++;
							down=false;
						}
					}
					
				}
			}
			
			System.out.println("#" + test_case + " " +deadLock);
			
		}
		
	}
}