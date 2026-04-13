import java.util.Scanner;
import java.io.FileInputStream;

/*
가로와 세로 경우를 나누지 않고 한번에 처리한 코드
*/
class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int[] moveR = {1, 0};
        int[] moveC = {0, 1};

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[][] arr = new int[N][N];
            int ans = 0;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            //좌표 위치 설정
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    if(arr[r][c] != 1) {
                        continue;
                    }

                    for (int d = 0; d < 2; d++) {
                        int pr = r - moveR[d];
                        int pc = c - moveC[d];
                        
                        if(pr>=0 && pr<N && pc>=0 && pc<N && arr[pr][pc] == 1) {
                            continue;
                        }

                        int len = 0;
                        int nr = r;
                        int nc = c;
                        while(nr >=0 && nr < N && nc >= 0 && nc < N && arr[nr][nc] == 1) {
                            len++;
                            nr += moveR[d];
                            nc += moveC[d];
                        }

                        if(len==K) {
                            ans++;
                        }

                    }
                }
            }

            System.out.println("#" + test_case + " " + ans);

        }
	}
}