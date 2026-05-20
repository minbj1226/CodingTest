import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int[] num = new int[7];
			
			for(int i=0; i<7; i++) {
				num[i] = sc.nextInt();
			}
			
			int sum = 0;
			HashSet<Integer> set = new HashSet<Integer>();
			
			for(int i=0; i<5; i++) {
				for(int j=i+1; j<6; j++) {
					for(int k=j+1; k<7; k++) {
						sum = num[i] + num[j] + num[k];
						set.add(sum);
					}
				}
			}

			ArrayList<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list, Collections.reverseOrder());
			
			System.out.println("#" + test_case + " " + list.get(4));
		}
	}
}