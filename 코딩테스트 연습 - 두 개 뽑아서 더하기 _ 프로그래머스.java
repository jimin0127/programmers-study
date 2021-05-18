import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> numberSet = new HashSet<>();
        for(int i = 0; i < numbers.length-1; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                numberSet.add(numbers[i] + numbers[j]);
            }
        }
        
        int[] answer = new int[numberSet.size()];
        int i = 0;
        Iterator<Integer> iterator = numberSet.iterator();
        while(iterator.hasNext()){
            answer[i] = iterator.next();
            i++;
        }
        Arrays.sort(answer);
        return answer;
    }
}