package lv1.명예의전당1;

public class Solution {
    public int[] solution(int k, int[] score) {
        import heapq

        def solution(k, score):
        pq, answer = [], []
        for n in score:
        if len(pq) >= k:
        if n > pq[0]:
        heapq.heappop(pq)
        heapq.heappush(pq, n)
                else:
        heapq.heappush(pq, n)

        answer.append(pq[0])

        return answer
    }
}
