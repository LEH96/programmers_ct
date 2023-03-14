package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class test {
    /*TDD*/
    @Test
    @DisplayName("70도 => 1")
    void t1(){ /*1. 실패 테스트 케이스 만든다.*/
        assertThat(lv0.각도기.Solution.solution(70)).isEqualTo(1);
        /*2. 여기서부터 함수 만들기 시작*/
        /*3. 계속적으로 수정 - 테스트케이스 만들기 반복*/
    }

    @Test
    @DisplayName("131도 => 3")
    void t2(){
        assertThat(lv0.각도기.Solution.solution(131)).isEqualTo(3);
    }

    @Test
    @DisplayName("배열 두배")
    void t3(){
        assertThat(lv0.배열두배만들기.Solution.solution(new int[] {1,2,3})).isEqualTo(new int[] {2,4,6});
    }
}
