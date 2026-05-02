import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] num;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			num = new String[N];
					
			for(int r=0; r<N; r++) {
				num[r] = sc.next();
			}
			
			String code=" "; 
			
			for(int r=0; r<N; r++) {
				int last = num[r].lastIndexOf("1");
				//1이 있으면
				if(last!=-1) {
					code = num[r].substring(last-55, last+1);
					break;
				}
			}
			
			// 홀/짝 여부 체크용
			int idx = 0;
			int sum = 0;
			int sumOdd = 0;
			int sumEven = 0;
			
			for(int len=0; len<code.length(); len+=7) {
				String ans = code.substring(len, len+7);
				idx++;
				
				if(ans.equals("0001101")) sum = 0;
			    if(ans.equals("0011001")) sum = 1;
			    if(ans.equals("0010011")) sum = 2;
			    if(ans.equals("0111101")) sum = 3;
			    if(ans.equals("0100011")) sum = 4;
			    if(ans.equals("0110001")) sum = 5;
			    if(ans.equals("0101111")) sum = 6;
			    if(ans.equals("0111011")) sum = 7;
			    if(ans.equals("0110111")) sum = 8;
			    if(ans.equals("0001011")) sum = 9;
				
				//홀수번의 숫자면
				if(idx%2==1) {
					sumOdd += sum;
				}
				
				//짝수번의 숫자면
				if(idx%2==0) {
					sumEven += sum;
				}
			}
			
			//정답 출력
			int sol = 0;
			if((sumOdd * 3 + sumEven) % 10 == 0) {
				sol = sumOdd + sumEven;
			}
			
			System.out.println("#" + test_case + " " + sol);
		}
		
	}
}