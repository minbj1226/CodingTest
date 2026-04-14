import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] sizes = new int[6];
		
		for(int i=0; i<6; i++) {
			int size = sc.nextInt();
			sizes[i] = size;
		}
		
		int tShirt = sc.nextInt();
		int pen = sc.nextInt();
		int cnt = 0;
			
		for (int i=0; i<6; i++) {
			if(sizes[i]<=tShirt && sizes[i]!=0) {
				cnt++;
			} else {
				if(sizes[i]%tShirt != 0) {
					cnt += sizes[i] / tShirt + 1;
				} else {
					cnt += sizes[i] / tShirt;
				}
			}
		}
		
		int pens = (int)(N / pen); //볼펜 묶음 주문 개수
		int onePen = N % pen; //불펜 1자루 주문 개수
		
		System.out.println(cnt);
		System.out.print(pens + " " + onePen);
	}
}
