import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		
		for(int test_case = 1; test_case <= 10; test_case++) {
			int T = sc.nextInt();

			for(int i = 1; i <= 8; i++) {
				arr[i] = sc.nextInt();
			}
			
			//숫자가 감소할 때 0보다 작아지면 끝
			while(arr[8] != 0) {
				for(int i=1; i<=5; i++) {
					arr[1] -= i;
					int temp = arr[1];
					for(int j=2; j<=8; j++) {
						arr[j-1] = arr[j];
					}
					arr[8] = temp;
					if(arr[8]<=0) {
						arr[8]=0;
						break;
					}
				}
			}
			
			System.out.print("#" + test_case + " ");
			for(int i=1; i<=8; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
		
	}
}