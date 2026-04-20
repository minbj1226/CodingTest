import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();
			String find = sc.next();
			String word = sc.next();
			int cnt = 0;
			
			for(int i=0; i<word.length(); i++) {
				for(int j=i+1; j<word.length(); j++) {
					if(find.equals(word.substring(i, j+1))) {
						cnt++;
					}
				}
			}
			
			System.out.println("#"+ T + " " + cnt);
		}
		
	}
}