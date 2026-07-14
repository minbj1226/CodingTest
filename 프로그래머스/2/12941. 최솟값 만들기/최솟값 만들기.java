import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        // A는 작은 값, B는 큰 값을 곱
        for(int i=0; i<A.length; i++) {
            answer += A[i] * B[B.length-i-1];
        }

        return answer;
    }
}