import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = d.length;
        Arrays.sort(d);
        int sum = 0;
        for(int i = d.length-1; i >= 0; i--){
            sum += d[i];
        } 
        while(sum > budget) {
            sum -= d[answer-1];
            answer--;
        }
        
        
        return answer;
    }
}