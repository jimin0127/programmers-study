class Solution {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            for(int i = 0; i < s.length(); i++) {
                int c = (int)s.charAt(i);
                if(c < 47 || c > 57) {
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }
}