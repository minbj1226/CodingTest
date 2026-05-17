import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			StringBuilder sb = new StringBuilder();
			String num = sc.next();
			
			int front = Integer.parseInt(num.substring(0, 2));
			int round = num.charAt(2) - '0';
			
			if(round>=5) {
				front++;
			}
			
			int len = num.length()-1;
			if(front==100) {
				front /= 10;
				len = num.length();
			}
			
			sb.append(front / 10).append(".").append(front % 10)
			.append("*").append(10).append("^").append(len);
			
			System.out.println("#" + test_case + " " + sb);
		}
	}
}