import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Solution
{
	static int len;
	static int start;
	static int num[];
	static boolean visited[];
	static boolean map[][];
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			len = sc.nextInt();
			start = sc.nextInt();
			num = new int[len];
			visited = new boolean[101];
			map = new boolean[101][101];
			
			for(int i=0; i < len/2; i++) {
				int from=sc.nextInt();
				int to=sc.nextInt();
				map[from][to] = true;
			}
			
			int result = bfs(start);
			
			System.out.println("#" + test_case + " " + result);
		}//end for
	}//main
	
	static int bfs(int start) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(start);
		visited[start] = true; //방문한 곳 처리
		
		int result = start;
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			int levelMax = 0;
			
			for(int s=1; s<=size; s++) {
				int cur = queue.poll();
				levelMax = Math.max(levelMax, cur);
				
				for(int i=1; i<=100; i++) {
					//from-to 저장되어 있으면
					if(map[cur][i]==true && visited[i] != true) {
						visited[i]=true;
						queue.offer(i);
					}	
				}//end for
			}//end for
			result = levelMax;
		}
		
		return result;
	}
}