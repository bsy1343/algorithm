# [Gold III] PERMS - 4879

[문제 링크](https://www.acmicpc.net/problem/4879)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 33, 맞힌 사람: 30, 정답 비율: 78.947%

### 분류

다이나믹 프로그래밍, 수학

### 문제 설명

<p>Count the number of permutations that have a specific number of inversions.</p>

<p>Given a permutation&nbsp;<i>a</i><sub>1</sub>,&nbsp;<i>a</i><sub>2</sub>,&nbsp;<i>a</i><sub>3</sub>,...,&nbsp;<i>a</i><sub>n</sub>&nbsp;of the&nbsp;<i>n</i>&nbsp;integers 1, 2, 3, ...,&nbsp;<i>n</i>, an inversion is a pair (<i>a</i><sub>i</sub>,&nbsp;<i>a</i><sub>j</sub>) where i &lt; j and&nbsp;<i>a</i><sub>i</sub>&nbsp;&gt;&nbsp;<i>a</i><sub>j</sub>. The number of inversions in a permutation gives an indication on how &quot;unsorted&quot; a permutation is. If we wish to analyze the average running time of a sorting algorithm, it is often useful to know how many permutations of&nbsp;<i>n</i>&nbsp;objects will have a certain number of inversions.</p>

<p>In this problem you are asked to compute the number of permutations of&nbsp;<i>n</i>&nbsp;values that have exactly&nbsp;<i>k</i>&nbsp;inversions.</p>

<p>For example, if&nbsp;<i>n</i>&nbsp;= 3, there are 6 permutations with the indicated inversions as follows:</p>

<table class="table table-bordered" width="100%">
	<tbody>
		<tr>
			<td>123</td>
			<td>0 inversions</td>
		</tr>
		<tr>
			<td>132</td>
			<td>1 inversion (3 &gt; 2)</td>
		</tr>
		<tr>
			<td>213</td>
			<td>1 inversion (2 &gt; 1)</td>
		</tr>
		<tr>
			<td>231</td>
			<td>2 inversions (2 &gt; 1, 3 &gt; 1)</td>
		</tr>
		<tr>
			<td>312</td>
			<td>2 inversions (3 &gt; 1, 3 &gt; 2)</td>
		</tr>
		<tr>
			<td>321</td>
			<td>3 inversions (3 &gt; 2, 3 &gt; 1, 2 &gt; 1)</td>
		</tr>
	</tbody>
</table>

<p>Therefore, for the permutations of 3 things</p>

<ul>
	<li>1 of them has 0 inversions</li>
	<li>2 of them have 1 inversion</li>
	<li>2 of them have 2 inversions</li>
	<li>1 of them has 3 inversions</li>
	<li>0 of them have 4 inversions</li>
	<li>0 of them have 5 inversions</li>
	<li>etc.</li>
</ul>

### 입력

<p>The input consists one or more problems. The input for each problem is specified on a single line, giving the integer&nbsp;<i>n</i>&nbsp;(1 &lt;=&nbsp;<i>n</i>&nbsp;&lt;= 18) and a non-negative integer&nbsp;<i>k</i>&nbsp;(0 &lt;=&nbsp;<i>k</i>&nbsp;&lt;= 200). The end of input is specified by a line with n = k = 0.</p>

### 출력

<p>For each problem, output the number of permutations of {1, ...,&nbsp;<i>n</i>}with exactly&nbsp;<i>k</i>&nbsp;inversions.</p>