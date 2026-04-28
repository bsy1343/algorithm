# [Gold III] Hall of Mirrors (Small) - 12405

[문제 링크](https://www.acmicpc.net/problem/12405)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 7, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

(분류 없음)

### 문제 설명

<p>You live in a 2-dimensional plane, and one of your favourite places to visit is the Hall of Mirrors. The Hall of Mirrors is a room (a 2-dimensional room, of course) that is laid out in a grid. Every square on the grid contains either a square mirror, empty space, or you. You have width 0 and height 0, and you are located in the exact centre of your grid square.</p>

<p>Despite being very small, you can see your reflection when it is reflected back to you exactly. For example, consider the following layout, where&nbsp;<code>&#39;#&#39;</code>&nbsp;indicates a square mirror that completely fills its square,&nbsp;<code>&#39;.&#39;</code>&nbsp;indicates empty space, and the capital letter&nbsp;<code>&#39;X&#39;</code>indicates you are in the center of that square:</p>

<pre>
######
#..X.#
#.#..#
#...##
######
</pre>

<p>If you look straight up or straight to the right, you will be able to see your reflection.</p>

<p>&nbsp;</p>

<p>Unfortunately in the Hall of Mirrors it is very foggy, so you can&#39;t see further than&nbsp;<strong>D</strong>&nbsp;units away. Suppose&nbsp;<strong>D</strong>=3. If you look up, your reflection will be 1 unit away (0.5 to the mirror, and 0.5 back). If you look right, your reflection will be 3 units away (1.5 to the mirror, and 1.5 back), and you will be able to see it. If you look down, your reflection will be 5 units away and you won&#39;t be able to see it.</p>

<p>It&#39;s important to understand how light travels in the Hall of Mirrors. Light travels in a straight line until it hits a mirror. If light hits any part of a mirror but its corner, it will be reflected in the normal way: it will bounce off with an angle of reflection equal to the angle of incidence. If, on the other hand, the light would touch the corner of a mirror, the situation is more complicated. The following diagrams explain the cases:</p>

<p>In the following cases, light approaches a corner and is reflected, changing its direction:&nbsp;<br />
<img src="https://onlinejudgeimages.s3.amazonaws.com/problem/12405/images-45.png" style="border:0px; vertical-align:middle" /><br />
In the first two cases, light approached two adjacent mirrors at the point where they met. Light was reflected in the same way as if it had hit the middle of a long mirror. In the third case, light approached the corners of three adjacent mirrors, and returned in exactly the direction it came from.</p>

<p>In the following cases, light approaches the corners of one or more mirrors, but does not bounce, and instead continues in the same direction:&nbsp;<br />
<img src="https://onlinejudgeimages.s3.amazonaws.com/problem/12405/images-46.png" style="border:0px; vertical-align:middle" /><br />
This happens when light reaches distance 0 from the corner of a mirror, but would not have to pass through the mirror in order to continue in the same direction. In this way, a ray of light can pass between two mirrors that are diagonally adjacent to each other -- effectively going through a space of size 0. Good thing it&#39;s of size 0 too, so it fits!</p>

<p>In the final case, light approaches the corner of one mirror and is destroyed:&nbsp;<br />
<img src="https://onlinejudgeimages.s3.amazonaws.com/problem/12405/images-47.png" style="border:0px; vertical-align:middle" /><br />
The mirror was in the path of the light, and the ray of light didn&#39;t approach the corners of any other mirrors.</p>

<p>Note that light stops when it hits you, but it has to hit the exact centre of your grid square.</p>

<p>How many images of yourself can you see?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case starts with a line containing three space-separated integers,&nbsp;<strong>H</strong>,&nbsp;<strong>W</strong>&nbsp;and&nbsp;<strong>D</strong>.&nbsp;&nbsp;<strong>H</strong>&nbsp;lines follow, and each contains&nbsp;<strong>W</strong>&nbsp;characters. The characters constitute a map of the Hall of Mirrors for that test case, as described above.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>3 &le;&nbsp;<strong>H</strong>,&nbsp;<strong>W</strong>&nbsp;&le; 30.</li>
	<li>1 &le;&nbsp;<strong>D</strong>&nbsp;&le; 50.</li>
	<li>All characters in each map will be&nbsp;<code>&#39;#&#39;</code>,&nbsp;<code>&#39;.&#39;</code>, or&nbsp;<code>&#39;X&#39;</code>.</li>
	<li>Exactly one character in each map will be&nbsp;<code>&#39;X&#39;</code>.</li>
	<li>The first row, the last row, the first column and the last column of each map will be entirely filled with&nbsp;<code>&#39;#&#39;</code>&nbsp;characters.</li>
	<li>There will be no more than&nbsp;<code>2W+2H-4</code>&nbsp;<code>&#39;#&#39;</code>&nbsp;characters.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the number of reflections of yourself you can see.</p>

### 힌트

<p>In the first case, light travels exactly distance 1 if you look directly up, down, left or right.</p>

<p>In the second case, light travels distance 1.414... if you look up-right, up-left, down-right or down-left. Since light does not travel through you, looking directly up only shows you one image of yourself.</p>

<p>In the fifth case, while the nearby mirror is close enough to reflect light back to you, light that hits the corner of the mirror is destroyed rather than reflected.</p>