class Solution {
    public int solution(int n) {
        int prev = 0; //f(0)
        int curr = 1; //f(1)

        for(int i=2; i<=n; i++) {
            int next = (prev + curr) % 1234567;

            prev = curr;
            curr = next;
        }
        
        return curr;
    }
}