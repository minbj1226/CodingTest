import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			int[] dp = new int[N];
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = Integer.MIN_VALUE;
			
			for(int i=0; i<N; i++) {
				dp[i] = 1;
				for(int j=0; j<i; j++) {
					if(arr[j] < arr[i]) {
						dp[i] = Math.max(dp[i], dp[j]+1);
					}
				}
				max = Math.max(dp[i], max);
			}
		
			System.out.println("#" + test_case + " " + max);
		}
	}
}