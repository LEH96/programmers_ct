package lv0.소인수분해;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        int x = 0;
        for(int i=2;i<=n;i++){
            while(n%i==0){
                if(i != x)
                    answer.add(i);
                n = n / i;
                x = i;
            }
            if(n==1)
                break;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
