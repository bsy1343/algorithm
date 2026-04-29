# [Platinum V] Another Expected Value Problem - 33796

[문제 링크](https://www.acmicpc.net/problem/33796)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 39, 정답: 30, 맞힌 사람: 25, 정답 비율: 78.125%

### 분류

모듈로 곱셈 역원, 분할 정복을 이용한 거듭제곱, 수학, 애드 혹, 정수론, 통계학, 페르마의 소정리, 확률론

### 문제 설명

<p>You are given an array $a$ of $n$ integers. You then perform the following process $k$ times.</p>

<ul>
	<li>Choose an integer $i$ where $1 \le i \le n$, uniformly at random.</li>
	<li>For each $1 \le j \le n$, move $a_j$ one unit closer to $a_i$. Formally, for each $j$,
	<ul>
		<li>If $a_j &lt; a_i$, increment $a_j$ by $1$</li>
		<li>If $a_j &gt; a_i$, decrement $a_j$ by $1$</li>
		<li>If $a_j = a_i$, do not modify the value of $a_j$.</li>
	</ul>
	</li>
</ul>

<p>After performing this process $k$ times, you select an integer $i$ where $1 \le i \le n$ uniformly at random. What is the expected value of $a_i$?</p>

<p>It can be shown that this value can be represented as $\frac{P}{Q}$ where $P$ and $Q$ are coprime integers and $Q \not\equiv 0 \mod 10^9+7$. Print the value of $P\cdot Q^{-1}$ modulo $10^9+7$.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1\le t\le  10^4$) --- the number of test cases.</p>

<p>The first line of each test case contains two integers $n$ and $k$ ($1\le n,k \le 2\cdot 10^5$) --- the length of the array and the number of operations you will perform.</p>

<p>The second line of each test case will contain $n$ integers $a_1, a_2, \cdots a_n$ ($1 \le a_i \le 10^9$) --- the initial array $a$.</p>

<p>It is guaranteed that the sum of $n$ over all test cases, and the sum of $k$ over all test cases, do not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, output a single line containing the expected value of $a_i$ at the end of this process, modulo $10^9+7$ as described above.</p>

### 힌트

<p>In the first sample case, since all elements of $a$ are initially equal, none of them will change after any of the $k=5$ operations. Therefore, the final array will be $[8, 8, 8]$, so the expected value of a random element of the final array is $8$.</p>

<p>In the second sample case, there is a $50\%$ chance of choosing $i = 1$ in the operation, and a $50\%$ chance of choosing $i = 2$.</p>

<ol>
	<li>If $i = 1$ is chosen, all elements of the array will move closer to $a_1 = 10$, so $a$ will go from $[10, 11]$ to $[10, 10]$. The expected value of a random element of this array is $10$. </li>
	<li>If $i = 2$ is chosen, all elements of the array will move closer to $a_2 = 11$, so $a$ will go from $[10, 11]$ to $[11, 11]$. The expected value of a random element of this array is $11$.</li>
</ol>

<p>So there is a $50\%$ chance of the expected value being $10$, and a $50\%$ chance of it being $11$. Therefore, the final expected value is $10.5 = \frac{21}{2}$, which is equivalent to $5000000014$ modulo $10^9+7$. </p>