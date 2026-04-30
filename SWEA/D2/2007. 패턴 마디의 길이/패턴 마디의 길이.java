import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			StringBuilder sb = new StringBuilder();
			sb.append(sc.next());
			int ans = 0;
			
			for(int len=1; len<=10; len++) {
				String first = sb.substring(0, len);
				String last = sb.substring(len, 2*len);
				ans = len;
				if(first.equals(last)) {
					break;
				}
			}
			
			System.out.println("#" + test_case + " " + ans);
			
		}
	}
}