import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			//부먹 왕국 도시 수
			int N = sc.nextInt();
			//이동 제한 거리
			int D = sc.nextInt();
			//관문 남아있는 도시
			int[] city = new int[N];
			int cnt = 0;
			int dist = 0;
			
			for(int i=0; i<N; i++) {
				city[i] = sc.nextInt();
			}
			
			for(int i=0; i<N; i++) {
				if(city[i]!=0) {
					dist=0;
					continue;
				}
				
				dist++;
				
				if(dist==D) {
					cnt++;
					dist=0;
				}
			}
			
			System.out.println("#" + test_case + " " + cnt);
		}
		
	}
}