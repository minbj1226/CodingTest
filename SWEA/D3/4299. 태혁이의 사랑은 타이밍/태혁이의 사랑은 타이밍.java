import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int day = sc.nextInt();
			int hour = sc.nextInt();
			int min = sc.nextInt();
			int sum = 0;
			
			if(day<11) {
				sum=-1;
			} else if(day==11) {
				if(hour<11) {
					sum=-1;
				} else if(hour==11) {
					if(min<11) {
						sum=-1;
					} else {
						sum=min-11;
					}
				} else {
					int h = (hour - 11) * 60;
					sum = h + min - 11;
				}
			} else if(day>11) {
				int d = (day - 11) * 24 * 60;
				int h = (hour - 11) * 60;
				sum = d + h + min - 11;
			}
			System.out.println("#" + test_case + " " + sum);
		}
	}
}