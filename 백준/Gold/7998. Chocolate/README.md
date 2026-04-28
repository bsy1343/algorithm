# [Gold I] Chocolate - 7998

[문제 링크](https://www.acmicpc.net/problem/7998)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 127, 정답: 95, 맞힌 사람: 84, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>We are given a bar of chocolate composed of m x n square pieces. One should break the chocolate into single squares. Parts of the chocolate may be broken along the vertical and horizontal lines as indicated by the broken lines in the picture. A single break of a part of the chocolate along a chosen vertical or horizontal line divides that part into two smaller ones. Each break of a part of the chocolate is charged a cost expressed by a positive integer. This cost does not depend on the size of the part that is being broken but only depends on the line the break goes along. Let us denote the costs of breaking along consecutive vertical lines with x<sub>1</sub>,x<sub>2</sub>,&hellip;,x<sub>m-1</sub>&nbsp;and along horizontal lines with y<sub>1</sub>,y<sub>2</sub>,&hellip;,y<sub>n-1</sub>. The cost of breaking the whole bar into single squares is the sum of the successive breaks. One should compute the minimal cost of breaking the whole chocolate into single single squares.<br />
<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7998.%E2%80%85Chocolate/56f6cb1e.jpg" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/7998/cze.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:215px; width:300px" /></p>

<p>For example, if we break the chocolate presented in the picture first along the horizontal lines, and next each obtained part along vertical lines then the cost of that breaking will be y<sub>1</sub>+y<sub>2</sub>+y<sub>3</sub>+4&sdot;(x<sub>1</sub>+x<sub>2</sub>+x<sub>3</sub>+x<sub>4</sub>+x<sub>5</sub>).</p>

<p>Write a program which:</p>

<ul>
	<li>reads the numbers x<sub>1</sub>,x<sub>2</sub>,&hellip;,x<sub>m-1</sub>&nbsp;and y<sub>1</sub>,y<sub>2</sub>,&hellip;,y<sub>n-1</sub>,</li>
	<li>computes the minimal cost of breaking the whole chocolate into single squares,</li>
	<li>writes the result.</li>
</ul>

<p>&nbsp;</p>

<p>&nbsp;</p>

### 입력

<p>In the first line of the standard input there are two positive integers m and n separated by a single space, 2 &le; m,n &le; 1,000. In the successive m-1 lines there are numbers x<sub>1</sub>,x<sub>2</sub>,&hellip;,x<sub>m-1</sub>, one per line, 1 &le; x<sub>i</sub> &le; 1,000. In the successive n-1 lines there are numbers y<sub>1</sub>,y<sub>2</sub>,&hellip;,y<sub>n-1</sub>, one per line, 1 &le; y<sub>i</sub> &le; 1,000.</p>

<p>&nbsp;</p>

### 출력

<p>Your program should write to the standard output. In the first and only line your program should write one integer - the minimal cost of breaking the whole chocolate into single squares.</p>