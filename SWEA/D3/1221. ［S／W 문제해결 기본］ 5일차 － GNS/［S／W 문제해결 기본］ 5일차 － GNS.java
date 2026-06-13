import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        String[] nums = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};

		for(int test_case = 1; test_case <= T; test_case++) {
            String tc = sc.next();
            int N = sc.nextInt();

            String[] num = new String[N];
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < N; i++) {
                num[i] = sc.next();
            }

            for(int i = 0; i < 10; i++) {
                for(int j = 0; j < N; j++) {
                    if(nums[i].equals(num[j])) {
                        sb.append(nums[i]).append(" ");
                    }
                }
            }

            System.out.println(tc);
            System.out.println(sb);
		}
	}
}