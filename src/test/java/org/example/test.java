package org.example;
import lv0.두수의차;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class test {
    @Test
    @DisplayName("3,2 => 1")
    void t1(){
        assertThat(두수의차.Solution.solution(3, 2)).isEqualTo(1);
    }
}
