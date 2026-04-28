# [Silver II] So I’ll Max Out My Constructive Algorithm Skills - 31688

[문제 링크](https://www.acmicpc.net/problem/31688)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 44, 맞힌 사람: 40, 정답 비율: 61.538%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>BaoBao the Witch is stuck in a maze with $n$ rows and $n$ columns, where the height of the cell in the $i$-th row and the $j$-th column is $h_{i,j}$. To get out of the maze, BaoBao has to find a path which passes through each cell exactly once. Each time she can only move into the neighboring cell sharing a same edge with the current one. But as we know, BaoBao is super lazy, so every time when she climbs up (that is to say, moving from a cell with a smaller height to another with a larger height) her happiness value will decrease. As her helping hand, your task is to find a valid path so that when moving along the path, the number of times BaoBao climbs up will not be more than the number of times she climbs down.</p>

<p>More formally, you need to find a sequence $(x_1, y_1),(x_2, y_2), \cdots ,(x_{n^2}, y_{n^2})$ such that:</p>

<ul>
	<li>For all $1 &le; i &le; n^2$, $1 &le; x_i , y_i &le; n$;</li>
	<li>For all $1 &le; i, j &le; n^2$, $i \ne j$, $(x_i , y_i) \ne (x_j , y_j )$;</li>
	<li>For all $2 &le; i &le; n^2$, $|x_i - x_{i-1}| + |y_i - y_{i-1}| = 1$;</li>
	<li>$\displaystyle\sum_{i=2}^{n^2}{[h_{x_{i-1},y_{i-1}} &lt; h_{x_i, y_i}]} \le \displaystyle\sum_{i=2}^{n^2}{[h_{x_{i-1},y_{i-1}} &gt; h_{x_i, y_i}]}$, where $[P]$ equals $1$ when $P$ is true, and equals $0$ when it is false.</li>
</ul>

<p>Additionally, you discover that the heights in all cells are a permutation of $n^2$, so you just need to output the height of each cell in a valid path.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains an integer $T$ ($1 &le; T &le; 100$) indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($2 &le; n &le; 64$) indicating the size of the maze.</p>

<p>For the following $n$ lines, the $i$-th line contains $n$ integers $h_{i,1}, h_{i,2}, \cdots , h_{i,n}$ ($1 &le; h_{i,j} &le; n^2$) where $h_{i,j}$ indicates the height of the cell in the $i$-th row and the $j$-th column. It&rsquo;s guaranteed that all integers in the input make up a permutation of $n^2$.</p>

### 출력

<p>For each test case output one line containing $n^2$ separated by a space indicating the heights of each cell in a valid path. If there are multiple valid answers you can output any of them. It&rsquo;s easy to prove that an answer always exists.</p>