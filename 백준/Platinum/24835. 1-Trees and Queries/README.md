# [Platinum IV] 1-Trees and Queries - 24835

[문제 링크](https://www.acmicpc.net/problem/24835)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 75, 정답: 55, 맞힌 사람: 44, 정답 비율: 72.131%

### 분류

트리, 최소 공통 조상

### 문제 설명

<p>Gildong was hiking a mountain, walking by millions of trees. Inspired by them, he suddenly came up with an interesting idea for trees in data structures: <em>What if we add another edge in a tree?</em></p>

<p>Then he found that such tree-like graphs are called <em>1-trees</em>. Since Gildong was bored of solving too many tree problems, he wanted to see if similar techniques in trees can be used in 1-trees as well. Instead of solving it by himself, he&#39;s going to test you by providing queries on 1-trees.</p>

<p>First, he&#39;ll provide you a tree (not 1-tree) with $n$ vertices, then he will ask you $q$ queries. Each query contains $5$ integers: $x$, $y$, $a$, $b$, and $k$. This means you&#39;re asked to determine if there exists a path from vertex $a$ to $b$ that contains exactly $k$ edges after adding a bidirectional edge between vertices $x$ and $y$. <strong>A path can contain the same vertices and same edges multiple times</strong>. All queries are independent of each other; i.e. the added edge in a query is removed in the next query.</p>

### 입력

<p>The first line contains an integer $n$ ($3 \le n \le 10^5$), the number of vertices of the tree.</p>

<p>Next $n-1$ lines contain two integers $u$ and $v$ ($1 \le u,v \le n$, $u \ne v$) each, which means there is an edge between vertex $u$ and $v$. All edges are bidirectional and distinct.</p>

<p>Next line contains an integer $q$ ($1 \le q \le 10^5$), the number of queries Gildong wants to ask.</p>

<p>Next $q$ lines contain five integers $x$, $y$, $a$, $b$, and $k$ each ($1 \le x,y,a,b \le n$, $x \ne y$, $1 \le k \le 10^9$) &ndash;&nbsp;the integers explained in the description. It is guaranteed that the edge between $x$ and $y$ does not exist in the original tree.</p>

### 출력

<p>For each query, print &quot;YES&quot;&nbsp;if there exists a path that contains exactly $k$ edges from vertex $a$ to $b$ after adding an edge between vertices $x$ and $y$. Otherwise, print &quot;NO&quot;.</p>

<p>You can print each letter in any case (upper or lower).</p>

### 힌트

<p>The image below describes the tree (circles and solid lines) and the added edges for each query (dotted lines).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24835.%E2%80%851-Trees%E2%80%85and%E2%80%85Queries/df3b57be.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24835.%E2%80%851-Trees%E2%80%85and%E2%80%85Queries/df3b57be.png" data-original-src="https://upload.acmicpc.net/00f253c4-6a8e-4464-9266-c27d4f0bd65c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 336px; width: 782px;" /></p>

<p>Possible paths for the queries with &quot;YES&quot;&nbsp;answers are:</p>

<ul>
	<li>$1$-st query: $1$ &ndash;&nbsp;$3$ &ndash;&nbsp;$2$</li>
	<li>$2$-nd query: $1$ &ndash;&nbsp;$2$ &ndash;&nbsp;$3$</li>
	<li>$4$-th query: $3$ &ndash;&nbsp;$4$ &ndash;&nbsp;$2$ &ndash;&nbsp;$3$ &ndash;&nbsp;$4$ &ndash;&nbsp;$2$ &ndash;&nbsp;$3$ &ndash;&nbsp;$4$ &ndash;&nbsp;$2$ &ndash;&nbsp;$3$</li>
</ul>