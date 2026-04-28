# [Silver V] Maximum Coins - 23922

[문제 링크](https://www.acmicpc.net/problem/23922)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 87, 정답: 60, 맞힌 사람: 54, 정답 비율: 70.130%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Mike has a square matrix with&nbsp;<b>N</b>&nbsp;rows and&nbsp;<b>N</b>&nbsp;columns. Cell (i,j) denotes the cell present at row i and column j. Cell (1,1) denotes the top left corner of the matrix. Each cell has some amount of coins associated with it and Mike can collect them only if he visits that cell.&nbsp;<b>C<sub>i,j</sub></b>&nbsp;represents the number of coins in cell with row i and column j. From a cell (i,j), Mike can decide to go to cell (i+1,j+1) or cell (i-1,j-1), as long as the cell lies within the boundaries of the matrix and has not been visited yet. He can choose to start the journey from any cell and choose to stop at any point. Mike wants to maximize the number of coins he can collect. Please help him determine the maximum number of coins he can collect.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. Each test case begins with a line containing the integer&nbsp;<b>N</b>. The next&nbsp;<b>N</b>&nbsp;lines contain&nbsp;<b>N</b>&nbsp;integers each. The j-th integer in the i-th line represents the number of coins&nbsp;<b>C<sub>i,j</sub></b>&nbsp;in cell (i,j).</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the maximum number of coins Mike can collect.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>0 &le;&nbsp;<b>C<sub>i,j</sub></b>&nbsp;&le; 10<sup>7</sup>.</li>
</ul>

### 힌트

<p>In Sample Case #1, the maximum number of coins collected can be 14, if Mike follows this path: (1,1) -&gt; (2,2) -&gt; (3,3)</p>

<p>In Sample Case #2, the maximum number of coins collected can be 9, if Mike follows this path: (2,3) -&gt; (3,4).</p>