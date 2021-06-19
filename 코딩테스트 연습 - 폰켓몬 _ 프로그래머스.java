import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        HashSet<Integer> p = new HashSet<>();
        
        for(int num : nums) {
            p.add(num);
        }
        answer = p.size();
        if(p.size() > nums.length/2){
            answer = nums.length/2;
        }
        
        return answer;
    }
}