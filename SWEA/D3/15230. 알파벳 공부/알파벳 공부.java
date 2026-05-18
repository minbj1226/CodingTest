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
			String alphabet = sc.next();
			String ans = "abcdefghijklmnopqrstuvwxyz";
			int cnt = 0;
			
			for(int i=0; i<alphabet.length(); i++) {
				char word = alphabet.charAt(i);
				
				if(ans.charAt(i) != word) {
					break;
				}
				cnt++;
			}
			
			System.out.println("#" + test_case + " " + cnt);
		}
	}
}