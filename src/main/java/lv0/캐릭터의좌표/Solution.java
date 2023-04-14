package lv0.캐릭터의좌표;

import java.util.List;

public class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x = 0;
        int y = 0;
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        List<String> move = List.of("right","up","left","down");

        for(String mv:keyinput){
            int next_x = x + dx[move.indexOf(mv)];
            int next_y = y + dy[move.indexOf(mv)];
            if(next_x >= -(board[0] / 2) && next_x <= board[0] / 2
                && next_y >= -(board[1] / 2) && next_y <= board[1] / 2){
                x = next_x;
                y = next_y;
            }
        }

        return new int[]{x, y};
    }
}
