package lv1.solved.두정수사이의합;

import java.util.stream.LongStream;

public class Solution {
    public long solution(int a, int b) {
        if(a <= b)
            return LongStream.range((long)a, (long)b+1).sum();
        else
            return LongStream.range((long)b, (long)a+1).sum();
    }
}
