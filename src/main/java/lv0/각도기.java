package lv0;

import java.math.BigDecimal;

public class 각도기 {
    public class Solution {
        public int solution(int angle) {
            if(angle > 0 && angle < 90){
                return 1;
            } else if(angle == 90) {
                return 2;
            } else if(angle > 90 && angle < 180) {
                return 3;
            } else { return 4; }
        }
    }

}
