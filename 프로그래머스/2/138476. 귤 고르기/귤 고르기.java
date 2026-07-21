import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int size: tangerine) {
            countMap.put(size, countMap.getOrDefault(size, 0) + 1);
        }

        int[] counts = new int[countMap.size()];
        int index = 0;

        for(int count:countMap.values()) {
            counts[index] = count;
            index++;
        }

        Arrays.sort(counts);

        for(int i=counts.length - 1; i>=0; i--) {
            k -= counts[i];
            answer++;

            if(k<=0) {
                break;
            }
        }

        return answer;
    }
}