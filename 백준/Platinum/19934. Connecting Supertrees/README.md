# [Platinum II] Connecting Supertrees - 19934

[문제 링크](https://www.acmicpc.net/problem/19934)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 312, 정답: 114, 맞힌 사람: 106, 정답 비율: 39.114%

### 분류

자료 구조, 그래프 이론, 해 구성하기, 많은 조건 분기, 분리 집합

### 문제 설명

<p>Gardens by the Bay is a large nature park in Singapore. In the park there are $n$ towers, known as supertrees. These towers are labelled $0$ to $n-1$. We would like to construct a set of&nbsp;<strong>zero or more</strong>&nbsp;bridges. Each bridge connects a pair of distinct towers and may be traversed in&nbsp;<strong>either</strong>&nbsp;direction. No two bridges should connect the same pair of towers.</p>

<p>A path from tower $x$ to tower $y$ is a sequence of one or more towers such that:</p>

<ul>
	<li>the first element of the sequence is $x$,</li>
	<li>the last element of the sequence is $y$,</li>
	<li>all elements of the sequence are&nbsp;<strong>distinct</strong>, and</li>
	<li>each two consecutive elements (towers) in the sequence are connected by a bridge.</li>
</ul>

<p>Note that by definition there is exactly one path from a tower to itself and the number of different paths from tower $i$ to tower $j$ is the same as the number of different paths from tower $j$ to tower $i$.</p>

<p>The lead architect in charge of the design wishes for the bridges to be built such that for all $0 \leq i, j \leq n-1$ there are exactly $p[i][j]$ different paths from tower $i$ to tower $j$, where $0 \leq p[i][j] \leq 3$.</p>

<p>Construct a set of bridges that satisfy the architect&#39;s requirements, or determine that it is impossible.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$1 \leq n \leq 1000$</li>
	<li>$p[i][i] = 1$ (for all $0 \leq i \leq n-1$)</li>
	<li>$p[i][j] = p[j][i]$ (for all $0 \leq i, j \leq n-1$)</li>
	<li>$0 \leq p[i][j] \leq 3$ (for all $0 \leq i, j \leq n-1$)</li>
</ul>