# [Gold I] Illiteracy - 16411

[문제 링크](https://www.acmicpc.net/problem/16411)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 35, 맞힌 사람: 28, 정답 비율: 52.830%

### 분류

구현, 그래프 이론, 자료 구조, 문자열, 그래프 탐색, 너비 우선 탐색, 해시를 사용한 집합과 맵

### 문제 설명

<p>Illiteracy is a simple puzzle game created by Le Sio. After the contest, you can play it at <a href="https://le-slo.itch.io/illiteracy">https://le-slo.itch.io/illiteracy</a>. The game consists of a sequence of eight icons; the actual icons are very artistic, but for simplicity, we&rsquo;ll label the icons using a capital letter <code>A</code>&mdash;<code>F</code>. Clicking any icon has a unique effect on the other icons, based on which icon is clicked and that icon&rsquo;s position in the sequence. Most of the icons rotate the type of other icons. A rotation changes an <code>A</code> to a <code>B</code>, <code>B</code> to <code>C</code>, <code>C</code> to <code>D</code>, <code>D</code> to <code>E</code>, <code>E</code> to <code>F</code>, and <code>F</code> back to <code>A</code>.</p>

<p>Here&rsquo;s what the icons do when you click on one, based on the type of the icon and its position x in the sequence (1 &le; x &le; 8):</p>

<table class="table table-bordered" style="width: 100%;">
	<thead>
		<tr>
			<th style="width: 10%;">Type</th>
			<th style="width: 90%;">Effect</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<td><code>A</code></td>
			<td>Rotates the icons immediately to the left and right (at positions x &minus; 1 and x + 1), ignoring any icon that doesn&rsquo;t exist (when x = 1 or 8).</td>
		</tr>
		<tr>
			<td><code>B</code></td>
			<td>If the icon is at either end of the sequence, does nothing. Otherwise, changes the icon at position x + 1 to the same type as the current icon at x &minus; 1.</td>
		</tr>
		<tr>
			<td><code>C</code></td>
			<td>Rotates the icon at position 9 &minus; x.</td>
		</tr>
		<tr>
			<td><code>D</code></td>
			<td>Rotates all icons between position x and the closest of the sequence&rsquo;s two ends. (Does nothing if x is one of the two ends, and does not change the icon at position x itself). For example, if x = 3, the icons at x = 1 and 2 would be rotated. If x = 5, then the icons at positions 6, 7, and 8 would be rotated.</td>
		</tr>
		<tr>
			<td><code>E</code></td>
			<td>If the icon is at either end of the sequence, does nothing. Otherwise, let y be the number of icons between position x and the closest of the sequence&rsquo;s two ends. Rotates the two icons at positions x &minus; y and x + y. For example, if x = 3, the icons at x = 1 and 5 would be rotated. If x = 5, the icons at positions 8 and 2 would be rotated.</td>
		</tr>
		<tr>
			<td><code>F</code></td>
			<td>If x is odd, rotates the icon at position (x + 9)/2. If x is even, rotates the icon at position x/2.</td>
		</tr>
	</tbody>
</table>

<p>Given a starting sequence of icons and a target sequence, what is the minimal number of clicks required to transform the starting sequence into the target sequence?</p>

### 입력

<p>The input consists of exactly two lines of eight characters each. The first line is the starting icon sequence, and the second is the target sequence. Each character on each line is one of the six capital letters <code>A</code>, <code>B</code>, <code>C</code>, <code>D</code>, <code>E</code>, or <code>F</code>.</p>

### 출력

<p>Output a single integer, the smallest number of icon clicks needed to get from the starting sequence to the target sequence or -1 if it isn&rsquo;t possible..</p>

### 힌트

<p>For the cases below, we illustrate one possible minimal sequence of clicks to get from the top configuration to the bottom one. The carets indicate which icon on the previous line was clicked to generate the sequence on the following line. The sequence on the left takes 2 clicks; the sequence on the right takes 4 clicks.</p>

<pre>
ABCDEFCD        DCDAFCBA
   ^               ^
BCDDEFCD        DCEAACBA
     ^                ^
BCEDEFCD        DCEAACBC
                 ^
                DCEAACCC
                  ^
                ECEABCCC</pre>