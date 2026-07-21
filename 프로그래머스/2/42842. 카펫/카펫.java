class Solution {
    public int[] solution(int brown, int yellow) {
        int r = 0;
        int c = 0;
        
        for(int yellowHeight=1; yellowHeight * yellowHeight <= yellow; yellowHeight++) {
            if(yellow % yellowHeight != 0) {
                continue;
            }

            int yellowWidth = yellow / yellowHeight;

            int width = yellowWidth + 2;
            int height = yellowHeight + 2;

            if((width * height - yellow) == brown) {
                r = width;
                c = height;
            }
        }

        int[] answer = {r, c};
        return answer;
    }
}