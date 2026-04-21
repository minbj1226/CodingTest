import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			StringBuilder sb = new StringBuilder();
			int len = sc.nextInt();
			sb.append(sc.next());
			
			for(int i=0; i<sb.length()-1; i++) {
				if(sb.charAt(i)==sb.charAt(i+1)) {
					sb.delete(i, i+2);
					i=-1;
				}
			}//end for
			
			System.out.print("#" + test_case + " ");
			
			for(int i=0; i<sb.length(); i++) {
				System.out.print(sb.charAt(i));
			}
            System.out.println();
			
		}
		
	}
}