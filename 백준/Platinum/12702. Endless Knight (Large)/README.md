# [Platinum I] Endless Knight (Large) - 12702

[문제 링크](https://www.acmicpc.net/problem/12702)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 199, 정답: 54, 맞힌 사람: 27, 정답 비율: 21.094%

### 분류

조합론, 포함 배제의 원리, 뤼카 정리, 수학, 정수론

### 문제 설명

<p>In the game of chess, there is a piece called the knight. A knight is special -- instead of moving in a straight line like other pieces, it jumps in an &quot;L&quot; shape. Specifically, a knight can jump from square (r1, c1) to (r2, c2) if and only if&nbsp;(r1 - r2)<sup>2</sup>&nbsp;+&nbsp;(c1 - c2)<sup>2</sup>&nbsp;= 5.</p>

<p>In this problem, one of our knights is going to undertake a chivalrous quest of moving from the top-left corner (the (1, 1) square) to the bottom-right corner (the (<strong>H</strong>,&nbsp;<strong>W</strong>) square) on a gigantic board. The chessboard is of height&nbsp;<strong>H</strong>&nbsp;and width&nbsp;<strong>W</strong>.</p>

<p>Here are some restrictions you need to know.</p>

<ul>
	<li>The knight is so straightforward and ardent that he is only willing to move towards the right&nbsp;<em>and</em>&nbsp;the bottom. In other words, in each step he only moves to a square with a bigger row number and a bigger column number. Note that, this might mean that there is no way to achieve his goal, for example, on a 3 by 10 board.</li>
	<li>There are&nbsp;<strong>R</strong>&nbsp;squares on the chessboard that contain rocks with evil power. Your knight may not land on any of such squares, although flying over them during a jump is allowed.</li>
</ul>

<p>Your task is to find the number of unique ways for the knight to move from the top-left corner to the bottom-right corner, under the above restrictions. It should be clear that sometimes the answer is huge. You are asked to output the remainder of the answer when divided by 10007, a prime number.</p>

### 입력

<p>Input begins with a line containing a single integer,&nbsp;<strong>N</strong>.&nbsp;&nbsp;<strong>N</strong>&nbsp;test cases follow.</p>

<p>The first line of each test case contains 3 integers,&nbsp;&nbsp;<strong>H</strong>,&nbsp;<strong>W</strong>, and&nbsp;&nbsp;<strong>R</strong>. The next&nbsp;<strong>R</strong>&nbsp;lines each contain 2 integers each,&nbsp;<strong>r</strong>&nbsp;and&nbsp;<strong>c</strong>, the row and column numbers of one rock. You may assume that (1, 1) and (<strong>H</strong>,&nbsp;<strong>W</strong>) never contain rocks and that no two rocks are at the same position.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100</li>
	<li>0 &le;&nbsp;<strong>R</strong>&nbsp;&le; 10</li>
	<li>1 &le;&nbsp;<strong>W</strong>&nbsp;&le; 10<sup>8</sup></li>
	<li>1 &le;&nbsp;<strong>H</strong>&nbsp;&le; 10<sup>8</sup></li>
	<li>1 &le;&nbsp;<strong>r</strong>&nbsp;&le; H</li>
	<li>1 &le;&nbsp;<strong>c</strong>&nbsp;&le; W</li>
</ul>

### 출력

<p>For each test case, output a single line of output, prefixed by &quot;Case #<strong>X</strong>: &quot;, where&nbsp;<strong>X</strong>&nbsp;is the 1-based case number, followed by a single integer indicating the number of ways of reaching the goal, modulo 10007.</p>