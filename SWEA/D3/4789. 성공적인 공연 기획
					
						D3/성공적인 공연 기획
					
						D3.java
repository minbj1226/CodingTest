import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			String person = sc.next();
			
			int sum = 0;
			int ans = 0;
			
			for(int i=0; i<person.length(); i++) {
				int cnt = person.charAt(i) - '0';
				
				if(sum<i) {
					ans += i-sum;
					sum = i;
				}
				
				sum += cnt;
			}
			
			System.out.println("#" + test_case + " " + ans);
		}
		
	}
}