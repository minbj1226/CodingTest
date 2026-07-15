class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int start=1; start<=n; start++) {
            int sum = 0;

            for(int num=start; num<=n; num++) {
                sum += num;

                if(sum==n) {
                    answer++;
                    break;
                }

                if(sum>n) {
                    break;
                }
            }
        }

        return answer;
    }
}