import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[][] student = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        
        for(int i = 0;i < answers.length;  i++) {
            for(int j = 0; j < student.length; j++){
                if(answers[i] == student[j][i % student[j].length])
                    answer[j] += 1;            
            }
        }
        
        int max = Math.max(answer[0], Math.max(answer[1], answer[2]));
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            if(max == answer[i]){
                list.add(i+1);
            }
        }
        
        
        return list.stream().mapToInt(i -> i.intValue()).toArray();
    }
}