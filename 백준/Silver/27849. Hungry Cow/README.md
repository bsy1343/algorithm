# [Silver III] Hungry Cow - 27849

[문제 링크](https://www.acmicpc.net/problem/27849)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 1222, 정답: 381, 맞힌 사람: 303, 정답 비율: 34.122%

### 분류

그리디 알고리즘

### 문제 설명

<p>Bessie is a hungry cow. Each day, for dinner, if there is a haybale in the barn, she will eat one haybale. Farmer John does not want Bessie to starve, so some days he sends a delivery of haybales, which arrive in the morning (before dinner). In particular, on day $d_i$, Farmer John sends a delivery of $b_i$ haybales ($1\leq d_i \leq 10^{14}$, $1 \leq b_i \leq 10^9$).</p>

<p>Compute the total number of haybales Bessie will eat during the first $T$ days.</p>

### 입력

<p>The first line contains $N$ and $T$ ($1 \le N \le 10^5$, $1 \le T \le 10^{14}$).</p>

<p>The next $N$ lines each contain $d_i$ and $b_i$. It is additionally guaranteed that $1\le d_1&lt;d_2&lt;\dots &lt; d_N\le T$.</p>

### 출력

<p>Output the number of haybales that Bessie will eat during the first $T$ days.</p>

<p><strong>Note that the large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a &quot;long long&quot; in C/C++).</strong></p>