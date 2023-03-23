package lv0.합성수찾기;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        List<Integer> num = new ArrayList<>();
        int count = 0;

        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++)
                if(i % j == 0) { count++; }

            if(count >= 3)
                num.add(i);
            count = 0;
        }

        return num.size();
    }
}
