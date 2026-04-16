import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if(A-B == 1 || A-B == -2) {
			System.out.print("A");
		} else if(B-A == 1 || B-A == -2) {
			System.out.print("B");
		}
	}
}