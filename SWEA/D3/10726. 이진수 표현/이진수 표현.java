import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();
			StringBuilder sb = new StringBuilder();
			boolean flag = false;
			String msg = "OFF";
			
			if (M == 0) {
                sb.append("0");
            } else {
                while (M > 0) {
                    sb.append(M % 2);
                    M /= 2;
                }
                sb.reverse();
            }
			
			if(sb.length()>=N) {
				//뒤에서 N개의 자리
				String digit = sb.substring(sb.length()-N);
				flag = true;
				
				for(int i=0; i<digit.length(); i++) {
					if(digit.charAt(i)!='1') {
						flag=false;
						break;
					}
				}
				
				if(flag) {
					msg = "ON";
				} else {
					msg = "OFF";
				}
			} 
			
			System.out.println("#" + test_case + " " + msg);
		}
	}
}