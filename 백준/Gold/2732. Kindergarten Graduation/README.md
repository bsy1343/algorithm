# [Gold IV] Kindergarten Graduation - 2732

[문제 링크](https://www.acmicpc.net/problem/2732)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 7, 맞힌 사람: 7, 정답 비율: 50.000%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>The WeeOnes Kindergarten has a strange ceremony as part of its graduation: The children line up with the girls on the left and the boys on the right with a single space between the boys and the girls. By making a sequence of the following four moves, the children are to end up with all the boys on the left and all the girls on the right with a single space between the boys and the girls.&nbsp;</p>

<table class="table table-bordered" style="width:50%">
	<thead>
		<tr>
			<th style="width:10%">Move</th>
			<th style="width:40%">Operation</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td>Slide left (s)</td>
			<td>The child to the right of the empty space moves into the empty space.</td>
		</tr>
		<tr>
			<td>Slide right (S)</td>
			<td>The child to the left of the empty space moves into the empty space.</td>
		</tr>
		<tr>
			<td>Hop left (h)</td>
			<td>The child two spaces to the right of the open space leapfrogs over the intervening child to the open space.</td>
		</tr>
		<tr>
			<td>Hop right (H)</td>
			<td>The child two spaces to the left of the open space leapfrogs over the intervening child to the open space.</td>
		</tr>
	</tbody>
</table>

<p>In each case, the previous position of the child who moved becomes the new open space.&nbsp;</p>

<p>For example, with two girls and two boys we begin with:&nbsp;</p>

<p>GG_BB&nbsp;</p>

<p>the following moves give the desired result:&nbsp;</p>

<ul>
	<li>s: GGB_B&nbsp;</li>
	<li>H: G_BGB&nbsp;</li>
	<li>S: _GBGB&nbsp;</li>
	<li>h: BG_GB&nbsp;</li>
	<li>h: BGBG_&nbsp;</li>
	<li>S: BGB_G&nbsp;</li>
	<li>H: B_BGG&nbsp;</li>
	<li>s: BB_GG&nbsp;</li>
</ul>

<p>The teacher would like this process to end in a reasonable amount of time so the parents can go home (the children are probably willing to do this all day). Write a program which takes as input the numbers of girls and boys (nGirls and nBoys respectively) and finds a sequence of at most (nGirls * nBoys + nGirls + nBoys) moves which takes you from the starting position to the ending position. [Each girl must leapfrog over (or be leapfrogged over by) each boy and, on average, each child must move past the empty space.]&nbsp;</p>

### 입력

<p>The input begins with the number of problems N, (1 &lt;= N &lt;= 1000), on a line by itself followed by N problem instances each on its own line. A problem instance has the form:&nbsp;</p>

<p>nGirls nBoys&nbsp;</p>

<p>where&nbsp;</p>

<ul>
	<li>nGirls is the number of girls.&nbsp;</li>
	<li>nBoys is the number of boys.</li>
</ul>

<p>There is at least 1 child and at most 24 children in a class.&nbsp;</p>

### 출력

<p>For each problem instance, output the number of moves on a line. On following line, output the codes for the required moves in order.</p>

### 힌트

<p>Note: Other solutions are possible; for instance:&nbsp;</p>

<ol>
	<li>ShsHHshS is also a solution to problem 1&nbsp;</li>
	<li>SSSS, HSS, etc. are also acceptable answers to problem 2.&nbsp;</li>
</ol>