import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			boolean[] stu = new boolean[N+1];
			int[] notHw = new int[N+1];
			
			for(int i=0; i<K; i++) {
				int num = sc.nextInt();
				stu[num] = true;
			}
			
			System.out.print("#" + test_case + " ");
			for(int i=1; i<=N; i++) {
				if(!stu[i]) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}
	}
}