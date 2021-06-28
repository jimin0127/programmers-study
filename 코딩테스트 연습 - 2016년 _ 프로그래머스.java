class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int days = 0;
        String[] results = {"THU", "FRI","SAT", "SUN","MON","TUE","WED"};
        int[] months = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for(int i = 0; i < a-1; i++) {
            days += months[i];
        }
        days += b;
        
        answer = results[days%7];
        
        return answer;
    }
}