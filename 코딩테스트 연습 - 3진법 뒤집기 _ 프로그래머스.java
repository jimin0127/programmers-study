import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> num = new ArrayList<>();
        while(n > 0) {
            num.add(n % 3);
            n /= 3;
        }
        int power = 0;
        for(int i = num.size()-1; i >= 0 ; i--) {
            answer += Math.pow(3, power) * num.get(i);
            power++;
        }
        
        return answer;
    }
}