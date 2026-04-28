# [Silver I] Knitting Patterns - 25990

[문제 링크](https://www.acmicpc.net/problem/25990)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 90, 정답: 35, 맞힌 사람: 29, 정답 비율: 53.704%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>It is the most relaxing hobby of anyone&#39;s grandma: knitting! Your grandma uses a lot of wool, even for the most simple patterns that she is knitting. You are sure that she can be more efficient with her wool, so you decide to write a program that calculates the most efficient use of wool.</p>

<p>A knitting pattern is a long list of stitches, where each stitch can use a different colour. (Most real-life knitting patterns are two-dimensional,  the input is one-dimensional for simplicity.) There is a cost for starting or ending the use of a certain colour, for using the wool in a stitch, and for letting it strand through the back unused. For a given knitting pattern, calculate the least possible amount of wool required for every colour of wool.</p>

<p>As an example, consider the first sample case. There are three colours of wool (red, green, and blue). The red wool is used at the start and at the end of the pattern: it is most efficient to start and stop using the red wool for both parts separately ($4 \cdot 4 = 16$ cost), and it is used in ten stitches ($10 \cdot 2 = 20$ cost), giving a total cost of $36$. The green and blue wool have the same cost: start once ($4$ cost), use for five stitches ($5 \cdot 2 = 10$ cost), strand along the back for four stitches ($4 \cdot 1 = 4$ cost), and stop using the colour ($4$ cost), giving a total cost of $22$.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $a$, $b$, and $c$ ($1\leq a &lt; b &lt; c\leq 1000$), the cost of letting the wool strand through the back unused, the cost of using the wool in a stitch, and the cost of starting or ending the use of a colour of wool.</li>
	<li>One line with a string $w$ ($1 \leq |w| \leq 26$), representing the unique letters used for denoting stitch colours.</li>
	<li>One line with a string $p$ ($1 \leq |p| \leq 10^6$), representing the stitch colours of the knitting pattern.</li>
</ul>

<p>All stitch colours use English lowercase letters (<code>a-z</code>).</p>

### 출력

<p>Output, for every colour of wool, in the order as they are in $w$, the amount of wool used in this pattern.</p>