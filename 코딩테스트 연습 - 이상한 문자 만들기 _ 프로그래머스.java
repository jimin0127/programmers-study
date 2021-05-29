class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");
        int cnt = 0;
        
        for(int i = 0; i < array.length; i++) {
            answer += cnt%2 == 0 ? array[i].toUpperCase() : array[i].toLowerCase();
            if(array[i].equals(" ")){
                cnt = 0;
            }else {
                cnt++;
            }
        }
        
        return answer;
    }
}