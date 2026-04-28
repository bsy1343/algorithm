# [Gold II] Chessboard - 8356

[문제 링크](https://www.acmicpc.net/problem/8356)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 20, 정답: 7, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

구현, 자료 구조, 정렬, 애드 혹, 많은 조건 분기, 해시를 사용한 집합과 맵

### 문제 설명

<p>On an extremely large chess board many chessmen were located<sup>1</sup>&nbsp;- all of them of the same colour. We say that a given chessman can capture specified position on the chess board, if the chessman can move to that position, particularly:</p>

<ul>
	<li>there is no chessman standing on destination position,</li>
	<li>there are no chessmen on the way from the initial position to the destination (in case of a queen, a rook and a bishop).</li>
</ul>

<p>No chessman can capture the position on which it is standing. Notice that a single position can be captured by multiple chessmen.</p>

<p>Write a program which:</p>

<ul>
	<li>reads a description of the chessboard from the standard input,</li>
	<li>for each chessman determines the number of positions being captured by that chessman,</li>
	<li>writes the result to the standard output.</li>
</ul>

<p><sup>1</sup>You can read more about chess and chessmen here:&nbsp;<a href="http://en.wikipedia.org/wiki/Chess_piece">http://en.wikipedia.org/wiki/Chess_piece</a>.</p>

### 입력

<p>In the first line of the input there are two integers <em>n</em>&nbsp;and <em>m</em>&nbsp;(1 &le; <em>n</em> &le; 200 000, 1 &le; <em>m</em> &le; 10<sup>9</sup>), separated with a single space and representing the number of chessmen located on the square chessboard and its dimension <em>m</em>. Each of the <em>n</em>&nbsp;following lines is of the format &quot;<em>F</em> <em>x</em> <em>y</em>&quot;, where <em>F</em>&nbsp;is a letter representing:</p>

<ul>
	<li><code>G</code>&nbsp;- bishop,</li>
	<li><code>H</code>&nbsp;- queen,</li>
	<li><code>K</code>&nbsp;- king,</li>
	<li><code>S</code>&nbsp;- knight,</li>
	<li><code>W</code>&nbsp;- rook,</li>
</ul>

<p>and (<em>x</em>, <em>y</em>)&nbsp;is a location of the chessman (1 &le; <em>x</em>, <em>y</em> &le; <em>m</em>). No two chessmen are located in the same position.</p>

### 출력

<p>The output should consist of <em>n</em>&nbsp;lines. <em>i</em>&#39;th line should contain one integer, representing the number of positions being captured by&nbsp;<em>i</em>&#39;th chessman from the input.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8356.%E2%80%85Chessboard/a8f585a0.png" data-original-src="https://upload.acmicpc.net/39dc50fd-a932-402b-aa02-c20e4aeec0ee/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;">The image above represents the chessboard from the sample input. Lines of different style represent positions being captured by chessmen. The possible destinations of the knight are represented by big dots.</p>