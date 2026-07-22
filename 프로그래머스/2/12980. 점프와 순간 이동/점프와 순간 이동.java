import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        while(n != 0) {
            //홀수일 때는 점프
            if(n % 2 == 1) {
                n -= 1;
                ans++;
            }
            n /= 2;
        }

        return ans;
    }
}