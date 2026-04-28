# [Gold III] Superknight - 29913

[문제 링크](https://www.acmicpc.net/problem/29913)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 15, 맞힌 사람: 12, 정답 비율: 37.500%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 격자 그래프, 역추적

### 문제 설명

<p>A superknight is located on some square of a chessboard and wants to move to another square, and do so in the least possible number of moves. It is hindered by the fact that some squares are blocked and the knight is not allowed to visit them on its path.</p>

<p>A regular knight can move either by two rows and one column or by two columns and one row in each move (the leftmost figure). A knight can jump over blocked squares, only landing on them is forbidden (the middle figure).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/29913.%E2%80%85Superknight/37659db3.png" data-original-src="https://upload.acmicpc.net/5cfedd8b-70d6-4bfc-acda-0cd2086e0e8b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 478px; height: 143px;" /></p>

<p>A superknight differs from a regular one by its ability to perform a <em>supermove</em> on its path (but <em>at most once</em>), in which it moves either by three rows and one column or by three columns and one row (the rightmost figure).</p>

<p>Write a program to find the path of a superknight from a given starting square to a given destination square with the least possible number of moves.</p>

### 입력

<p>The first line of input contains $R$, the number of rows, and $V$, the number of columns of the board ($3 \le R \le 100$, $3 \le V \le 100$). Each of the following $R$ lines contains exactly $V$ characters, where &#39;<code>@</code>&#39; denotes the starting square of the knight, &#39;<code>*</code>&#39; the destination square, &#39;<code>.</code>&#39; a free square, and &#39;<code>#</code>&#39; a blocked square.</p>

### 출력

<p>The first line of output should contain $K$, the minimal number of moves needed to reach the destination square. Each of the following $K + 1$ lines should contain two integers $r_i$ and $v_i$: the row and column numbers of the squares that the knight visits on its path, in the order they are visited. The rows of the board are numbered $1 \ldots R$ from top to bottom and the columns $1 \ldots V$ from left to right. You may assume that the knight can reach the destination square in all test cases. If there are several paths with the minimal number of moves, output any one of them.</p>