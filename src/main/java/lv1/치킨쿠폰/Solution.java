package lv1.치킨쿠폰;

public class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int answer = 0;

        while(coupon >= 10){
            int eaten = coupon / 10;
            coupon = coupon % 10 + eaten;
            answer += eaten;
        }

        return answer;
    }
}
