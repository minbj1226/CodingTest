import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int m1 = sc.nextInt();
			int day1 = sc.nextInt();
			int m2 = sc.nextInt();
			int day2 = sc.nextInt();
			int ans = 0;
			
			while(m1!=m2) {
				int cnt = m1%12-1;
				ans += month[cnt++];
				m1++;
			}
			
			System.out.println("#" + test_case + " " + (ans + day2 - day1 + 1));
		}
	}
}