import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			String msg = "yes";
			boolean[] colUsed = new boolean[8];
			
			for(int r=0; r<8; r++) {
				int colCount = 0;
				String chess = sc.next();
				
				for(int c=0; c<8; c++) {
					if(chess.charAt(c) == 'O') {
						colCount++;

						if(colUsed[c]) {
							msg = "no";
						} else {
							colUsed[c] = true;
						}
					}
				}
				
				if(colCount!=1) {
					msg = "no";
				}
				
			}
			
			System.out.println("#" + test_case + " " + msg);
		}
	}
}