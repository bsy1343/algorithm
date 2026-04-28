# [Platinum I] Up Down Subsequence - 24973

[문제 링크](https://www.acmicpc.net/problem/24973)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 133, 정답: 75, 맞힌 사람: 68, 정답 비율: 64.151%

### 분류

다이나믹 프로그래밍, 자료 구조, 세그먼트 트리, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Farmer John&#39;s $N$ cows ($2 \leq N \leq 3\cdot 10^5$), conveniently numbered $1 \ldots N$ as usual, have ordered themselves according to a permutation $p_1,p_2,\ldots,p_N$ of $1\ldots N$. You are also given a string of length $N-1$ consisting of the letters U and D. Please find the maximum $K\le N-1$ such that there exists a subsequence $a_0,a_1,\ldots,a_{K}$ of $p$ such that for all $1\le j\le K$, $a_{j - 1} &lt; a_j$ if the $j$th letter in the string is U, and $a_{j - 1} &gt; a_j$ if the $j$th letter in the string is D.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The second line contains $p_1,p_2,\ldots,p_N$.</p>

<p>The last line contains the string.</p>

### 출력

<p>Write out maximum possible value of $K$.</p>