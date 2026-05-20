import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			String check = sc.next();
			int cnt = 0;
			String msg = "YES";
			
			for(int i=0; i<check.length(); i++) {
				char lose=check.charAt(i);
				if(lose=='x') {
					cnt++;
				}
			}
			
			if(cnt>=8) {
				msg="NO";
			}
			
			System.out.println("#" + test_case + " " + msg);
		}
		
	}
}