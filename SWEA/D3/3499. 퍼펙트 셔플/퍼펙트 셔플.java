import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		StringBuilder sb;
		String[] arr;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int cnt = sc.nextInt();
			int mid = cnt / 2; //가운데 인덱스
			arr = new String[cnt];
			sb = new StringBuilder();
			
			for(int i=0; i<cnt; i++) {
				arr[i] = sc.next();
			}
			
			//짝수일 때
			if(cnt%2==0) {
				for(int i=0; i<mid; i++) {
					sb.append(arr[i]).append(" ").append(arr[i+mid]).append(" ");
				}
			} else {
				for(int i=0; i<mid; i++) {
					sb.append(arr[i]).append(" ").append(arr[i+mid+1]).append(" ");
				}
				sb.append(arr[mid]);
			}
			
			System.out.println("#" + test_case + " " + sb);
		}
	}
}