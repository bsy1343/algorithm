# [Gold III] Color Inversion on a Huge Chessboard - 30933

[문제 링크](https://www.acmicpc.net/problem/30933)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 132, 정답: 90, 맞힌 사람: 87, 정답 비율: 70.732%

### 분류

애드 혹

### 문제 설명

<p>You are given a set of square cells arranged in a chessboard-like pattern with $n$ horizontal rows and $n$ vertical columns. Rows are numbered $1$ through $n$ from top to bottom, and columns are also numbered $1$ through $n$ from left to right.</p>

<p>Initially, the cells are colored as in a chessboard, that is, the cell in the row $i$ and the column $j$ is colored black if $i + j$ is odd and is colored white if it is even.</p>

<p>Color-inversion operations, each of which is one of the following two, are made one after another.</p>

<p><strong>Invert colors of a row</strong>: Given a row number, invert colors of all the cells in the specified row. The white cells in the row become black and the black ones become white.</p>

<p><strong>Invert colors of a column</strong>: Given a column number, invert colors of all the cells in the specified column. The white cells in the column become black and the black ones become white.</p>

<p>The number of distinct <em>areas</em> after each of the operations should be counted. Here, an area means a group of directly or indirectly connected cells of the same color. Two cells are said to be directly connected when they share an edge.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<blockquote>
<p>$n$ $q$</p>

<p>$operation_1$</p>

<p>$\vdots$</p>

<p>$operation_q$</p>
</blockquote>

<p>The integer $n$ is the number of rows and columns ($1 &le; n &le; 5 \times 10^5$). The integer $q$ is the number of operations ($1 &le; q &le; 5 \times 10^5$). The following $q$ lines represent operations to be made in this order. Each of them is given in either of the following forms.</p>

<ul>
	<li><code>ROW</code> $i$: the operation &ldquo;invert colors of a row&rdquo; applied to the row $i$ ($1 &le; i &le; n$).</li>
	<li><code>COLUMN</code> $j$ : the operation &ldquo;invert colors of a column&rdquo; applied to the column $j$ ($1 &le; j &le; n$).</li>
</ul>

### 출력

<p>Output $q$ lines. The $k$-th line should contain an integer denoting the number of areas after the $k$-th operation is made.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/30933.%E2%80%85Color%E2%80%85Inversion%E2%80%85on%E2%80%85a%E2%80%85Huge%E2%80%85Chessboard/375399e5.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/30933.%E2%80%85Color%E2%80%85Inversion%E2%80%85on%E2%80%85a%E2%80%85Huge%E2%80%85Chessboard/375399e5.png" data-original-src="https://upload.acmicpc.net/e1d13c52-a8a5-48bf-aa9e-a8d082c1b77d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 501px; height: 150px;" /></p>

<p style="text-align: center;">Figure F.1. Illustration of Sample Input 1</p>