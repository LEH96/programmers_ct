package lv1.solved.최대공약수와최소공배수;

public class Solution {
    public int[] solution(int n, int m) {
        int gcd = 1;
        int lcm = 0;

        for(int i=2 ; i<=Math.min(n,m) ; i++)
            if(n % i == 0 && m % i == 0)
                gcd = i;

        lcm = gcd * (n / gcd) * (m / gcd);
        return new int[]{gcd, lcm};
    }
}
