import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			long N = sc.nextLong();
			long min = Long.MAX_VALUE;
			
			for(long i=1; i*i<=N; i++) {
				if(N%i==0) {
					long a = i;
					long b = N/i;
					min = Math.min(min, (a-1)+(b-1));
				}
			}
			
			System.out.println("#" + test_case + " " + min);
		}
	}
}