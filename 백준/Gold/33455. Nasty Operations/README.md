# [Gold III] Nasty Operations - 33455

[문제 링크](https://www.acmicpc.net/problem/33455)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

누적 합, 덱, 비트마스킹, 수학, 애드 혹, 자료 구조

### 문제 설명

<p>Svetozar has an array $a$ of $n$ integers. He came up with several operations on this array:</p>

<ul>
	<li>
	<p><code>1</code>: replace $a$ with the array of bitwise exclusive ORs of the prefixes of array $a$.</p>

	<p>This means that the $i$-th element of the array after the operation will become equal to $a_1 \oplus a_2 \oplus \ldots \oplus a_i$.</p>
	</li>
	<li>
	<p><code>2</code>: replace $a$ with the array of bitwise exclusive ORs of the suffixes of array $a$.</p>

	<p>This means that the $i$-th element of the array after the operation will become equal to $a_i \oplus a_{i + 1} \oplus \ldots \oplus a_n$.</p>
	</li>
	<li>
	<p><code>-1</code>: perform the inverse operation to operation <code>1</code>.</p>

	<p>This means that the elements of the array will change in such a way that if operation <code>1</code> is applied to the array afterwards, the resulting array will be the same as the one before operation <code>-1</code>.</p>
	</li>
	<li>
	<p><code>-2</code>: perform the inverse operation to operation <code>2</code>.</p>

	<p>This means that the elements of the array will change in such a way that if operation <code>2</code> is applied to the array afterwards, the resulting array will be the same as the one before operation <code>-2</code>.</p>
	</li>
</ul>

<p>Svetozar has performed a number of operations and now asks you to check the correctness of his calculations. To simplify the verification, the first operation performed by Svetozar is always denoted by a positive number, and any two consecutive operations are denoted by numbers with different signs.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \leq T \leq 10^5$), denoting the number of test cases.</p>

<p>Then $T$ test case descriptions follow, each consisting of three lines.</p>

<p>The first line of a description contains two integers $n$ and $q$ ($1 \leq n, q \leq 10^5$), denoting the size of the array and the number of operations, respectively.</p>

<p>The second line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($0 \leq a_i \leq 10^9$), denoting the elements of the array.</p>

<p>The third line contains $q$ integers $op_1, op_2, \ldots, op_q$ ($-2 \leq op_i \leq 2$, $op_i \ne 0$, $op_1 &gt; 0$, $op_i \cdot op_{i + 1} &lt; 0$), denoting the operations in the order of their application.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^5$, and the sum of $q$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, output $n$ integers on a separate line: the array after applying all the operations.</p>