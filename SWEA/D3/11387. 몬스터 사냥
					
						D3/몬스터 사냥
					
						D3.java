import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int D = sc.nextInt();
			int L = sc.nextInt();
			int N = sc.nextInt();
			int sum = 0;
			
			for(int i=0; i<N; i++) {
				sum += D * (1+i*L*0.01);
			}
			
			System.out.println("#" + test_case + " " + sum);
		}
	}
}