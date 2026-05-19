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
			String N = sc.next();
			char[] num = new char[N.length()];
			int min = Integer.parseInt(N);
			int max = Integer.parseInt(N);
			
			for(int i=0; i<N.length(); i++) {
				num[i] = N.charAt(i);
			}
			
			for(int i=0; i<N.length()-1; i++) {
				for(int j=i+1; j<N.length(); j++) {
					swap(i, j, num);
					
					if(num[0] != '0') {
						int number = Integer.parseInt(new String(num));
						max = Math.max(max, number);
						min = Math.min(min, number);
					}
                    swap(i, j, num);
				}
			}
			
			System.out.println("#" + test_case + " " + min + " " + max);
		}
	}
	
	static void swap(int i, int j, char[] num) {
		char temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}
}