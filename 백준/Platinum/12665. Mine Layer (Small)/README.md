# [Platinum V] Mine Layer (Small) - 12665

[문제 링크](https://www.acmicpc.net/problem/12665)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 60, 정답: 37, 맞힌 사람: 28, 정답 비율: 65.116%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>MineLayer is a MineSweeper-like puzzle game played on an&nbsp;<strong>R</strong>&nbsp;by&nbsp;<strong>C</strong>&nbsp;grid. Each square in the grid either has one mine or no mines at all. A MineLayer puzzle consists of a grid of numbers, each of which indicates the total number of mines in all adjacent squares and in the square underneath. The numbers will thus range from zero to nine.&nbsp;</p>

<p>The objective of MineLayer is to figure out a layout of the mines in the grid that matches the given clues.</p>

<p>Below is a typical 3 by 4 grid. The original layout is on the left, and the puzzle on the right.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12665.%E2%80%85Mine%E2%80%85Layer%E2%80%85(Small)/44dbb402.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/12665.%E2%80%85Mine%E2%80%85Layer%E2%80%85(Small)/44dbb402.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12665/images-17.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:197px; width:403px" /></p>

<p>Since there may be many solutions, your task is to write a program that outputs the maximum possible number of mines in the middle row. The number of rows will always be odd, and there will always be at least one solution to the puzzle.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;test cases follow.</p>

<p>The first line of each case contains two space-separated numbers:&nbsp;<strong>R</strong>, the number of rows, and&nbsp;<strong>C</strong>, the number of columns.&nbsp;<strong>R</strong>&nbsp;is always an odd integer. Each of the next&nbsp;<strong>R</strong>&nbsp;lines contains&nbsp;<strong>C</strong>&nbsp;space-separated numbers that denote the clues of that row.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 50.</li>
	<li>Each puzzle is guaranteed to have at least one solution.</li>
	<li><strong>R</strong>&nbsp;= 3 or&nbsp;<strong>R</strong>&nbsp;= 5.</li>
	<li>3 &le;&nbsp;<strong>C</strong>&nbsp;&le; 5.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #X: Y&quot;, where X is the 1-based case number, and Y is the maximum possible number of mines in the middle row of a grid that satisfies the given constraints.</p>