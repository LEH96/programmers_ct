package lv0.모스부호1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String letter) {
        String answer = "";
        Map<String, String> morse = new HashMap<>(){
            {
                put(".-","a");
                put("-...","b");
                put("-.-.","c");
                put("-..","d");
                put(".","e");
                put("..-.","f");
                put("--.","g");
                put("....","h");
                put("..","i");
                put(".---","j");
                put("-.-","k");
                put(".-..","l");
                put("--","m");
                put("-.","n");
                put("---","o");
                put(".--.","p");
                put("--.-","q");
                put(".-.","r");
                put("...","s");
                put("-","t");
                put("..-","u");
                put("...-","v");
                put(".--","w");
                put("-..-","x");
                put("-.--","y");
                put("--..","z");
            }
        };
        String[] letters = letter.split(" ");
        for(String str : letters){
            answer += morse.get(str);
        }
        return answer;
    }
}
