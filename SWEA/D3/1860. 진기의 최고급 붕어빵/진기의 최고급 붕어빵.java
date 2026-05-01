import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] person;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int K = sc.nextInt();
			person = new int[N];
			
			String possible = "Possible";
			
			//사람 도착 시간
			for(int i=0; i<N; i++) {
				person[i] = sc.nextInt();
				
				//붕어빵 완성보다 빨리 도착
				if(person[i]<M) {
					possible = "Impossible";
				}
			}
			
			//먼저 온 순서로 정렬
			Arrays.sort(person);
			
			for(int i=0; i<N; i++) {
				int bread = (person[i] / M) * K;
				int count = i+1;
				
				if(bread<count) {
					possible = "Impossible";
				}
			}
			
			System.out.println("#" + test_case + " " + possible);
		}
		
	}
}