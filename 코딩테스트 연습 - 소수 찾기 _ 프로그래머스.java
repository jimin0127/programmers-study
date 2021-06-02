import java.util.*;
class Solution {

    public int solution(int n) {
        int answer = 0;
        boolean prime[] = new boolean[n+1];

        prime[0] = prime[1] = true;
        
        for(int i=2; i*i<=n; i++){
            if(!prime[i]){
            	for(int j=i*i; j<=n; j+=i) prime[j] = true;                
            }        
        }    
        
        // 소수 출력
        for(int i=1; i<=n;i++){
        	if(!prime[i]) answer += 1;  
        }
        
        return answer;
    }
}