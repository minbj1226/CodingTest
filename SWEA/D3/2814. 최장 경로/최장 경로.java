import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution
{
	static int M;
	static int N;
	static List<Integer>[] list;
	static boolean[] visited;
	static int ans;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			M = sc.nextInt();
			list = new ArrayList[N+1];
			visited = new boolean[N+1];
			
			for(int i=1; i<=N; i++) {
				list[i] = new ArrayList<Integer>();
			}
			
			for(int i=0; i<M; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				list[x].add(y);
				list[y].add(x);
			}
			
			ans = 0;
			
			for(int i=1; i<=N; i++) {
				visited[i]=true;
				dfs(i, 1);
				visited[i]=false;
			}
			
			System.out.println("#" + test_case + " " + ans);
		} 
	}
	
	static void dfs(int idx, int distance) {
		ans=Math.max(distance, ans);
		
		for(int next:list[idx]) {
			if(!visited[next]) {
				visited[next] = true;
				dfs(next, distance+1);
				visited[next] = false;
			}
		}
		
	}
}