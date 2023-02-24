package lv0.개미군단;

public class Solution {
    public int solution(int hp) {
        int[] answer = new int[2];
        int[] ant = {5,3,1};

        for(int attack:ant){
            answer[0] += hp / attack;
            answer[1] = hp % attack;
            hp = hp - attack * (hp / attack);
            if(hp == 0)
                break;
        }

        return answer[0];
    }
}
