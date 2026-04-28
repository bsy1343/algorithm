# [Silver V] Pahuljice - 30939

[문제 링크](https://www.acmicpc.net/problem/30939)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 53, 맞힌 사람: 48, 정답 비율: 92.308%

### 분류

구현

### 문제 설명

<p>Lana likes to draw specific snowflakes. A snowflake of size $x$ is defined as follows:</p>

<ul>
	<li>The center of the snowflake is the character &#39;<code>+</code>&#39;.</li>
	<li>Above and below the character &#39;<code>+</code>&#39; there is a sequence of $x$ characters &#39;<code>|</code>&#39;.</li>
	<li>To the left and right of the character &#39;<code>+</code>&#39; there is a sequence of $x$ characters &#39;<code>-</code>&#39;.</li>
	<li>On the diagonal from the upper left corner to the center and from the center to the lower right corner of the snowflake there is a sequence of $x$ characters &#39;<code>\</code>&#39;.</li>
	<li>On the diagonal from the upper right corner to the center and from the center to the lower left corner of the snowflake there is a sequence of $x$ characters &#39;<code>/</code>&#39;.</li>
</ul>

<p>Sometimes Lana connects several snowflakes, but even then the size of each snowflake is determined separately, regardless of whether the snowflakes share some characters.</p>

<table class="table table-bordered td-center td-middle">
	<tbody>
		<tr>
			<td>
			<pre>
\|/
-+-
/|\</pre>
			</td>
			<td>
			<pre>
\.|./..
.\|/...
--+--..
./|\...
/.|.\|/
....-+-
..../|\</pre>
			</td>
			<td>
			<pre>
\.|./.
.\|/..
--+---
./|\..
/...\.</pre>
			</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">On the left is an example of a snowflake of size $1$.</p>

<p style="text-align: center;">In the middle is an example of connected snowflakes, the left one of size $2$ and the right one of size $1$.</p>

<p style="text-align: center;">On the right is an example of a snowflake of size $1$. It is missing one character &#39;<code>|</code>&#39; to be of size $2$.</p>

<p>Lana is currently drawing snowflakes on a piece of paper of size $n \times m$. However, she got a bit confused and did not draw all the snowflakes completely in accordance with her usual snowflake shapes. Namely, some snowflakes are missing some characters, so their size is equal to the smallest length of the corresponding character sequence from the center in one of the eight directions. Moreover, she drew some characters that are not part of any snowflake.</p>

<p>Can you help Lana determine the size of the largest snowflake in the drawing?</p>

### 입력

<p>The first line contains two integers $n$ and $m$ ($1 &le; n, m &le; 50$), the size of the drawing.</p>

<p>In each of the following $n$ lines there are $m$ characters describing the drawing.</p>

<p>The characters that can appear in the drawing are &#39;<code>+</code>&#39;, &#39;<code>-</code>&#39;, &#39;<code>\</code>&#39;, &#39;<code>|</code>&#39;, &#39;<code>/</code>&#39; and &#39;<code>.</code>&#39;. The ASCII values of these characters are 43, 45, 92, 124, 47 and 46 respectively.</p>

### 출력

<p>In the first and only line you should output the size of the largest snowflake in the drawing.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>Only one snowflake is drawn.</p>

<p>In the directions up-left, up and up-right from the center of the snowflake there are sequences of length $1$.</p>

<p>In the directions right and down-right from the center of the snowflake there are sequences of length $2$.</p>

<p>In the directions left, down-left and down from the center of the snowflake there are sequences of length $3$.</p>

<p>Therefore, the size of the snowflake is $1$.</p>

<p>Clarification of the second example:</p>

<p>Two connected snowflakes are drawn, the left one of size $2$ and the right one of size $1$.</p>

<p> </p>