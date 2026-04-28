# [Platinum IV] Help the Museum - 22779

[문제 링크](https://www.acmicpc.net/problem/22779)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 1, 맞힌 사람: 1, 정답 비율: 5.882%

### 분류

구현, 그래프 이론, 그래프 탐색, 해 구성하기, 너비 우선 탐색, 격자 그래프, 역추적

### 문제 설명

<p>The National Association of Museum Curators came to you with an interesting problem. The President of the country, in order to improve his public image, has decided to visit the various Art Museums in the country, to convey the impression that he is a refined man. Being a very busy person, however, and knowing nothing about art, he imposed two restrictions for the visits:</p>

<ol>
	<li>In each museum, he wants to see the works of one and only one artist, so that he can easily prepare himself for the visit and pose as an art connoisseur. However he does not necessarily have to see all of the works of that artist.</li>
	<li>He does not want to waste time, and demands to walk through the exposition following the shortest possible path.</li>
</ol>

<p>The curators are willing to follow the President&rsquo;s demands, but they do not want to redistribute the masterpieces in the exposition only to obtain a straight path. Their only concession is to exchange temporarily the place of two masterpieces, if this helps to obtain a shorter path.</p>

<p>You should write a program that receives as input the layout of an exposition and finds the shortest path, according to the above constraints. To make your task easier, the curators have already defined a standard layout. Figure 7 shows one such layout.</p>

<table class="table table-bordered th-center td-center table-center-50">
	<tbody>
		<tr>
			<th>10</th>
			<td>B</td>
			<td>B</td>
			<td>B</td>
			<td>B</td>
			<td>B</td>
			<td>B</td>
			<td>F</td>
			<td>F</td>
			<td>F</td>
			<td>F</td>
			<td>F</td>
		</tr>
		<tr>
			<th>9</th>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			<td>B</td>
			<td>D</td>
			<td>C</td>
			<td>C</td>
			<td>F</td>
			<td>F</td>
		</tr>
		<tr>
			<th>8</th>
			<td>A</td>
			<td>F</td>
			<td>F</td>
			<td>F</td>
			<td>A</td>
			<td>B</td>
			<td>A</td>
			<td>A</td>
			<td>C</td>
			<td>F</td>
			<td>C</td>
		</tr>
		<tr>
			<th>7</th>
			<td>B</td>
			<td>F</td>
			<td>E</td>
			<td>F</td>
			<td>A</td>
			<td>B</td>
			<td>B</td>
			<td>B</td>
			<td>B</td>
			<td>B</td>
			<td>D</td>
		</tr>
		<tr>
			<th>6</th>
			<td>F</td>
			<td>F</td>
			<td>D</td>
			<td>E</td>
			<td>A</td>
			<td>B</td>
			<td>A</td>
			<td>A</td>
			<td>A</td>
			<td>B</td>
			<td>A</td>
		</tr>
		<tr>
			<th>5</th>
			<td>E</td>
			<td>E</td>
			<td>D</td>
			<td>E</td>
			<td>E</td>
			<td>E</td>
			<td>E</td>
			<td>E</td>
			<td>A</td>
			<td>B</td>
			<td>B</td>
		</tr>
		<tr>
			<th>4</th>
			<td>D</td>
			<td>D</td>
			<td>D</td>
			<td>E</td>
			<td>E</td>
			<td>E</td>
			<td>E</td>
			<td>E</td>
			<td>A</td>
			<td>A</td>
			<td>B</td>
		</tr>
		<tr>
			<th>3</th>
			<td>D</td>
			<td>C</td>
			<td>C</td>
			<td>F</td>
			<td>F</td>
			<td>F</td>
			<td>C</td>
			<td>C</td>
			<td>A</td>
			<td>B</td>
			<td>A</td>
		</tr>
		<tr>
			<th>2</th>
			<td>D</td>
			<td>C</td>
			<td>C</td>
			<td>F</td>
			<td>F</td>
			<td>F</td>
			<td>C</td>
			<td>C</td>
			<td>A</td>
			<td>A</td>
			<td>A</td>
		</tr>
		<tr>
			<th>1</th>
			<td>C</td>
			<td>C</td>
			<td>C</td>
			<td>C</td>
			<td>C</td>
			<td>C</td>
			<td>C</td>
			<td>C</td>
			<td>C</td>
			<td>C</td>
			<td>C</td>
		</tr>
		<tr>
			<th>Y/X</th>
			<th>1</th>
			<th>2</th>
			<th>3</th>
			<th>4</th>
			<th>5</th>
			<th>6</th>
			<th>7</th>
			<th>8</th>
			<th>9</th>
			<th>10</th>
			<th>11</th>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Figure 7: Layout of the Museum</p>

<p>The President&rsquo;s walk begins always at the left wall (X = 1, any Y) and ends at the right wall (X = X<sub>max</sub>, any Y). The walk can be done horizontally or vertically; diagonal movements are&nbsp;not allowed. The works of a given artist are all labeled with the same capital letter (A, B, C, etc). From Figure 1, several cases can be illustrated:</p>

<ol>
	<li>If the president wants to see the works of artist A, there is not a path from left to right. Such a path can be obtained if the work by artist B at (6, 6) is exchanged with one by artist A from (1, 8), (7, 8), (8, 8), (10, 6), (11, 6) or (11, 3).</li>
	<li>If the president wants to see the works of artist B, there is already a path, beginning at (1, 10) and ending at (11, 5). A shorter path can be obtained, if the work of D at (11, 7) is exchanged with one work by artist B, for example from (10, 6).</li>
	<li>If the president wants to see the works of artist C, there is already a straight path from (1, 1) to (1, 11), and a shorter path cannot be obtained.</li>
	<li>If the president wants to see the works of D, E or F, there is no possibility to obtain a path from left to right.</li>
</ol>

### 입력

<p>The input file may contain several instances of the problem. Each instance has the following format (all numbers are positive integers):</p>

<ol>
	<li>The first line contains the integers X<sub>max</sub> and <sub>Ymax</sub>, the layout dimensions. You may assume that 1 &le; X<sub>max</sub>, Y<sub>max</sub> &le; 100.</li>
	<li>The second line contains the artist (upper-case) letter that will have his/her works visited.</li>
	<li>Y<sub>max</sub> lines, each with X<sub>max</sub> letters (without spaces between them). The first input line corresponds to index Y<sub>max</sub>, the second line to index Y<sub>max</sub> &minus;1, and so on, until the last line, that corresponds to index 1.</li>
</ol>

<p>A line containing two zeros terminates the input file. Numbers are separated by spaces.</p>

### 출력

<p>For each instance of the problem, your program should produce output as follows.</p>

<p>If a path exists, your program should first print one line with the message &ldquo;<code>Exchange (x,y) and (u,v)</code>&rdquo; if an exchange will occur, or &ldquo;<code>No exchange</code>&rdquo; otherwise. Following that, the shortest path should be printed, one coordinate per line. In case more than one path is the shortest, any one of them may be printed, except that a path without an exchange should be preferred to those with exchanges.</p>

<p>If a path does not exist, your program should print only one line with the message &ldquo;<code>No path</code>&rdquo;.</p>

<p>The output of each instance is terminated with a blank line.</p>