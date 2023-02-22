package lv0;

public class 문자열뒤집기 {
    public class Solution {
        public String solution(String my_string) {
            StringBuffer str = new StringBuffer(my_string);
            return str.reverse().toString();
        }
    }
}
