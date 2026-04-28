# [Bronze III] Coffee Cup Combo - 26026

[문제 링크](https://www.acmicpc.net/problem/26026)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 483, 정답: 399, 맞힌 사람: 360, 정답 비율: 83.527%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p>Jonna is a university student who attends $n$ lectures every day. Since most lectures are way too simple for an algorithmic expert such as Jonna, she can only stay awake during a lecture if she is drinking coffee. During a single lecture she needs to drink exactly one cup of coffee to stay awake.</p>

<p>Some of the lecture halls have coffee machines, so Jonna can always make sure to get coffee there. Furthermore, when Jonna leaves a lecture hall, she can bring at most two coffee cups with her to the following lectures (one cup in each hand). But note that she cannot bring more than two coffee cups with her at any given time.</p>

<p>Given which of Jonna&#39;s lectures have coffee machines, compute the maximum number of lectures during which Jonna can stay awake.</p>

### 입력

<p>The first line contains the integers $n$ ($1 \leq n \leq 10^5$), the number of lectures Jonna attends.</p>

<p>The second line contains a string $s$ of length $n$. The $i$&#39;th letter is <code>1</code> if there is a coffee machine in the $i$&#39;th lecture hall, and otherwise it is <code>0</code>.</p>

### 출력

<p>Print one integer, the maximum number of lectures during which Jonna can stay awake.</p>