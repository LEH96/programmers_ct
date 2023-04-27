package lv1.solved.직사각형별찍기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = "*".repeat(a);
        for(int i=0 ; i<b ; i++)
            System.out.println(result);
    }
}
