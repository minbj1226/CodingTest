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
			
			for(int i=0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int up = 0;
			int down = 0;
			int maxUp = Integer.MIN_VALUE;
			int maxDown = Integer.MIN_VALUE;
			
			for(int i=0; i<N-1; i++) {
				for(int j=i+1; j<i+2; j++) {
					if(arr[i]<arr[j]) {
						up=arr[j]-arr[i];
					} else if(arr[i]>arr[j]) {
						down=arr[i]-arr[j];
					}
				}
				maxUp = Math.max(maxUp, up);
				maxDown = Math.max(maxDown, down);
			}
			
			System.out.println("#" + test_case + " " + maxUp + " " + maxDown);
		}
	}
}