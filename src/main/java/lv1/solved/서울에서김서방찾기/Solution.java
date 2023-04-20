package lv1.solved.서울에서김서방찾기;

import java.util.Arrays;

public class Solution {
    public String solution(String[] seoul) {
        // return "김서방은 %s에 있다".formatted(Arrays.asList(seoul).indexOf("Kim"));
        return String.format("김서방은 %s에 있다", Arrays.asList(seoul).indexOf("Kim"));
    }
}
