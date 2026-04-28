# [Gold V] Pegman (Large) - 12140

[문제 링크](https://www.acmicpc.net/problem/12140)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 61, 정답: 50, 맞힌 사람: 47, 정답 비율: 82.456%

### 분류

구현, 그리디 알고리즘, 시뮬레이션

### 문제 설명

<p>While using Google Street View, you may have picked up and dropped the character Pegman before. Today, a mischievous user is going to place Pegman in some cell of a rectangular grid of unit cells with&nbsp;<strong>R</strong>&nbsp;rows and&nbsp;<strong>C</strong>&nbsp;columns. Each of the cells in this grid might be blank, or it might be labeled with an arrow pointing in one of four possible directions: up, right, down, or left.<br />
<br />
When Pegman is placed on a grid cell, if that cell is blank, Pegman stands still forever. However, if that cell has an arrow, Pegman starts to walk in that direction. As he walks, whenever he encounters a blank cell, he just keeps walking in his current direction, but whenever he encounters another arrow, he changes to the direction of that arrow and then keeps walking.<br />
<br />
You know that it is possible that Pegman might keep happily walking around and around the grid forever, but it is also possible that Pegman&#39;s walk will take him over the edge of the grid! You may be able to prevent this and save him by changing the direction of one or more arrows. (Each arrow&#39;s direction can only be changed to one of the other three possible directions; arrows can only be changed, not added or removed.)<br />
<br />
What is the smallest number of arrows you will need to change to ensure that Pegman will not walk off the edge, no matter where on the grid he is initially placed?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each begins with one line with two space-separated integers&nbsp;<strong>R</strong>,&nbsp;<strong>C</strong>. This line is followed by&nbsp;<strong>R</strong>lines, each of which has&nbsp;<strong>C</strong>&nbsp;characters, each of which describes a grid cell and is one of the following:<br />
<br />
<code>. period = no arrow<br />
^ caret = up arrow<br />
&gt; greater than = right arrow<br />
v lowercase v = down arrow<br />
&lt; less than = left arrow</code></p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>R, C</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of arrows that must be changed to ensure that Pegman will not leave the grid no matter where he is initially placed, or the text&nbsp;<code>IMPOSSIBLE</code>&nbsp;if it is not possible to ensure this, no matter how many arrows you change.</p>

### 힌트

<p>In Case #1, Pegman is guaranteed to walk off the top edge of the grid, no matter where he is placed. You can prevent that by changing the topmost arrow to point down, which will cause him to walk back and forth between those two arrows forever.<br />
<br />
In Case #2, no matter where Pegman is placed, he will walk around and around the board clockwise in a circle. No arrows need to be changed.<br />
<br />
In Case #3, the mischievous user might place Pegman on the up arrow in the middle of the grid, in which case he will start walking and then walk off the top edge of the grid. Changing the direction of this arrow won&#39;t help: it would just make him walk off a different edge.<br />
<br />
In Case #4, the only possible starting cell is blank, so Pegman will stand still forever and is in no danger.</p>