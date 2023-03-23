package lv0.외계행성의나이;

import java.util.Arrays;

public class Solution {
    public String solution(int age) {
        String answer = "";
        char[] c = {'a','b','c','d','e','f','g','h','i','j'};

        while(age > 0){
            answer += c[age%10];
            age = age / 10;
        }

        return new StringBuffer(answer).reverse().toString();
    }
}
