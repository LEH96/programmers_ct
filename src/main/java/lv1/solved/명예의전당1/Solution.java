package lv1.solved.명예의전당1;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        List<Integer> answer = new LinkedList<>();

        for(int n : score) {
            if(queue.size() >= k) {
                if (n > queue.peek()) {
                    queue.poll();
                    queue.add(n);
                }
            }
            else { queue.add(n); }
            answer.add(queue.peek());
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
