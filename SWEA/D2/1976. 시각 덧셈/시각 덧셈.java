import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int h1 = sc.nextInt();
			int m1 = sc.nextInt();
			int h2 = sc.nextInt();
			int m2 = sc.nextInt();
			
			int totalH = h1+h2;
			int totalM = m1+m2;
			
			if(totalM >= 60) {
				totalM %= 60;
				totalH++;
			}
			
			if(totalH > 12) {
				if(totalH==24) {
					totalH=12;
				} else {
				totalH %= 12;
				}
			}
			
			System.out.println("#" + test_case + " " + totalH + " " + totalM);
		}
	}
}