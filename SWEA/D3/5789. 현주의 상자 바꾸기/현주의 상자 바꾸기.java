import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int Q = sc.nextInt();
			int[] box = new int[N+1];
			
			for(int i=1; i<=Q; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				
				for(int j=start; j<=end; j++) {
					box[j] = i;
				}
			}
			
			System.out.print("#" + test_case + " ");
			for(int i=1; i<=N; i++) {
				System.out.print(box[i] + " ");
			}
            System.out.println();
		} 
	}
}