import java.util.LinkedList;
import java.util.Scanner;

class Solution
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt(); //암호문 개수
			LinkedList<String> list = new LinkedList<String>();
			
			for(int i=0; i<N; i++) {
				list.add(sc.next());
			}
			
			int cntDir = sc.nextInt();
			
			for(int i=0; i<cntDir; i++) {
				char dir = sc.next().charAt(0);
				
				if(dir=='I') {
					int x = sc.nextInt();
					int y = sc.nextInt();
					
					for(int j=0; j<y; j++) {
						list.add(x+j, sc.next());
					}
				} else if(dir=='D') {
					int x = sc.nextInt();
					int y = sc.nextInt();
					
					for(int j=0; j<y; j++) {
						list.remove(x);
					}
				} else if(dir=='A') {
					int y =sc.nextInt();
					for(int j=0; j<y; j++) {
						list.add(sc.next());
					}
				}
				
			}
			
			
			System.out.print("#" + test_case + " ");
			for(int i=0; i<10; i++) {
				System.out.print(list.poll() + " ");
			}
			System.out.println();
		}

	}
}