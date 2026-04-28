# [Platinum II] Field Day - 28032

[문제 링크](https://www.acmicpc.net/problem/28032)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 233, 정답: 133, 맞힌 사람: 112, 정답 비율: 64.000%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 비트마스킹

### 문제 설명

<p>Each of Farmer John&#39;s $N$ barns ($2\le N\le 10^5$) has selected a team of $C$ cows ($1\le C\le 18$) to participate in field day. The breed of every cow is either a Guernsey or a Holstein.</p>

<p>The difference between two teams is defined to be the number of positions $i$ ($1 \leq i \leq C$) at which the breeds of the cows in the $i$th positions differ. For every team $t$ from $1 \ldots N$, please compute the maximum difference between team $t$ and any other team.</p>

### 입력

<p>The first line contains $C$ and $N$.</p>

<p>The next $N$ lines each contain a string of length $C$ of Gs and Hs. Each line corresponds to a team.</p>

### 출력

<p>For each team, print the maximum difference.</p>

### 힌트

<p>The first and third teams differ by $5$. The second and third teams differ by $3$.</p>