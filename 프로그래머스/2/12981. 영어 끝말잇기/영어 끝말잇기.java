import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> useWords = new HashSet<>();
        useWords.add(words[0]);

        //끝말잇기 진행 횟수
        for(int i=1; i<words.length; i++) {
            String previous = words[i-1];
            String current = words[i];
            
            boolean isNotConnected = previous.charAt(previous.length()-1) != current.charAt(0);
            boolean isDuplicated = useWords.contains(current);

            if(isNotConnected || isDuplicated) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }

            useWords.add(current);
        }

        return new int[]{0, 0};
    }
}