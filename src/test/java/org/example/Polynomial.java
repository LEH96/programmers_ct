package org.example;

import java.util.ArrayList;
import java.util.List;

public class Polynomial{
    String exp;
    public Polynomial(String s){
        this.exp = s;
    }

    public int calc() {
        String[] in = exp.split(" ");
        List<Character> sign = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();

        for(int i=0;i<in.length;i++){
            if( Character.isDigit(in[i].charAt(0)) )
                nums.add(Integer.parseInt(in[i]));
            else
                sign.add(in[i].charAt(0));
        }

        int result = nums.get(0);
        for(char c : sign){
            switch(c){
                case '+':
                case '*':
                case '(':
            }
        }
        return result;
    }
}
