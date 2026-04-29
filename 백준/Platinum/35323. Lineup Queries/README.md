# [Platinum V] Lineup Queries - 35323

[문제 링크](https://www.acmicpc.net/problem/35323)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 32, 정답: 24, 맞힌 사람: 24, 정답 비율: 75.000%

### 분류

많은 조건 분기, 수학, 애드 혹

### 문제 설명

<p>There is a line of cows, initially (i.e. at time $t = 0$) containing only cow $0$ at position $0$ (here, a cow is at position $k$ if there are $k$ cows in front of it). At time $t$ for $t=1,2,3,\dots$, the cow at position 0 moves to position $\lfloor t/2\rfloor$, every cow in positions $1\dots \lfloor t/2\rfloor$ moves forward one position, and cow $t$ joins the line at the end of the line (position $t$).</p>

<p>Answer $Q$ ($1\le Q\le 10^5$) independent queries, each of one of the following types:</p>

<ol>
<li>At what position is cow $c$ immediately after time $t$ ($0\le c\le t\le 10^{18}$)?</li>
<li>Which cow is at position $x$ immediately after time $t$ ($0\le x\le t\le 10^{18}$)?</li>
</ol>

### 입력

<p>The first line contains $Q$, the number of queries.</p>

<p>The next $Q$ lines each contain three integers specifying a query either of the form "1 c t" or "2 x t."</p>

### 출력

<p>Output the answer to each query on a separate line.</p>