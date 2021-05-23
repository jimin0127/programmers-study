class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int x_ = x;
        int sum = 0;
        while(x > 0) {
            sum += x%10;
            x /= 10;
        }
        System.out.println(sum);
        if(x_ % sum != 0) {
            answer = false;
        }
        
        
        return answer;
    }
}