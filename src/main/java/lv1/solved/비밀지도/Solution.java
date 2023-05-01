package lv1.solved.비밀지도;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int x=0 ; x<n ; x++){
            String bin = Integer.toBinaryString(arr1[x] | arr2[x]);
            StringBuilder row = new StringBuilder();

            for(char y : bin.toCharArray()) {
                if (y == '1')
                    row.append("#");
                else
                    row.append(" ");
            }

            if(row.length() < n)
                row = new StringBuilder(" ".repeat(n - row.length()) + row);

            answer[x] = String.valueOf(row);
        }

        return answer;
    }
}
