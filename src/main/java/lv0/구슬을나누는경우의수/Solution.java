package lv0.구슬을나누는경우의수;

import java.math.BigInteger;

public class Solution {
    public BigInteger solution(int balls, int share) {
        return factorial(balls).divide(factorial(balls-share).multiply(factorial(share)));
    }

    public BigInteger factorial(int n) {
        if(n>1) {
            BigInteger num = new BigInteger(String.valueOf(n));
            BigInteger num2 = factorial(n-1);
            return num.multiply(num2);
        } else
            return new BigInteger("1");
    }
}
