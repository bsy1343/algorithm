# [Platinum IV] Step Traversing a Tree - 8121

[문제 링크](https://www.acmicpc.net/problem/8121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 42, 맞힌 사람: 38, 정답 비율: 62.295%

### 분류

해 구성하기, 깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>A graph is a pair (V, E), where V&nbsp;is a finite set of elements called vertices of the graph, and E&nbsp;is a subset of the set of all unordered pairs of distinct vertices. The elements of the set E&nbsp;are called edges of the graph. If for each pair of distinct vertices u, v&nbsp;there exists exactly one sequence of distinct vertices w<sub>0</sub>, w<sub>1</sub>, ..., w<sub>k</sub>, such that w<sub>0</sub> = u, w<sub>k</sub> = v&nbsp;and the pairs {w<sub>i</sub>, w<sub>i+1</sub>}&nbsp;&isin;&nbsp;E&nbsp;for i = 0, ..., k-1, then the graph is called a tree. We say that the distance between the vertices u&nbsp;and v&nbsp;in the tree is k.</p>

<p>It is known that a tree of n&nbsp;vertices has exactly n - 1&nbsp;edges. A tree T&nbsp;whose vertices are numbered from 1&nbsp;to n&nbsp;can be unambiguously described by giving the number of its vertices n, and an appropriate sequence of n - 1&nbsp;pairs of positive integers describing its edges.</p>

<p>Any permutation of vertices - i.e. a sequence in which each vertex appears exactly once - is called a traversing order of a tree. If the distance of each two consecutive vertices in some order of the tree T&nbsp;is at most c, then we say that it is a traversing order of the tree with step c.</p>

<p>It is known that for each tree its traversing order with step 3&nbsp;can be found.</p>

<p>The picture shows a tree of 7 vertices. The vertices are represented by black dots, and edges by line segments joining the dots.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/8121.%E2%80%85Step%E2%80%85Traversing%E2%80%85a%E2%80%85Tree/bf4d57da.gif" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/8121.%E2%80%85Step%E2%80%85Traversing%E2%80%85a%E2%80%85Tree/bf4d57da.gif" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/8121/1.gif" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 421px; height: 157px;" /></p>

<p>This tree can be traversed with step 3 by visiting its vertices in the following order: 7 2 3 5 6 4 1.</p>

<p>Write a program that:</p>

<ul>
	<li>reads a description of a tree from the standard input.</li>
	<li>finds an arbitrary traversing order of that tree with step 3,</li>
	<li>writes that order in the standard output.</li>
</ul>

### 입력

<ul>
	<li>In the first line of the standard input there is a positive integer n, not greater than 5,000&nbsp;- it is the number of vertices of the tree.</li>
	<li>In each of the following n - 1&nbsp;lines there is one pair of positive integers separated by a single space and representing one edge of the tree.</li>
</ul>

### 출력

<p>In the successive lines of the standard output one should write the numbers of the successive vertices in a traversing order of the tree with step 3 - each number should be written in a separate line.</p>