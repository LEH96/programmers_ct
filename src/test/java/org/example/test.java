package org.example;

import lv0.두수의차;
import lv0.배열의평균값;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class test {
    @Test
    @DisplayName("3,2 => 1")
    void t1(){
        assertThat(두수의차.Solution.solution(3,2)).isEqualTo(0);
    }

    @Test
    @DisplayName("[1,2,3] => 2")
    void t2(){
        int[] arr = {1,2,3};
        assertThat(배열의평균값.Solution.solution(arr)).isEqualTo(2);
    }
}
