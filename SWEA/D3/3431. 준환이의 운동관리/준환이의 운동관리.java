import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			
			int ans = 0;
			int time = 0;
			
			if(X>U) {
				ans = -1;
			} else if(L>X) {
				while(X!=L) {
					X++;
					time++;
				}
				ans = time;
			}
			
			System.out.println("#" + test_case + " " + ans);
		}
	}
}