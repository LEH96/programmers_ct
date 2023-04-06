package lv1.로그인성공;

public class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String id = id_pw[0];
        String pw = id_pw[1];
        for(int i=0;i<db.length;i++){
            if(id.equals(db[i][0]))
                if(pw.equals(db[i][1]))
                    return "login";
                else return "wrong pw";
        }
        return "fail";
    }
}
