package lv1.기사단원의무기;

import java.util.Arrays;

public class Solution {
    public int solution(int number, int limit, int power) {
        int[] primeArr = new int[number+1];
        for(int i=1 ; i<=number ; i++){
            int p = getPrime(i);
            if(p > limit)
                primeArr[i] = power;
            else
                primeArr[i] = p;
        }

        return Arrays.stream(primeArr).sum();
    }

    public int getPrime(int num){
        int prime = 0;
        for(int i=1 ; i<=Math.sqrt(num) ; i++)
            if(num % i == 0)
                if(i * i == num)
                    prime++;
                else
                    prime+=2;

        return num != 1 ? prime : 1;
    }
}
