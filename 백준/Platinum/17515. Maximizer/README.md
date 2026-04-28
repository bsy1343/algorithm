# [Platinum II] Maximizer - 17515

[문제 링크](https://www.acmicpc.net/problem/17515)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 235, 정답: 109, 맞힌 사람: 100, 정답 비율: 48.780%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>Maximizer has two permutations $A=[a_1,a_2,\cdots,a_N]$ and $B=[b_1,b_2,\cdots,b_N]$. Both $A, B$ have length $N$ and consists of <strong>distinct integers</strong>&nbsp;from $1$ to $N$.&nbsp;</p>

<p>Maximizer wants to maximize the sum of differences of each element, $\sum_{i=1}^{N} |a_i - b_i|$. But he can only swap two adjacent elements in $A$. Precisely, he can only swap $a_i$ and $a_{i+1}$ for some $i$ from $1$ to $N-1$. He can swap as many times as he wants.</p>

<p>What is the minimum number of swaps required for maximizing the difference sum?</p>

### 입력

<p>The first line contains an integer $N$. ($1 \leq N \leq 250\,000$)</p>

<p>The second line contains $N$ integers $a_1,a_2,\cdots,a_N$ ($1 \leq a_i \leq N$).</p>

<p>The third line contains $N$ integers $b_1,b_2,\cdots,b_N$ ($1 \leq b_i \leq N$).</p>

<p>Each of $[a_1,a_2,\cdots,a_N]$ and $[b_1,b_2,\cdots,b_N]$ is a permutation. In other words, it is consisted of distinct integers from $1$ to $N$.</p>

### 출력

<p>Print an integer, the minimum number of swaps required for maximizing the difference sum.</p>