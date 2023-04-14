package lv0.유한소수판별하기;

public class Solution {
    public int solution(int a, int b) {
        int idx = 2;
        while( idx <= Math.min(a, b) ) {
            if( a % idx == 0 && b % idx == 0 ) {
                a = a / idx;
                b = b / idx;
            }
            idx += 1;
        }

        while(b % 2 == 0 || b % 5 == 0){
            if(b % 2 == 0) {b = b / 2;}
            else {b = b / 5;}
        }

        return b == 1 ? 1 : 2;
    }
}
