package lv1.한번만등장한문자;

public class Solution {
    public String solution(String s) {
        String answer = "";
        return answer;
    }

    //v2
//    String answer = "";
//
//    //리스트에 문자 넣기
//    List<String> strlist = new ArrayList<>();
//    strlist = Arrays.stream(s.split("")).toList();
//
//    //문자 개수 세기
//        for(int i=0;i<s.length();i++){
//        int cnt = Collections.frequency(strlist, s.charAt(i)+"");
//        if(cnt == 1)
//            answer += s.charAt(i)+"";
//    }
//
//    //문자열 정렬하기
//    char[] charArr = answer.toCharArray();
//        Arrays.sort(charArr);
//        return new String(charArr);
}
