package lv1.직각삼각형출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            String str = "";
            for(int j=0;j<i;j++){
                str += "*";
            }
            System.out.println(str);
        }
    }
}
