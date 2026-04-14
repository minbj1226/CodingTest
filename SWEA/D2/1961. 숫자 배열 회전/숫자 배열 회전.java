import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	static int[][] arr;
    static int N;
    public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            arr = new int[N][N]; 
            
            for (int r=0; r<N; r++) {
                for (int c=0; c<N; c++) {
                    arr[r][c] = sc.nextInt();
                }
            }

            int[][] r90 = new int[N][N];
            int[][] r180 = new int[N][N];
            int[][] r270 = new int[N][N];

            //90도
            for(int r=0; r<N; r++) {
                for(int c=0; c<N; c++) {
                    r90[r][c] = arr[N-1-c][r];
                }
            }

            //180도
            for(int r=0; r<N; r++) {
                for(int c=0; c<N; c++) {
                    r180[r][c] = r90[N-1-c][r];
                }
            }

            //270도
            for(int r=0; r<N; r++) {
                for(int c=0; c<N; c++) {
                    r270[r][c] = r180[N-1-c][r];
                }
            }

            System.out.println("#" + test_case);

            for(int r=0; r<N; r++) {
                for(int c=0; c<N; c++) {
                    System.out.print(r90[r][c]);
                }
                System.out.print(" ");
                for(int c=0; c<N; c++) {
                    System.out.print(r180[r][c]);
                }
                System.out.print(" ");
                for(int c=0; c<N; c++) {
                    System.out.print(r270[r][c]);
                }
                System.out.println();
            }

		}
	}
}