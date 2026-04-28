# [Gold I] Comfortable Cows - 21232

[문제 링크](https://www.acmicpc.net/problem/21232)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 551, 정답: 166, 맞힌 사람: 123, 정답 비율: 28.472%

### 분류

구현, 그래프 이론, 자료 구조, 그래프 탐색, 시뮬레이션, 너비 우선 탐색, 격자 그래프, 큐

### 문제 설명

<p>Farmer Nhoj&#39;s pasture can be regarded as a large 2D grid of square &quot;cells&quot; (picture a huge chessboard). Initially, the pasture is empty.</p>

<p>Farmer Nhoj will add $N$ ($1\le N\le 10^5$) cows to the pasture one by one. The $i$th cow will occupy a cell $(x_i,y_i)$ that is distinct from the cells occupied by all other cows ($0\le x_i,y_i\le 1000$).</p>

<p>A cow is said to be &quot;comfortable&quot; if it is horizontally or vertically adjacent to exactly three other cows. Unfortunately, cows that are too comfortable tend to lag in their milk production, so Farmer Nhoj wants to add additional cows until no cow (including the ones that he adds) is comfortable. Note that the added cows do not necessarily need to have $x$ and $y$ coordinates in the range $0 \ldots 1000$.</p>

<p>For each $i$ in the range $1 \ldots N$, please output the minimum number of cows Farmer Nhoj would need to add until no cows are comfortable if initially, the pasture started with only cows $1\ldots i$.</p>

### 입력

<p>The first line contains a single integer $N$. Each of the next $N$ lines contains two space-separated integers, indicating the $(x,y)$ coordinates of a cow&#39;s cell.</p>

### 출력

<p>The minimum number of cows Farmer Nhoj needs to add for each $i$ in $1 \ldots N$, on $N$ separate lines.</p>