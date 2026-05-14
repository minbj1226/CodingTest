import java.util.ArrayList;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		ArrayList<String> list;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			list = new ArrayList<String>();
			int N = sc.nextInt();
			
			for(int i=0; i<N; i++) {
				list.add(sc.next());
			}
			
			int cnt = sc.nextInt();
			
			for(int i=0; i<cnt; i++) {
				String command = sc.next();
				//I이면 삽입
				if(command.equals("I")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					
					for(int j=0; j<y; j++) {
						String s = sc.next();
						list.add(x+j, s);
					}
				} 
				if(command.equals("D")) {
					int x = sc.nextInt();
					int y = sc.nextInt();
					
					for(int j=0; j<y; j++) {
						list.remove(x);
					}
				}
			}
			
			System.out.print("#" + test_case + " ");
			
			for(int i=0; i<10; i++) {
				System.out.print(list.get(i) + " ");
			}
			System.out.println();
			
		}
		
	}
}