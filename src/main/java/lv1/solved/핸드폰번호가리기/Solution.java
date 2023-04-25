package lv1.solved.핸드폰번호가리기;

public class Solution {
    public String solution(String phone_number) {
        return phone_number.replaceAll("[0-9]","*").substring(0, phone_number.length() - 4) + phone_number.substring(phone_number.length()-4);
    }
}
