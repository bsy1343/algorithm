# [Platinum V] Jeopardy - 18521

[문제 링크](https://www.acmicpc.net/problem/18521)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 31, 맞힌 사람: 28, 정답 비율: 82.353%

### 분류

수학, 게임 이론

### 문제 설명

<p>You are playing the final round of an intellectual game. A total of n topics were selected, and each of the n authors prepared a question for each topic. For each topic i and each author j, you know the probability that you will answer the question from the j-th author on the i-th topic.</p>

<p>Before you actually get the question, n &minus; 1 turns are made. Two actions happen during each turn. First, you discard all questions of any single topic. Second, the moderator discards all questions from any single author. Eventually only one question remains. If you answer it correctly, you win the round.</p>

<p>Of course, you discard columns trying to maximize the probability of your victory. On the contrary, the moderator tries do minimize it.</p>

<p>If you both play optimally, what is the probability that you answer the remaining question?</p>

### 입력

<p>In the first line, there is a single integer n (1 &le; n &le; 500), the number of topics and authors. Then follow n lines with n integers on each line. The i-th line corresponds to the i-th topic, and the j-th number on it is the probability that you will answer the question by the j-th author.</p>

<p>The probabilities are given as percentages. All integers in the description of topics are between 0 and 100.</p>

### 출력

<p>Print a single number: the desired probability as a percentage.</p>