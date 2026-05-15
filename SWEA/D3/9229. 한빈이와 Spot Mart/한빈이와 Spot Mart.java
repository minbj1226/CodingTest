import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int arr[];
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			arr = new int[N];
			int max = -1;
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			//N개중 2개 뽑는 과정
			for(int i=0; i<N-1; i++) {
				for(int j=i+1; j<N; j++) {
					int sum = arr[i] + arr[j];
					if(sum > M) {
						continue;
					}
					max = Math.max(max, sum);
				}
			}
			System.out.println("#" + test_case + " " + max);
		}
	}
}