import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
        StringBuilder sb;

		for(int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            sb = new StringBuilder();
            String word;
            int cnt;
            int chance = 0;

            for(int i=0; i<N; i++) {    
                word=sc.next();
                cnt=sc.nextInt();

                while(cnt > 0) {
                    cnt--;
                    sb.append(word);
                    chance++;

                    if(chance==10) {
                        sb.append("\n");
                        chance=0;
                    }
                }
            }
			System.out.println("#" + test_case);
            System.out.println(sb.toString());
		}//end for
    }
}