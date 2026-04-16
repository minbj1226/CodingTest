import java.util.Scanner;

class Solution
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] num1;
        int[] num2;

        for(int test_case=1; test_case<=T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int max = Integer.MIN_VALUE;

            num1 = new int[N];
            num2 = new int[M];

            for(int i=0; i<N; i++) {
                num1[i] = sc.nextInt();
            }

            for(int i=0; i<M; i++) {
                num2[i] = sc.nextInt();
            }

            //시작점
            if(M >= N) {
                for(int i=0; i<M-N+1; i++) {
                    int sum = 0; //곱한 후 합
                    int k = 0;
                    for(int j=i; j<i+N; j++) {
                        sum += num1[k] * num2[j];
                        k++; 
                    }
                    max = Math.max(max, sum);
                }
            } else {
                for(int i=0; i<N-M+1; i++) {
                    int sum = 0; //곱한 후 합
                    int k = 0;
                    for(int j=i; j<i+M; j++) {
                        sum += num1[j] * num2[k];
                        k++; 
                    }
                    max = Math.max(max, sum);
                }
            }

            System.out.println("#" + test_case + " " + max);
        }
    }
}