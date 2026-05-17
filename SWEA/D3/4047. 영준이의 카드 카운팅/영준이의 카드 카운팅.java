import java.util.HashSet;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			String card = sc.next();
			HashSet<String> hash = new HashSet<String>();
			StringBuilder sb = new StringBuilder();
			String msg = "";
			
			for(int i=0; i<card.length(); i+=3) {
				String pattern=card.substring(i, i+3);
				hash.add(pattern);
			}
			
			if(hash.size()!=card.length()/3) {
				msg = "ERROR";
				System.out.println("#" + test_case + " " + msg);
			} else if(hash.size()==card.length()/3) {
				int countS = 13;
				int countD = 13;
				int countH = 13;
				int countC = 13;
				
				for(int i=0; i<card.length(); i+=3) {
					char word=card.charAt(i);
					if(word == 'S') {
						countS--;
					} else if(word == 'D') {
						countD--;
					} else if(word == 'H') {
						countH--;
					} else if(word == 'C') {
						countC--;
					}
				}
				
				sb.append(countS).append(" ").append(countD).append(" ")
				.append(countH).append(" ").append(countC);
				
				System.out.println("#" + test_case + " " + sb);
			}
		}
		
	}
}