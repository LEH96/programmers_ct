package lv0;

public class 배열뒤집기 {
    public class Solution {
        public static int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];
            for(int i=0;i<num_list.length;i++){
                answer[i] = num_list[num_list.length-i-1];
            }
            return answer;
        }
    }
}
