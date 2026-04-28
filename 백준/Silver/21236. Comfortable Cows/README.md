# [Silver III] Comfortable Cows - 21236

[문제 링크](https://www.acmicpc.net/problem/21236)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 1093, 정답: 328, 맞힌 사람: 254, 정답 비율: 32.690%

### 분류

구현, 집합과 맵

### 문제 설명

<p>Farmer John&#39;s pasture can be regarded as a large 2D grid of square &quot;cells&quot; (picture a huge chessboard). Initially, the pasture is empty.</p>

<p>Farmer John will add $N$ ($1\le N\le 10^5$) cows to the pasture one by one. The $i$th cow will occupy a cell $(x_i,y_i)$ that is distinct from the cells occupied by all other cows ($0\le x_i,y_i\le 1000$).</p>

<p>A cow is said to be &quot;comfortable&quot; if it is horizontally or vertically adjacent to exactly three other cows. Farmer John is interested in counting the comfortable cows on his farm. For each $i$ in the range $1 \ldots N$, output the total number of comfortable cows after the $i$th cow is added to the pasture.</p>

### 입력

<p>The first line contains a single integer $N$. Each of the next $N$ lines contains two space-separated integers, indicating the $(x,y)$ coordinates of a cow&#39;s cell. It is guaranteed that all these cells are distinct.</p>

### 출력

<p>The $i$th line of output should contain the total number of comfortable cows after the first $i$ cows are added to the pasture.</p>