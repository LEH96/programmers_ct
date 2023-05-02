package lv1.solved.소수만들기;

public class Solution {
    public int solution(int[] nums) {
        int num_of_prime = 0;

        for(int i=0 ; i<nums.length ; i++)
            for(int j=i+1 ; j<nums.length ; j++)
                for(int k=j+1 ; k<nums.length ; k++)
                    if(isPrime(nums[i]+nums[j]+nums[k]))
                        num_of_prime++;

        return num_of_prime;
    }

    public boolean isPrime(int n){
        for(int i=2 ; i<n ; i++)
            if(n % i == 0)
                return false;
        return true;
    }
}
