# [Gold III] Bunch of Paper - 23104

[문제 링크](https://www.acmicpc.net/problem/23104)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 173, 정답: 77, 맞힌 사람: 62, 정답 비율: 41.333%

### 분류

다이나믹 프로그래밍, 누적 합, 두 포인터

### 문제 설명

<p>There are $N$ sheets of paper, enumerated by sequential integers from $1$ to $N$. Each sheet has $K$ integers written on it, so $i$-th sheet contains the integers $v_{i,1}, v_{i,2}, \ldots, v_{i,K}$.</p>

<p>Then we choose one integer from each sheet and create the sequence $a_i$, where $i$-th integer is chosen from $i$-th sheet of paper. There are $K^N$ ways to make such a sequence. How many of them are non-decreasing? A sequence is non-decreasing if $a_i \le a_{i+1}$ for all $1 \le i \le N-1$.</p>

<p>The answer may be too large, so print it modulo $10^9 + 7$.</p>

### 입력

<p>The first line of the input contains two integers $N$ and $K$ ($1 \le N \le 100$, $1 \le K \le 10^4$). The $i$-th of the following $N$ lines contains $K$ integers $v_{i,1}, v_{i,2}, \ldots, v_{i,K}$ ($1 \le v_{i,1} &lt; v_{i,2} &lt; \ldots &lt; v_{i,K} \le 10^9$).</p>

### 출력

<p>Print the number of non-decreasing sequences, modulo $10^9 + 7$.</p>