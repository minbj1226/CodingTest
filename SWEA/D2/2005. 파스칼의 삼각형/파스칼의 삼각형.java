import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		int[][] pascal;;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			pascal = new int[N][N];
			
			for (int i=0; i<N; i++) {
				for (int j=0; j<=i; j++) {
					if(j==0 || i==j) {
						pascal[i][j] = 1;
					} else {
						pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
					}
				}
			}
			
			System.out.println("#" + test_case);
			
			for (int i=0; i<N; i++) {
				for (int j=0; j<=i; j++) {
					System.out.print(pascal[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}