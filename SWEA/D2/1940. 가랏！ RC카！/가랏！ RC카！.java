import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int accel = 0;
			int distance = 0;
			int speed = 0;
			
			for(int i=0; i<N; i++) {
				int command = sc.nextInt();
				
				//현재 속도 유지일 때
				if(command==0) {
					distance += speed * 1;
				}
				
				//가속일 때
				if(command==1) {
					accel = sc.nextInt();
					speed += accel;
					distance += speed * 1;
				}
				
				//감속일 때
				if(command==2) {
					accel = sc.nextInt();
					if(speed < accel) {
						speed = 0;
					} else {
						speed -= accel;
					}
					distance += speed * 1;
				}
			}
			
			System.out.println("#" + test_case + " " + distance);
		}
	}
}