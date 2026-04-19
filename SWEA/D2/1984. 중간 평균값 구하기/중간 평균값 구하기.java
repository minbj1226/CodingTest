import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int max=Integer.MIN_VALUE;
			int min=Integer.MAX_VALUE;
			int sum=0;
			
			for(int i=0; i<10; i++) {
				int num=sc.nextInt();
				max=Math.max(max, num);
				min=Math.min(min, num);
				sum+=num;
			}
			
			System.out.println("#" + test_case + " " + Math.round((sum-min-max) / 8.0));
		}
	}
}