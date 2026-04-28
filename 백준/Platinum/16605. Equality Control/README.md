# [Platinum I] Equality Control - 16605

[문제 링크](https://www.acmicpc.net/problem/16605)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 176, 정답: 47, 맞힌 사람: 36, 정답 비율: 27.273%

### 분류

문자열, 파싱

### 문제 설명

<p>In programming contest circles, one of the most important roles is that of the Chief Equality Officer (CEO). This person is responsible for making sure that every team has an equal chance of winning the contest. Since last year&rsquo;s NWERC the current CEO, Gregor, has thought at length about how to make the contest even more fair and equal.</p>

<p>His answer is to introduce a new programming language as the only one allowed for submissions. This way, no team will be disadvantaged by not having mastered any of the allowed languages. This language is called BALLOON, short for Building A Long List Of Ordinary Numbers. Its only data type is the list of integers. To keep the language fast, it contains only four instructions:</p>

<ul>
	<li>[x1,...,xn] is the constructor for lists. It returns the integers inside the brackets in their given order.</li>
	<li><code>concat(&lt;Expr<sub>1</sub>&gt;,&lt;Expr<sub>2</sub>&gt;)</code> returns a list of all the integers returned when evaluating the expression <code>&lt;Expr<sub>1</sub>&gt;</code> followed by all of the integers returned when evaluating <code>&lt;Expr<sub>2</sub>&gt;</code>.</li>
	<li><code>shuffle(&lt;Expr&gt;)</code> returns a list of all the integers returned by <code>&lt;Expr&gt;</code>, rearranged according to a uniformly random permutation, i.e., each permutation of the elements is used with equal probability.</li>
	<li><code>sorted(&lt;Expr&gt;)</code> returns a list of all the integers returned by <code>&lt;Expr&gt;</code>, rearranged into non-decreasing order.</li>
</ul>

<p>As an example, consider the first expression of Sample Input 1. The two shuffle exressions both take the list [1,2] as input and return one of the lists [1,2] and [2,1], each with probability 0.5 (independently of each other). The outer concat operator takes the two returned lists as its input and returns their concatenation. I.e., it returns one of the lists [1,2,1,2], [1,2,2,1], [2,1,1,2], and [2,1,2,1], each with probability 0.25.</p>

<p>Naturally, we cannot use byte-by-byte output comparison any more when teams submit their solutions in BALLOON, as its output is probabilistic. The judge server instead has to check whether a submitted program is equivalent to the sample solution created by the judges. Two programs are equivalent if for any list L of integers, both programs have an equal probability of returning L.</p>

<p>It is your task to determine whether two given BALLOON programs are equivalent.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing a string A, the first program.</li>
	<li>One line containing a string B, the second program.</li>
</ul>

<p>Each program is a syntactically valid BALLOON program with between 3 and 10<sup>6</sup> characters, and contains neither spacing nor empty lists (i.e., the strings &ldquo; &rdquo; or &ldquo;[]&rdquo; do not occur in the input).</p>

<p>Each integer in each program is greater than 0 and less than 10<sup>9</sup>.</p>

### 출력

<p>If the two programs are equivalent, output &ldquo;equal&rdquo;, otherwise output &ldquo;not equal&rdquo;.</p>