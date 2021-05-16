class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int winCount = 0;
        for(int num : lottos) {
            if (num == 0) {
                zeroCount += 1;
            }else {
                for(int win : win_nums) {
                if(num == win) {
                    winCount += 1;
                }
            }
            }
            
        }
        
        answer[0] = 7 - Math.max((winCount + zeroCount), 1);
        answer[1] = 7 - Math.max(winCount, 1);
        
        return answer;
    }
}