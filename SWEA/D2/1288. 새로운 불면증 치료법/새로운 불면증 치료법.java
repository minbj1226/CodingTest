import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Set<Integer> set;
		
		for(int test_case=1; test_case<=T; test_case++) {
			int N = sc.nextInt();
			int mul = 0;
			set = new HashSet<Integer>();
			
			//0~9까지 모든 숫자 찾으면 출력
			while(set.size() != 10) {
				mul++;
				int tmp = N * mul;
				
				while(tmp != 0) {
					set.add(tmp % 10);
					tmp /= 10;
				}
			}
			
			System.out.println("#" + test_case + " " + N * mul);
		}
	}//main
}