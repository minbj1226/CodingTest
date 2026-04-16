import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++) {
            String word = sc.next();
            int cnt = 0;

            for(int i=0; i<word.length(); i++) {
                //길이가 짝수 일 때
                if(word.length() % 2 == 0) {
                    if(word.charAt(i) == word.charAt(word.length()-1-i)) {
                        cnt=1;
                    }
                }

                //길이가 홀수 일 때
                if(word.length() % 2 == 1) {
                    if(i == word.length()-1-i) {
                        break;
                    }

                    if(word.charAt(i) == word.charAt(word.length()-1-i)) {
                        cnt=1;
                    }    
                }
            }

            System.out.println("#" + test_case + " " + cnt);
		}//end for        

    }//main
}