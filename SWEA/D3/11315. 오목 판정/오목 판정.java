import java.util.Scanner;

class Solution
{
	static char[][] arr;
	static int[] moveR = {0, 1, 1, 1};
	static int[] moveC = {1, 1, 0, -1};
	static boolean[][] visited;
	static int N;
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
			arr = new char[N][N];
			visited = new boolean[N][N];
			
			for(int r=0; r<N; r++) {
				String omok = sc.next();
				for(int c=0; c<N; c++) {
					arr[r][c] = omok.charAt(c);
				}
			}
			
			String ans = "NO";
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					if(arr[r][c] == 'o') {
						for(int dir=0; dir<4; dir++) {
							int cnt = 1;
							int nr = r;
							int nc = c;
							
							while (true) {
								nr += moveR[dir];
								nc += moveC[dir];
								
								if(nr < 0 || nr >= N || nc < 0 || nc >= N || arr[nr][nc] != 'o') {
									break;
								}
								cnt++;
							}
							//5개 이상이면
							if(cnt>=5) {
								ans = "YES";
							}
						}
					}
				}
			}
			
			System.out.println("#" + test_case + " " + ans);
		}
	}
}