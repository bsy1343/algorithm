# [Gold III] No Left Turns - 9168

[문제 링크](https://www.acmicpc.net/problem/9168)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 26, 맞힌 사람: 22, 정답 비율: 36.066%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색

### 문제 설명

<ul>
	<li>ALL HEADS: You&#39;re a Knight of the Round Table?&nbsp;</li>
	<li>ROBIN: I am.</li>
	<li>LEFT HEAD: In that case I shall have to kill you.&nbsp;</li>
	<li>MIDDLE HEAD: Shall I?</li>
	<li>RIGHT HEAD: Oh, I don&#39;t think so.&nbsp;</li>
	<li>MIDDLE HEAD: Well, what do I think?&nbsp;</li>
	<li>LEFT HEAD: I think kill him.</li>
	<li>RIGHT HEAD: Well let&#39;s be nice to him.&nbsp;</li>
	<li>MIDDLE HEAD: Oh shut up.</li>
</ul>

<p>As the story goes, the Knight scarpers off. Right Head has taken it upon himself to search the grounds for the knight so he, Left, and Middle can go extinguish him (and then have tea and biscuits.)</p>

<p>Consider the following 8 by 12 maze, where shaded squares are walls that can&rsquo;t be entered.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/9168/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%206.17.46.png" style="height:256px; width:380px" /></p>

<p>The shortest path between the Right Head (denoted by the S, for start) and the knight (denoted by the F, for finish) is of length 3, as illustrated above. But! Right Head can&rsquo;t turn left or make U- Turns. He can only move forward and turn right. That means the shortest path that Right Head can find is significantly longer: at 29!</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/9168/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-06-13%20%EC%98%A4%ED%9B%84%206.18.01.png" style="height:259px; width:379px" /></p>

### 입력

<p>The input file will consist of a single integer N (N &gt; 0) specifying the number of mazes in the file. Following this, on a maze by maze basis will be the number of rows, r (3 &lt; r &le; 20), a space, then the number of columns, c (3 &lt; c &le; 20). After this will follow r lines of c characters, representing a map of the maze:</p>

<pre>
XXXXXXXXXXXXXX 
X          XXX
X XFXXXXX    X 
XXX   XX  XX X 
X S          X 
XX  XXXXXX X X 
X        X X X 
X X      X X X 
XXX XX       X 
XXXXXXXXXXXXXX
</pre>

<p>X&rsquo;s mark those locations that are walls and can&rsquo;t be occupied. S marks the start location, and F marks the Knight. Blanks are locations that can be freely traveled.</p>

### 출력

<p>The output is the length of the shortest path between the start and finish locations. Based on the above maze, your program would output the minimum no-left-turns path length of 29.</p>

### 힌트

<p>Additional Constraints/Information:</p>

<ul>
	<li>Right Head is capable of moving from the start position in any of the four primary compass directions. After that, he&rsquo;s constrained to either step forward or right.</li>
	<li>The start and end locations will never be the same.</li>
	<li>The maze is always surrounded by four walls.</li>
	<li>You can assume that a path between the start and final locations always exists.</li>
</ul>