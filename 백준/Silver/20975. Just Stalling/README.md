# [Silver I] Just Stalling - 20975

[문제 링크](https://www.acmicpc.net/problem/20975)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 738, 정답: 427, 맞힌 사람: 387, 정답 비율: 59.815%

### 분류

조합론, 그리디 알고리즘, 수학, 정렬

### 문제 설명

<p>Farmer John has $N$ cows ($1\le N \leq 20$) of heights $a_1 \ldots a_N$. His barn has $N$ stalls with max height limits $b_1 \ldots b_N$ (so for example, if $b_5 = 17$, then a cow of height at most $17$ can reside in stall $5$). In how many distinct ways can Farmer John arrange his cows so that each cow is in a different stall, and so that the height limit is satisfied for every stall?</p>

### 입력

<p>The first line contains $N$. The second line contains $N$ space-separated integers $a_1,a_2,\ldots,a_N$. The third line contains $N$ space-separated integers $b_1,b_2,\ldots,b_N$. All heights and limits are in the range $[1,10^9]$.</p>

### 출력

<p>The number of ways Farmer John can place each cow into a different stall such that the height limit is satisfied for every stall. Note that the large size of the output might require the use of a 64-bit integer, like a &quot;long long&quot; in C++.</p>