import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = 10;
	    int[] block = new int[101];
		int ans = 0;
		int maxIdx = 0;
		int minIdx = 0;

		for(int test_case = 1; test_case <= T; test_case++)
		{
            int dump = sc.nextInt();

			for (int i = 0; i < 100; i++) {
				block[i] = sc.nextInt();
			} 
			
			for (int i = 0; i < dump; i++) {
				int max = Integer.MIN_VALUE;
				int min = Integer.MAX_VALUE;
				for (int j = 0; j < 100; j++) {
					if(block[j]>max) {
						max = block[j];
						maxIdx = j;
					}
					if(block[j]<min) { 
						min = block[j];
						minIdx = j;
					}
				}//end for

				if (max - min <= 1) {
					break;
				}

				block[maxIdx]--;
				block[minIdx]++;
			}//end for

			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			
			for (int j = 0; j < 100; j++) {
    			max = Math.max(max, block[j]);
    			min = Math.min(min, block[j]);
			}
			
			ans = max - min;
			System.out.println("#" + test_case + " " + ans);
		}
	}
}