# [Platinum V] Geometric Progression - 31348

[문제 링크](https://www.acmicpc.net/problem/31348)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 156, 정답: 39, 맞힌 사람: 29, 정답 비율: 26.126%

### 분류

수학, 정수론

### 문제 설명

<p>bobo loves geometric progressions! So he wants to know the number of geometric progressions of length $3$ in a sequence $a_1, a_2, \dots, a_n$.</p>

<p>That is to say, count the number of $(i, j, k)$ where $i &lt; j &lt; k$ and $a_{i} \cdot a_{k} = a_j^2$.</p>

### 입력

<p>The first line contains an integer $n$ ($1 \leq n \leq 1000000$).</p>

<p>The second line contains $n$ integers $a_1, a_2, \dots, a_n$ ($1 \leq a_1 &lt; a_2 &lt; \dots &lt; a_n \leq 1000000$).</p>

### 출력

<p>A single integer denotes the number of geometric progressions.</p>