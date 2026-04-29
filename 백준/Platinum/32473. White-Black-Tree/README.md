# [Platinum I] White-Black-Tree - 32473

[문제 링크](https://www.acmicpc.net/problem/32473)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 123, 정답: 40, 맞힌 사람: 24, 정답 비율: 32.000%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍, 트리에서의 전방향 다이나믹 프로그래밍

### 문제 설명

<p>There is a tree with $N$ vertices. Vertices are numbered from $1$ to $N$.</p>

<p>Each vertex is colored either white or black. You can swap the colors of two adjacent vertices any number of times you want. A <strong>final tree</strong> is any tree formed by completing a finite number of swaps in the original tree. The <strong>swap cost</strong> of a final tree is equal to the number of swaps you have made.</p>

<p>A white tree is the connected subgraph of the final tree which connects all the white vertices of the final tree using the minimum number of edges. Likewise, a black tree is the connected subgraph of the final tree which connects all the black vertices of the final tree using the minimum number of edges.</p>

<p>The <strong>edge cost</strong> of a final tree is equal to the sum of the number of edges in the white tree and the number of edges in the black tree. Note that the edge cost is calculated only after all swaps have been completed.</p>

<p>The total cost of a final tree is the sum of its swap cost and edge cost.</p>

<p>Find the minimum possible total cost of a final tree.</p>

### 입력

<p>The first line of input contains the number of vertices $N$.</p>

<p>The second line of input contains a string $s$ of length $N$ consisting only of <code>W</code> and <code>B</code>. If the $i$-th character of $s$ is <code>W</code>, vertex $i$ is white, and if the $i$-th character is <code>B</code>, vertex $i$ is black. It is guaranteed that there are at least one <code>W</code> and at least one <code>B</code> in the string $s$.</p>

<p>Each of the following $N-1$ lines contains $u$ and $v$ denoting that there is an edge connecting vertex $u$ and vertex $v$.</p>

<p>It is guaranteed that the input forms a valid tree.</p>

### 출력

<p>The first line of output should contain the minimum possible total cost of a final tree.</p>

### 제한

<ul>
	<li>$2\le N\le 5\times 10^5$</li>
	<li>$1\le u&lt;v\le N$</li>
</ul>