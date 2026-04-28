# [Silver I] Strange sum - 30670

[문제 링크](https://www.acmicpc.net/problem/30670)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 29, 정답: 21, 맞힌 사람: 19, 정답 비율: 73.077%

### 분류

자료 구조, 정렬, 집합과 맵, 누적 합, 해시를 사용한 집합과 맵, 스위핑, 트리를 사용한 집합과 맵, 값 / 좌표 압축

### 문제 설명

<p>Egor has table of size $n \times m$, where all lines are numbered from $1$ to $n$ and all columns are numbered from $1$ to $m$. Each cell is painted in some color that can be presented as integer from $1$ to $10^9$.</p>

<p>Let us call the cell that lies in $r$-th row and $c$-th column as $(r, c)$. We define the <em>manhattan distance</em> between two cells $(r_1, c_1)$ and $(r_2, c_2)$ as the length of shortest path between them where each consecutive cells have common side. The path can go through cells of any color. For example, the manhattan distance between $(1, 2)$ and $(3, 3)$ is 3, one of the shortest paths is the following: $(1, 2) \to (2, 2) \to (2, 3) \to (3, 3)$.</p>

<p>Egor decided to calculate the sum of manhattan distances between each pair of cells of same color. Help him to calculate this sum.</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 \leq n \le m$, $n \cdot m \leq 500\,000$) --- number of rows and columns in the table.</p>

<p>Each of next $n$ lines describes the rows of the table. $i$-th line contains $m$ integers $c_{i1}, c_{i2}, \ldots, c_{im}$ ($1 \le c_{ij} \le 10^9$) --- colors of cells in $i$-th row.</p>

### 출력

<p>Print one integer --- the the sum of manhattan distances between each pair of cells of same color.</p>

### 힌트

<p>In the first sample there are three pairs of cells of same color: in coordinates $(1, 1)$ and $(2, 3)$, in coordinates $(1, 2)$ and $(2, 2)$, in coordinates $(1, 3)$ and $(2, 1)$. The manhattan distances between them are $3$, $1$ and $3$, the sum is $7$.</p>