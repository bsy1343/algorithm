# [Gold III] Horrendous Mistake - 32591

[문제 링크](https://www.acmicpc.net/problem/32591)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 8, 정답: 7, 맞힌 사람: 6, 정답 비율: 85.714%

### 분류

(분류 없음)

### 문제 설명

<p>While looking through the Grand Archive of Problematic Code, you found this horrendous mistake in one of the code snippets. In this code, they tried to calculate the sum of an array, but got indices and values mixed up. The code of this <code>sum</code> function is shown in Figure H.1.</p>

<table class="table table-bordered">
	<tbody>
		<tr>
			<td>
			<pre>long long sum(vector&lt;int&gt; a) {
    long long ans = 0;
    for (int x : a)
        ans += a[x];
    return ans;
}</pre>
			</td>
			<td>
			<pre>def sum(a: list[int]) -&gt; int:
    ans = 0
    for x in a:
        ans += a[x]
    return ans</pre>
			</td>
		</tr>
		<tr>
			<td>
			<pre>long sum(int[] a) {
    long ans = 0;
    for (int x : a)
        ans += a[x];
    return ans;
}</pre>
			</td>
			<td>
			<pre>fun sum(a: List&lt;Int&gt;): Long {
    var ans = 0L
    for (x in a)
        ans += a[x]
    return ans
}</pre>
			</td>
		</tr>
	</tbody>
</table>

<p style="text-align: center;">Figure H.1: The function <code>sum</code> intends to calculate the sum of an array, but <code>x</code> refers to a value in the array, instead of an index. The code is shown in C++ and Python in the top row, and Java and Kotlin in the bottom row.</p>

<p>You wonder how this function behaves exactly, and decide to thoroughly test it. Starting with some initial array, you apply a sequence of updates. For each update, you change one of the values of the array. You wonder what the value of the function is after each update.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1\leq n\leq 2\cdot10^5$), the length of the array.</li>
	<li>One line with $n$ integers $a$ ($0 \leq a &lt; n$), the values in the initial array.</li>
	<li>One line with an integer $t$ ($1 \leq t \leq 2\cdot10^5$), the number of updates in your sequence of testing.</li>
	<li>$t$ lines, each with two integers $x$ and $v$ ($0 \leq x,v &lt; n$), indicating that the $x$th entry in the array is updated to the new value $v$.</li>
</ul>

<p>Note that the array uses $0$-based indexing.</p>

### 출력

<p>For each update, output the return value of the function <code>sum</code> applied to the array after applying the update.</p>