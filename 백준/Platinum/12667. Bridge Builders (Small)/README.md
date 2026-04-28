# [Platinum III] Bridge Builders (Small) - 12667

[문제 링크](https://www.acmicpc.net/problem/12667)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 15, 맞힌 사람: 15, 정답 비율: 71.429%

### 분류

너비 우선 탐색, 그래프 이론, 그래프 탐색, 최소 스패닝 트리

### 문제 설명

<p>The king wants bridges built and he wants them built as quickly as possible. The king owns an&nbsp;<strong>N</strong>&nbsp;by&nbsp;<strong>M</strong>&nbsp;grid of land with each cell separated from its adjacent cells by a river running between them and he wants you to figure out how many man-hours of work it will take to build enough bridges to connect every island. Some cells are actually lakes and need not have a bridge built to them.&nbsp;</p>

<p>Some of the islands are forests where trees are abundant. Located in the top left corner is the&nbsp;<em>base camp</em>, which is always a forest.</p>

<p>A bridge can only be built between two islands if they are vertically or horizontally adjacent, and one of the islands is accessible from the base camp through the bridges that are already built.</p>

<p>The number of man-hours it takes to build a bridge is the number of bridges the builders have to cross to get from the nearest forest to the island you&#39;re building to, including the bridge being built. Builders can only walk between two islands if there is already a bridge between them.</p>

<p>The king has already ensured that there is at least one way to connect all the islands.&nbsp;</p>

<p>Write a program that, given a map of the islands, will output the minimum number of man-hours required to connect all islands.</p>

<p>Consider this example. A green tile indicates a forest, gray indicates an empty island, and blue indicates water.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/12668/images-14.png" /></p>

<p>One optimal solution starts out by building the following bridges from the base camp forest.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/12668/images-15.png" style="height:99px; width:96px" /></p>

<p>This has a cost of 1 + 2 + 1 + 2 + 3 + 4 = 13</p>

<p>Now since the forest at row 3, column 3 is connected to base camp, we can build bridges from there. One optimal solution connects the rest of the islands with bridges built from this forest.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/12668/images-16.png" style="height:99px; width:96px" /></p>

<p>This has a cost of 2 + 1 + 2 + 1 + 2 + 3 = 11. This brings the total cost to 24 which is the optimal solution.</p>

### 입력

<p>The first line of the input contains an integer&nbsp;<strong>T</strong>, the number of test cases.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case will begin with&nbsp;<strong>N</strong>, the number of rows, and&nbsp;<strong>M</strong>, the number of columns, on one line separated by a space.&nbsp;&nbsp;<strong>N</strong>&nbsp;rows follow that contain exactly&nbsp;<strong>M</strong>characters each. A &#39;T&#39; indicates an island with a forest, a &#39;#&#39; indicates an island, and a &#39;.&#39; indicates water.</p>

<p>&nbsp;</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 30</li>
	<li>2 &le;&nbsp;<strong>M</strong>&nbsp;&le; 30</li>
	<li>The top left cell will always be a &#39;T&#39;</li>
	<li>It will be possible to connect all islands through bridges</li>
	<li>There will be at most 2 forests in the grid including the base camp.</li>
</ul>

### 출력

<p>A single line containing &quot;Case #X: Y&quot;, where&nbsp;<strong>X</strong>&nbsp;is the 1-based case number, and&nbsp;<strong>Y</strong>&nbsp;is the minimum number of man-hours needed to connect all islands.</p>