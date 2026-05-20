import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double k = (a+c)/2;
			
			double ans = Math.abs(b-k);
			
			System.out.printf("#%d %.1f%n", test_case, ans);
		}
		
	}
}