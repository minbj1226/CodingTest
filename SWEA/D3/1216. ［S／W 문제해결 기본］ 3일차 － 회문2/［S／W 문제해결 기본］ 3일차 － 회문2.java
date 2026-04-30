/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		char[][] grid = new char[100][100];
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int t = sc.nextInt();
			
			for(int r=0; r<100; r++) {
				String word = sc.next();
				for(int c=0; c<100; c++) {
					grid[r][c] = word.charAt(c);
				}
			}
			int answer = 0;
			//길이를 큰값에서 줄여가면서 처음 찾는 값이 가장 큰 값
			for(int len=100; len>0; len--) {
				//행 검사
				for(int r=0; r<100; r++) {
					for(int c=0; c<=100-len; c++) {
						boolean flag = true;
						for(int k=0; k<len/2; k++) {
							if(grid[r][c+k]!=grid[r][len+c-k-1]) {
								flag = false;
								break;
							}
						}
						if(flag) {
							answer=len;
						}
					}
				}
				//열 검사
				for(int c=0; c<100; c++) {
					for(int r=0; r<=100-len; r++) {
						boolean flag = true;
						for(int k=0; k<len/2; k++) {
							if(grid[r+k][c]!=grid[len+r-k-1][c]) {
								flag = false;
								break;
							}
						}
						if(flag) {
							answer=len;
						}
					}
				}
				
				if(answer!=0) {
					break;
				}
			}
			
			System.out.println("#" + t + " " + answer);
		}
		
	}
}