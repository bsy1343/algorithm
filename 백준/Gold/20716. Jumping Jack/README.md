# [Gold III] Jumping Jack - 20716

[문제 링크](https://www.acmicpc.net/problem/20716)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 9, 정답: 7, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

매개 변수 탐색

### 문제 설명

<p>For as long as he could remember, Jack has loved to jump. His goal is to become an Olympic athlete someday, so he spends lots of time practicing his jumping skills. Jack has set up a course of checkpoints along a straight line from his starting point. To go through this course, Jack picks a jumping level, which defines how far he can travel along these checkpoints. Specifically, if Jack is at a checkpoint located at position $i$ and has picked jumping level $j$, he will jump to the furthest checkpoint that is at or before position $i + j$. If there is no checkpoint in the range $[i + 1, i + j]$, then Jack will fail to finish the course because he cannot make a jump.</p>

<p>Jack wants to know how he should pick his jumping level so that he can make it through the course. Additionally, in order to get in enough practice without overexercising, Jack wants to finish the course in exactly $k$ jumps. Given the positions of all the checkpoints, find the maximum jump level that Jack should pick to make it through the course with exactly $k$ jumps or determine if it is impossible to do so.</p>

### 입력

<p>The first line of input is $2$ integers separated by spaces $n$ and $k$ such that $3 \leq n \leq 10^6$ and $2 \leq k &lt; n$. The next line is $n$ distinct integers in sorted order that represent the checkpoint positions, $c_i$, that Jack jumps to. You are guaranteed that $c_1 = 0$ and $c_i \leq 10^6$</p>

### 출력

<p>Output a single integer representing the maximum possible jump size such that Jack takes exactly $k$ jumps through the checkpoints given that jump size. If no such jump size exists, output $-1$.</p>