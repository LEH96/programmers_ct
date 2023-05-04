package lv1.다트게임;

public class Solution {
    public int solution(String dartResult) {
        score = {}
        prev, now = 0, 0

        for op in dartResult:
        if op.isdigit():
        prev = now
        if now == "1" and op == "0":
        now = 10
                else:
        now = op
            else:
        now = int(now)
        if op in "SDT#":
        if now in score.keys():
        score[now].append(op)
                    else:
        score[now] = [op]
        elif op == "*":
        prev_int = int(prev)
        if now in score.keys():
        score[now].append(op)
                    else:
        score[now] = [op]
        if prev_int in score.keys():
        score[prev_int].append(op)
                    else:
        score[prev_int] = [op]

        total = 0
        for num, ops in score.items():
        n_score = num
        is_bonus_op = False
        for op in ops:
        if op in "SDT":
        if is_bonus_op:
        total += n_score
        n_score = num
        is_bonus_op = True

        if op == "S":
        n_score = n_score
        elif op == "D":
        n_score = n_score ** 2
        elif op == "T":
        n_score = n_score ** 3
                else:
        is_bonus_op = False

        if op == "*":
        n_score = n_score * 2
        elif op == "#":
        n_score = n_score * (-1)

        total += n_score


        return total
    }
}
