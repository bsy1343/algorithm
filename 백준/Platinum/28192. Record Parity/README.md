# [Platinum III] Record Parity - 28192

[문제 링크](https://www.acmicpc.net/problem/28192)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

조합론, 자료 구조, 수학, 스택

### 문제 설명

<p>You are given a permutation of length $n$ and an integer $k$.</p>

<p>An element is called a record if it is strictly greater than all the elements before it.</p>

<p>Calculate the sum of $(-1)^{\mathit{len}}$ over all subsequences that have exactly $k$ records. Here $\mathit{len}$ is the number of elements in the subsequence. Since the answer can be large, calculate it modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains two integers $n$ and $k$ ($1 \le k \le n \le 10^6$).</p>

<p>The second line contains the permutation $p_1, p_2, \ldots, p_n$.</p>

### 출력

<p>I&#39;ll let you guess this one.</p>

### 힌트

<p>In the second sample all of subsequences of length 3 have exactly 3 records, and none other subsequences have exactly 3 records, so the sum is equal to $(-1)^3 \binom{7}{3} = -35$, which is $998\,244\,318$ modulo $998\,244\,353$.</p>

<p>In the third sample none of the subsequences have exactly 5 records, and the sum of empty set is 0.</p>