# [Platinum I] Sprinklers 2: Return of the Alfalfa - 18871

[문제 링크](https://www.acmicpc.net/problem/18871)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 36, 맞힌 사람: 35, 정답 비율: 64.815%

### 분류

조합론, 다이나믹 프로그래밍, 수학

### 문제 설명

<p>Farmer John has a small field in the shape of an $N$ by $N$ grid ($1 \le N \le 2000$) where the $j$-th square from the left of the $i$-th row from the top is denoted by $(i,j)$ for all $1 \le i,j \le N$. He is interested in planting sweet corn and alfalfa in his field. To do so, he needs to install some special sprinklers.</p>

<p>A sweet corn sprinkler in square $(I,J)$ will sprinkle all squares to the bottom-left: i.e. $(i,j)$ with $I \le i$ and $j \le J$.</p>

<p>An alfalfa sprinkler in square $(I,J)$ will sprinkle all squares to the top-right: i.e. $(i,j)$ with $i \le I$ and $J \le j$.</p>

<p>A square sprinkled by one or multiple sweet corn sprinklers can grow sweet corn; a square sprinkled by one or multiple alfalfa sprinklers can grow alfalfa. But a square sprinkled by both types of sprinklers (or neither type) can grow nothing.</p>

<p>Help FJ determine the number of ways (modulo $10^9 + 7$) to install sprinklers in his field, at most one per square, so that every square is fertile (i.e., sprinkled by exactly one type of sprinkler).</p>

<p>Some of the squares are already occupied by woolly cows; this doesn&#39;t prevent these squares from being fertile, but no sprinklers can be installed in such squares.</p>

### 입력

<p>The first line contains a single integer $N.$</p>

<p>For each $1\le i\le N,$ the $i+1$-st line contains a string of length $N$ denoting the $i$-th row of the grid. Each character of the string is one of &#39;W&#39; (indicating a square occupied by a woolly cow), or &#39;.&#39; (unoccupied).</p>

### 출력

<p>Output the remainder when the number of ways to install sprinklers is divided by $10^9+7.$</p>