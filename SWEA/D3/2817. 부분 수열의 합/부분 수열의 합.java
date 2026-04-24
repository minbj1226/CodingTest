import java.util.ArrayList;
import java.util.Scanner;

class Solution
{
	static ArrayList<Integer> list;
	static int N;
	static int K;
	static boolean[] visited;
	static int cnt;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			K = sc.nextInt();
			list = new ArrayList<Integer>();
			visited = new boolean[N]; 
			cnt = 0;
            
			for(int i=0; i<N; i++) {
				list.add(sc.nextInt());
			}
			
			findCase(0, 0);
			System.out.println("#" + test_case + " " + cnt);
		}
	}
	
	static void findCase(int idx, int sum) {
		if(sum == K) {
			cnt++;
			return;
		}
		
		if(idx==N || sum > K) {
			return;
		}
		
		findCase(idx+1, sum + list.get(idx));
		findCase(idx+1, sum);
		
	}
}