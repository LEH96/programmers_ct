package lv1.solved.소수찾기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        List<Integer> prime = new ArrayList<>();

        for(int i=2 ; i<=n ; i++){
            boolean isPrime = true;
            if(prime.size() > 0)
                for(int j=0 ; j < prime.size() ; j++){
                    if(prime.get(j) > Math.sqrt(n))
                        break;
                    if(i % prime.get(j) == 0){
                        isPrime = false;
                        break;
                    }
                }

            if( isPrime )
                prime.add(i);
        }

        return prime.size();
    }
}
