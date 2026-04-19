import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=10;
		int[][] arr=new int[101][101];
		
		for(int test_case = 1; test_case <= T; test_case++) {
            int tc = sc.nextInt();
			int max=Integer.MIN_VALUE;
			
			for(int r=0; r<100; r++) {
				for(int c=0; c<100; c++) {
					arr[r][c] = sc.nextInt();
				}
			}
			
			//각 행의 합에서 최대 산정
			for(int r=0; r<100; r++) {
				int sum=0;
				for(int c=0; c<100; c++) {
					sum+=arr[r][c];
				}
				max=Math.max(sum, max);
			}
			
			//각 열의 합에서 최대 산정
			for(int c=0; c<100; c++) {
				int sum=0;
				for(int r=0; r<100; r++) {
					sum+=arr[r][c];
				}
				max=Math.max(sum, max);
			}
			
			int sum=0;
			//좌측 대각선의 합에서 최대 산정
			for(int r=0; r<100; r++) {
				for(int c=0; c<100; c++) {
					if(r==c) {
						sum+=arr[r][c];
					}
				}
			}
			max=Math.max(sum, max);

			sum=0;
			//우측 대각선의 합에서 최대 산정
			for(int r=0; r<100; r++) {
				for(int c=0; c<100; c++) {
					if(r+c==99) {
						sum+=arr[r][c];
					}
				}
			}
			max=Math.max(sum, max);
			
			
			
			System.out.println("#" + test_case + " " + max);
		}
		
	}
}