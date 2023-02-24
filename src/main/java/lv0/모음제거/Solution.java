package lv0.모음제거;

import java.util.Arrays;

public class Solution {
    public String solution(String my_string) {
        return my_string.replaceAll("a|e|i|o|u", "");
    }
}
