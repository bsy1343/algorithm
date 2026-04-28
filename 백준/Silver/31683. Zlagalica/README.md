# [Silver IV] Zlagalica - 31683

[문제 링크](https://www.acmicpc.net/problem/31683)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 23, 맞힌 사람: 22, 정답 비율: 66.667%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Little Maja has always loved puzzles. And since everyone knew that for a long time now, it is no wonder that one sunny day, Maja received an odd puzzle as a gift..</p>

<p>This puzzle has $n$ pieces. Each piece has rectangular shape and is of a certain color. Also, each piece has $2$ numbers written on its back: $u$ and $d$. After a period of skillfully combining pieces and trying to fit them together, Maja figured out the meaning of those numbers.</p>

<p>She found out that number $u$ represents &quot;direction&quot;, in other words, does the next piece of the puzzle connect with the current one from the upper or from the right side of the current piece. Number $d$ specifies the starting column/row where we connect the next piece of the puzzle with current one. In more detail:</p>

<ul>
	<li>If $u$ is equal to $0$, we add next piece <strong>above</strong> the current one by connecting its <strong>bottom left</strong> corner with current piece&rsquo;s <strong>top</strong> edge at <strong>column d</strong>.</li>
	<li>If $u$ is equal to $1$, we add next piece to the <strong>right</strong> by connecting its <strong>bottom left</strong> corner with current piece&rsquo;s <strong>right</strong> edge at <strong>row d</strong>.</li>
</ul>

<p>Let&rsquo;s demonstrate this for pieces colored in colors &quot;a&quot; and &quot;b&quot;. <em>Picture 1</em> shows the case where $u = 0$, and $d = 3$. <em>Picture 2</em> shows case when $u = 1$ and $d = 3$. (In both cases, numbers $u$ and $d$ represent numbers written on the back of piece colored &quot;a&quot;).</p>

<table class="table table-bordered td-center">
	<tbody>
		<tr>
			<td>
			<pre>
. . b b b b b
. . b b b b b
a a a a . . .
a a a a . . .
a a a a . . .
</pre>
			</td>
			<td>
			<pre>
a a a a . . . . .
a a a a b b b b b
a a a a b b b b b
</pre>
			</td>
		</tr>
		<tr>
			<td>Picture 1</td>
			<td>Picture 2</td>
		</tr>
	</tbody>
</table>

<p>Maja has grown tired of this puzzling puzzle, but her curiosity knows no bounds! That&rsquo;s why she&rsquo;s asking for your help. She&rsquo;s interested in knowing, for a given description of every piece of the puzzle and the sequence of their placement, what will the completed puzzle look like? Write a program that prints the dimensions (height and width) of the completed puzzle, as well as its final appearance within a rectangle of the same height and width, where &quot;.&quot; represents places where there is no part of the puzzle.</p>

### 입력

<p>In first row, there is $n$ ($1 &le; n &le; 20$), number of puzzle pieces.</p>

<p>In the $i$-th of next $n$ rows there are per $1$ character and $4$ integers, in order: $b_i$, $r_i$, $s_i$, $u_i$, $d_i$ - description of $i$-th piece:</p>

<ul>
	<li>$b_i$ will always be $1$ lowercase letter of english alphabet, and it represents the color of the $i$-th puzzle piece</li>
	<li>$r_i$ and $s_i$ ($1 &le; r_i , s_i &le; 10$) represent in order, number of rows and columns of $i$-th puzzle piece</li>
	<li>$u_i$ and $d_i$ ($0 &le; u_i &le; 1$, $1 &le; d_i &le; r_i , s_i$ (depends on $u_i$)) are numbers on the back of $i$-th puzzle piece, same as in the task statement.</li>
</ul>

<p>In the last row of input there are $n$ integers, order in which pieces are connected, where number $i$ ($1 &le; i &le; n$) represents $i$-th puzzle piece in input. Each puzzle piece will appear in the sequence exactly once.</p>

### 출력

<p>Print the height and width of the completed puzzle. After that, print the appearance of the puzzle within a rectangle of the same height and width. In the places within the rectangle where there is no part of the puzzle, print &quot;.&quot;.</p>