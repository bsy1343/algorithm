# [Gold I] Interesting Subsegments - 24697

[문제 링크](https://www.acmicpc.net/problem/24697)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 46, 정답: 19, 맞힌 사람: 12, 정답 비율: 36.364%

### 분류

수학, 그리디 알고리즘, 브루트포스 알고리즘, 해 구성하기, 누적 합, 조합론

### 문제 설명

<p>A subsegment (contiguous subarray) of an array is <em>interesting</em> if the sum of values on this subsegment is divisible by $3$.</p>

<p>You are given two integers $n$ and $k$. Your goal is to construct the lexicographically minimal array of length $n$ such that it consists only of integers $0$, $1$, and $2$, and has exactly $k$ distinct interesting subsegments.</p>

<p>Array $a$ of length $n$ is lexicographically smaller than array $b$ of the same length if there is $1 \le i \le n$ such that $a_j = b_j$ for $j &lt; i$ and $a_i &lt; b_i$. Two subsegments are distinct if some element of the array belongs to one subsegment but not to the other.</p>

### 입력

<p>The only line of input contains two integers $n$ and $k$ ($1 \le n \le 10^6$, $0 \le k \le 10^{18}$).</p>

### 출력

<p>Output <code>-1</code> if there is no such array. Otherwise, output the lexicographically smallest array of size $n$ which satisfies the constraints.</p>