package lv0;

public class 배열원소의길이 {
    public class Solution {
        public static int[] solution(String[] strlist) {
            int answer[] = new int[strlist.length];
            for(int i=0;i<answer.length;i++){
                answer[i] = strlist[i].length();
            }
            return answer;
        }
    }
}
