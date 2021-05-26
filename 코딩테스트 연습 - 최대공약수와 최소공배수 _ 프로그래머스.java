class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        if(n > m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        answer[0] = gcd(n, m);
        answer[1] = m * n / answer[0];
        
        
        return answer;
    }
    
    public static int gcd(int n, int m) {
        while(true) {
            if(m % n == 0 ) {
                return n; 
            }else {
                int temp = m % n;
                m = n; 
                n = temp;
            }
        }
    }
}