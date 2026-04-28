# [Gold IV] Googlander (Large) - 12181

[문제 링크](https://www.acmicpc.net/problem/12181)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 137, 정답: 81, 맞힌 사람: 66, 정답 비율: 61.682%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Eric Googlander is a fashion model who performs by walking around on a stage made of squares that form a grid with&nbsp;<strong>R</strong>&nbsp;rows and&nbsp;<strong>C</strong>&nbsp;columns. He begins at the leftmost bottom square, facing toward the top edge of the stage, and he will perform by making a series of moves. Googlander knows only the following two moves:<br />
<br />
1. Take one step forward in the direction he is currently facing<br />
<br />
2. Make a single 90 degree turn to the right, then take one step forward in the new direction he is facing following the turn<br />
<br />
(Note that Googlander does not know how to make a 90 degree&nbsp;<em>left</em>&nbsp;turn.)<br />
<br />
If a move would take Googlander off of the stage or onto a square he has already visited, that move is&nbsp;<em>unfashionable</em>. Whenever Googlander is in a position for which neither of the two possible moves is unfashionable, he is free to choose either move (independently of any other choices he has made in the past), but he must choose one of them. Whenever one of the possible moves he can make is unfashionable, he must make the other move. If at any point both of the possible moves are unfashionable, the show immediately ends without Googlander making another move. Note that Googlander cannot stop the show early -- he must keep moving until both possible moves become unfashionable.<br />
<br />
How many different paths is it possible for Googlander to walk? (Two paths are the same if and only if they visit the same squares in the same order.)</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;lines follow; each consists of two space-separated integers&nbsp;<strong>R</strong>&nbsp;and&nbsp;<strong>C</strong>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>R, C</strong>&nbsp;&le; 25.</li>
	<li>The limits ensure that the answer will always fit in a 64-bit signed integer.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the number of different paths that Googlander can walk.</p>

### 힌트

<p>In Case #1, Googlander cannot make any moves. The only possible path is the trivial one consisting of the only square.<br />
<br />
In Case #2, Googlander cannot take a step straight ahead, because it would take him off the stage, but he can turn right and then take a step. Once he has done so, he cannot turn right and then take a step, but he can take a step straight ahead. At that point, there are no more moves he can make and the show is over. This is the only possible path he can take.<br />
<br />
In Case #3, these are the possible paths:<br />
<img alt="" src="%EB%B0%B1%EC%A4%80/Gold/12181.%E2%80%85Googlander%E2%80%85(Large)/8d166522.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/12181.%E2%80%85Googlander%E2%80%85(Large)/8d166522.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12180/images-73.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:292px; width:445px" /></p>