# [Gold I] Intelligence Exploration - 32592

[문제 링크](https://www.acmicpc.net/problem/32592)

### 성능 요약

시간 제한: 4 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 20, 정답: 14, 맞힌 사람: 12, 정답 비율: 80.000%

### 분류

다이나믹 프로그래밍, 애드 혹, 이분 탐색

### 문제 설명

<p>John is a researcher working in the field of Artificial Intelligence. At the moment he needs to analyze reasoning abilities of a new Limitless Logic Machine, he wants to check how well it can understand when one thing implies another.</p>

<p>The scientist is planning to use a long array $a$ consisting of zeroes and ones for his experiment. During the experiment, he will make multiple queries to the machine, where each query is defined by a pair $l$, $r$. For each query, the machine will be asked to compute the value of the implication of the subarray $a_l \to a_{l + 1} \to \ldots \to a_r$. John asks you, as his AI Application Project Junior Engineer, to compute the correct answers for these queries, so he can use them to validate his machine.</p>

<p>The implication operator is defined as follows:</p>

<table class="table table-bordered td-center table-center-20">
	<tbody>
		<tr>
			<td>$x$</td>
			<td>$y$</td>
			<td>$x \to y$</td>
		</tr>
		<tr>
			<td>$0$</td>
			<td>$0$</td>
			<td>$1$</td>
		</tr>
		<tr>
			<td>$0$</td>
			<td>$1$</td>
			<td>$1$</td>
		</tr>
		<tr>
			<td>$1$</td>
			<td>$0$</td>
			<td>$0$</td>
		</tr>
		<tr>
			<td>$1$</td>
			<td>$1$</td>
			<td>$1$</td>
		</tr>
	</tbody>
</table>

<p>In this problem, we assume a left-to-right evaluation order, so the order of the operations is $((\dots((a_l \to a_{l + 1}) \to a_{l + 2}) \to \dots) \to a_r)$.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($2\leq n\leq 10^5$), the size of the array.</li>
	<li>One line with $n$ integers $a$ ($a \in \{0, 1\}$), the values in the array.</li>
	<li>One line with an integer $q$ ($1\leq q\leq 10^5$), the number of queries.</li>
	<li>$q$ lines, each with two integers $l$ and $r$ ($1 \leq l &lt; r \leq n$), describing a query.</li>
</ul>

### 출력

<p>For each query, output the result of the corresponding implication.</p>