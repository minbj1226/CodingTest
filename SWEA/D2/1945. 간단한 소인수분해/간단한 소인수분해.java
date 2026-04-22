import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] div = {2, 3, 5, 7, 11};
		int[] use;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int num = sc.nextInt();
			use = new int[5];
			
			while(num!=1) {
				for(int i=4; i>=0; i--) {
					if(num % div[i] == 0) {
						num /= div[i];
						use[i]++;
					}
				}
			}
			
			System.out.print("#" + test_case + " ");
			for(int i=0; i<5; i++) {
				System.out.print(use[i] + " ");
			}
			System.out.println();
		}
	}
}