import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] pass;
		int[] stop;
		StringBuilder sb;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); //노선의 개수
			pass = new int[5001]; //5000번 정류장까지
			stop = new int[5001];
			sb = new StringBuilder();
			
			for(int i=0; i<N; i++) {
				int A = sc.nextInt(); //첫 번째 정류장
				int B = sc.nextInt(); //두 번째 정류장
				
				for(int j=A; j<=B; j++) {
					pass[j]++;
				}
			}
			
			int P = sc.nextInt();
			
			//P개의 정류장 탐색
			for(int i=0; i<P; i++) {
				int C = sc.nextInt();
				sb.append(pass[C]).append(" ");
			}
			
			System.out.println("#" + test_case + " " + sb);
		}
	}
}