import java.util.Scanner;
import java.util.LinkedList;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
		LinkedList<String> list;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			list = new LinkedList<String>();
			int len = sc.nextInt();
			
			for(int i=0; i<len; i++) {
				list.add(sc.next());
			}
			
			int cnt = sc.nextInt();

			for(int i=0; i<cnt; i++) {
				String command = sc.next();
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				for(int j=0; j<y; j++) {
					String s = sc.next();
					
					list.add(x+j, s);
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