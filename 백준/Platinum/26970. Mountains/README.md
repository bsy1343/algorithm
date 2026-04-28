# [Platinum II] Mountains - 26970

[문제 링크](https://www.acmicpc.net/problem/26970)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 178, 정답: 102, 맞힌 사람: 70, 정답 비율: 57.377%

### 분류

자료 구조, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

There are $N$ ($1 \leq N \leq 2000$) evenly spaced mountains in a row on the edge of 
Farmer  John's farm.  These can be expressed as an array of heights
$h_1,h_2,\dots,h_N$. For a mountain $i$, you can see another mountain $j$ if
there are no mountains strictly higher than the line of sight connecting the
tops of mountain $j$ and $i$. Formally, for two mountains $i &lt; j$, they can see
each other if there is no $k$ such that $i &lt; k &lt; j$ and $(k, h_k)$ is above the
line segment connecting $(i, h_i)$ and $(j, h_j)$. There are $Q$
($1 \leq Q \leq 2000$) updates where the height of one mountain increases. Find
the total number of unordered pairs of mountains that see each other after each
update.

### 입력

<p>Line $1$ contains $N$.</p>

<p>Line $2$ contains $N$ heights $h_1,h_2,\dots,h_N$ (for each $i$, $0 \leq h_i \leq 10^9$).</p>

<p>Line $3$ contains $Q$.</p>

<p>Lines $4$ to $3+Q$ contain $x$, $y$ ($1 \leq x \leq N$, $1 \leq y$) where $x$ is the index of the mountain and $y$ is the amount the height increases by. It is guaranteed that the new height of the mountain is at most $10^9$.</p>

### 출력

$Q$ lines, with the total number of unordered pairs of mountains that see each
other after each update.

### 힌트

<p>Initially, the following pairs of mountains can see each other: $(1, 2)$, $(2, 3)$, $(2, 5)$, $(3, 4)$, $(3, 5)$, $(4, 5)$, a total of $6$.</p>

<p>After the first update, mountain $4$ has a height of $4$, which doesn&#39;t block any visibility but does make it so that $4$ can now see $2$, making the new answer $7$.</p>

<p>After the second update, mountain $1$ has a height of $5$, which doesn&#39;t block any visibility but does make it so that $1$ can now see $3$, $4$, and $5$, making the new answer $10$.</p>

<p>After the third update, mountain $3$ has a height of $5$, which blocks mountain $1$ from seeing mountain $4$, blocks mountain $2$ from seeing mountains $4$ and $5$, and doesn&#39;t allow itself to see any more mountains since it can already see all of them, making the new answer $7$.</p>