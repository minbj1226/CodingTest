class Solution {
    public int solution(int n) {
        int answer = 0;
        String digit ="";
        int count = 0;
        int compareNum = n+1;

        digit=Integer.toBinaryString(n);
        
        for(int cnt=0; cnt<digit.length(); cnt++) {
            if(digit.charAt(cnt)=='1') {
                count++;
            }
        }

        while(true) {
            digit=Integer.toBinaryString(compareNum);
            int compareCount = 0;

            for(int cnt=0; cnt<digit.length(); cnt++) {
                if(digit.charAt(cnt)=='1') {
                    compareCount++;
                }
            }

            if(count == compareCount) {
                break;
            }

            compareNum++;
        }

        answer = compareNum;
        return answer;
    }
}