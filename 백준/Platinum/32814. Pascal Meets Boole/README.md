# [Platinum III] Pascal Meets Boole - 32814

[문제 링크](https://www.acmicpc.net/problem/32814)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 30, 정답: 10, 맞힌 사람: 10, 정답 비율: 38.462%

### 분류

많은 조건 분기, 수학, 애드 혹

### 문제 설명

<p>Many people are familiar with Pascal's Triangle, a triangular arrangement of integers named after the French mathematician and philosopher Blaise Pascal (1623--1662). If we number the rows of Pascal's Triangle $1, 2, 3, \ldots,$ starting from the top, then row $r$ contains $r$ elements, which we will number $1, 2, \ldots, r$ from left to right. The $1$<sup>st</sup> and $r$<sup>th</sup> elements in row $r$ are set equal to $1$, and for $r \geq 3$ and $1 &lt; i &lt; r$, element $i$ in row $r$ is the sum of elements $i-1$ and $i$ in row $r-1.$ More informally, each "non-edge" element is the sum of the two elements immediately above it. Figure J.1(a) depicts the first $8$ rows of Pascal's Triangle.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32814.%E2%80%85Pascal%E2%80%85Meets%E2%80%85Boole/7442c461.png" data-original-src="https://boja.mercury.kr/assets/problem/32814-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 529px; height: 220px;"></p>

<p style="text-align: center;">Figure J.1: (a) Pascal’s Triangle, (b) Pascal-Boole triangle for function $1000$</p>

<p>But what if we consider a rule other than standard addition for combining values? Since the edge elements are bits $1$'s), a natural option is to use any two-input Boolean function, named after the English mathematician and philosopher George Boole (1815--1864). For example, the Boolean function given by the following truth table generates the triangle depicted in Figure J.1(b) (where we also show the first $8$ rows). In this truth table, $x$ and $y$ correspond to elements $i-1$ and $i,$ respectively, in row $r-1$, and $f(x,y)$ is the resulting element $i$ in row $r$.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<th>$x$</th>
			<th>$y$</th>
			<th>$f(x,y)$</th>
		</tr>
		<tr>
			<td>$0$</td>
			<td>$0$</td>
			<td>$1$</td>
		</tr>
		<tr>
			<td>$0$</td>
			<td>$1$</td>
			<td>$0$</td>
		</tr>
		<tr>
			<td>$1$</td>
			<td>$0$</td>
			<td>$0$</td>
		</tr>
		<tr>
			<td>$1$</td>
			<td>$1$</td>
			<td>$0$</td>
		</tr>
	</tbody>
</table>

<p>In general, if we label the bits in the rightmost column of any such truth table $b_{00}, b_{01}, b_{10}, b_{11}$ from top to bottom, then we can compactly represent a two-input Boolean function by the $4$-bit string $b_{00} b_{01} b_{10} b_{11}.$ So the example function above is represented by $1000$.</p>

<p>Your challenge is to answer two kinds of questions about "Pascal-Boole" triangles:</p>

<ol>
	<li>For a given Boolean function, $f,$ what is the bit in row $r$, position $i$?</li>
	<li>For a given Boolean function, $f,$ how many $1$'s are there in the first $r$ rows?</li>
</ol>

### 입력

<p>The first line of input contains an integer, $n$ $(1 \leq n \leq 250),$ the number of test cases. This is followed by $n$ lines, each of which has one of two forms:</p>

<ul>
	<li>$f$ <code>B</code> $r$ $i$</li>
	<li>$f$ <code>N</code> $r$</li>
</ul>

<p>In both cases, <em>f</em> is a $4$-bit binary string representing a two-input Boolean function, and $r$ is an integer $(1 \leq r \leq 10^6).$ In the first case, $i$ is an integer $(1 \leq i \leq r).$</p>

### 출력

<p>For a test case of the form $f$ <code>B</code> $r$ $i$, output a line containing the bit in row $r$, position $i$ of the Pascal-Boole triangle generated using $f$. For a test case of the form $f$ <code>N</code> $r$, output a line containing the number of $1$'s in the first $r$ rows of the Pascal-Boole triangle generated using $f$.</p>