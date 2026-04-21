import java.util.Scanner;

class Solution
{
	static int N;
	static int[][] hamburger;
	static int L;
	static int maxScore;
	
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); //재료의 수
			L = sc.nextInt(); //칼로리 제한
			hamburger = new int[N][2];
			maxScore = 0;
			
			for(int i=0; i<N; i++) {
				int score = sc.nextInt();
				int calorie = sc.nextInt();
				hamburger[i][0]=score;
				hamburger[i][1]=calorie;
			}
			
			//칼로리 조합 계산
			calBurger(0, 0, 0);
			System.out.print("#" + test_case + " " + maxScore);			
			System.out.println();
		}//end for
	}//main

	//칼로리를 안넘길 때 최고 점수
	static void calBurger(int start, int score, int calorie) {
		if(calorie > L) {
			return;
		}
		
		if(start==N) {
			maxScore = Math.max(maxScore, score);
			return;
		}
		
		//현재 재료 선택
		calBurger(start+1, score+hamburger[start][0], calorie+hamburger[start][1]);
		
		//현재 재료 선택x
		calBurger(start+1, score, calorie);
	}
}