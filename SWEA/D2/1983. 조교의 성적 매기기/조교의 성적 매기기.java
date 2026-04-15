import java.util.Arrays;
import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int mid = 0;
		int last = 0;
		int hw = 0;
		int[] score;
		String[] grade;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int K = sc.nextInt();
			score = new int[N];
			grade = new String[]{"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};
			int stu = 0;
			
			//n명의 학생 점수
			for(int i=0; i<N; i++) {
				mid = sc.nextInt();
				last = sc.nextInt();
				hw = sc.nextInt();
				score[i] = (int)(mid*35 + last*45 + hw*20);
				if(K-1==i) {
					stu=score[i];
				}
			}
			
			//점수 오름차순
			Arrays.sort(score);
			
			int div = N / 10;
			int idx = 0;
			for(int i=0; i<N; i++) {
				if(score[i]==stu) {
					idx=i;
					break;
				}
			}
			
			System.out.println("#" + test_case + " " + grade[idx/div]);
		}
	}
}