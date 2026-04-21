import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			System.out.print("#" + test_case + " ");
			mul(N, M);
			System.out.println();
		}
	}
	
	static void mul(int N, int M) {
		int sum = 1;
		
		for(int i=1; i<=M; i++) {
			sum *= N;
		}
		System.out.print(sum);
	}
}