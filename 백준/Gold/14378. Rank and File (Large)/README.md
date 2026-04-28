# [Gold V] Rank and File (Large) - 14378

[문제 링크](https://www.acmicpc.net/problem/14378)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 65, 정답: 56, 맞힌 사람: 53, 정답 비율: 88.333%

### 분류

애드 혹

### 문제 설명

<p>When Sergeant Argus&#39;s army assembles for drilling, they stand in the shape of an&nbsp;N&nbsp;by&nbsp;Nsquare grid, with exactly one soldier in each cell. Each soldier has a certain height.</p>

<p>Argus believes that it is important to keep an eye on all of his soldiers at all times. Since he likes to look at the grid from the upper left, he requires that:</p>

<ul>
	<li>Within every row of the grid, the soldiers&#39; heights must be in strictly increasing order, from left to right.</li>
	<li>Within every column of the grid, the soldiers&#39; heights must be in strictly increasing order, from top to bottom.</li>
</ul>

<p>Although no two soldiers in the same row or column may have the same height, it is possible for multiple soldiers in the grid to have the same height.</p>

<p>Since soldiers sometimes train separately with their row or their column, Argus has asked you to make a report consisting of 2*N&nbsp;lists of the soldiers&#39; heights: one representing each row (in left-to-right order) and column (in top-to-bottom order). As you surveyed the soldiers, you only had small pieces of paper to write on, so you wrote each list on a separate piece of paper. However, on your way back to your office, you were startled by a loud bugle blast and you dropped all of the pieces of paper, and the wind blew one away before you could recover it! The other pieces of paper are now in no particular order, and you can&#39;t even remember which lists represent rows and which represent columns, since you didn&#39;t write that down.</p>

<p>You know that Argus will make you do hundreds of push-ups if you give him an incomplete report. Can you figure out what the missing list is?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each consists of one line with an integer&nbsp;N, followed by 2*N-1 lines of&nbsp;N&nbsp;integers each, representing the lists you have, as described in the statement. It is guaranteed that these lists represent all but one of the rows and columns from a valid grid, as described in the statement.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 50.</li>
	<li>1 &le; all heights &le; 2500.</li>
	<li>The integers on each line will be in strictly increasing order.</li>
	<li>It is guaranteed that a unique valid answer exists.</li>
	<li>2 &le;&nbsp;N&nbsp;&le; 50.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and y is a list of&nbsp;N&nbsp;integers in strictly increasing order, representing the missing list.</p>

### 힌트

<p>In the sample case, the arrangement must be either this:</p>

<p><code>1 2 3<br />
2 3 4<br />
3 5 6</code></p>

<p>or this:</p>

<p><code>1 2 3<br />
2 3 5<br />
3 4 6</code></p>

<p>In either case, the missing list is&nbsp;<code>3 4 6</code>.</p>