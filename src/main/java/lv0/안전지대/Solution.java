package lv0.안전지대;

public class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int answer = n * n;

        for(int x=0 ; x<n ; x++)
            for(int y=0 ; y<n ; y++)
                if(board[x][y] == 1)
                    for(int i=-1 ; i<=1 ; i++)
                        for(int j=-1 ; j<=1 ; j++)
                            if(is_in_board(x+i, y+j, n)) {
                                if (board[x + i][y + j] == 1)
                                    continue;
                                board[x+i][y+j] = -1;
                            }

        for(int i=0 ; i<n ; i++)
            for(int j=0 ; j<n ; j++)
                if(board[i][j] == -1 || board[i][j] == 1)
                    answer = answer - 1;

        return answer;
    }

    public boolean is_in_board(int x, int y, int n){
        return 0 <= x && x < n && 0 <= y && y < n;
    }
}
