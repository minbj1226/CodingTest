import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	static int[][] arr;
    static int ans = 0;
   public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
            int N = 9;
            arr = new int[N][N];

            //값 넣기
            for(int i=0; i<N; i++) {
                for(int j=0; j<N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            ans=1;
            //값 탐색
            for(int i=0; i<9; i++) {
                if(!checkRow(i) || !checkCol(i)) {
                    ans = 0;
                }
            }

            for (int r=0; r<9; r+=3) {
                for (int c=0; c<9; c+=3) {
                    if(!checkBox(r, c)) {
                        ans = 0;
                    }
                }
            }

            System.out.println("#" + test_case + " " + ans);
		}
	}

    static boolean checkBox(int r, int c) {
        for(int i=r; i<r+3; i++) {
            for(int j=c; j<c+3; j++) {
                if(arr[r][c] == arr[i][j]) {
                    if(r==i && c==j) {
                        continue;
                    }

                    return false;
                }
            }
        }

        return true;
    }

    static boolean checkRow(int r) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if(arr[r][j] == arr[i][j]) {
                    if(r==i) {
                        continue;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean checkCol(int c) {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if(arr[i][c] == arr[i][j]) {
                    if(c==j) {
                        continue;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}