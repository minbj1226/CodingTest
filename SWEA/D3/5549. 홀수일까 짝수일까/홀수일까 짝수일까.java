import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			String num = sc.next();
			String msg = "";
			
			int lastNum = num.charAt(num.length()-1) - '0';
			
			if(lastNum % 2 == 1) {
				msg = "Odd";
			} else if(lastNum % 2 == 0) {
				msg = "Even";
			}
			
			System.out.println("#" + test_case + " " + msg);
		}
	}

}