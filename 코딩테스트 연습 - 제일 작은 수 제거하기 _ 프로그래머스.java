import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            return new int[]{-1};
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != min) {
                list.add(arr[i]);
            }
        }

        int answer[] = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}