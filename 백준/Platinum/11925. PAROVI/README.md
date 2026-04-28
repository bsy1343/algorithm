# [Platinum IV] PAROVI - 11925

[문제 링크](https://www.acmicpc.net/problem/11925)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 72, 정답: 39, 맞힌 사람: 32, 정답 비율: 60.377%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 런타임 전의 전처리, 포함 배제의 원리

### 문제 설명

<p>Mirko and Slavko are playing a game. Mirko&rsquo;s turn is first and he chooses a non-empty set of pairs of numbers between 1 and N (inclusive) under the condition that the numbers that comprise a pair are mutually relatively prime. The numbers that comprise a pair must be different. For example, for N = 5, Mirko could have chosen the following set of pairs: {{1, 2}, {3, 4}, {2, 5}, {3, 5}}.</p>

<p>Slavko&rsquo;s turn is second and his goal is to find a partition for Mirko&rsquo;s set of pairs. Mirko&rsquo;s set of pairs has a partition if an integer x from the set {2, 3, ..., N} exists such that, for each pair {a, b}, one of the following holds:</p>

<ul>
	<li>a, b &lt; x</li>
	<li>a, b &ge; x</li>
</ul>

<p>For example, a set of pairs {{1, 2}, {3, 4}} has a partition x = 3. If a partition exists, Slavko will surely find it.</p>

<p>Mirko wins if Slavko can&rsquo;t find a partition for his set. Determine how many different sets of pairs exists that Mirko can initially choose and be sure of his victory. Given the fact that the total number of sets can be very large, output the number modulo 1 000 000 000.</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 20).</p>

### 출력

<p>The first and only line of output must contain the required number.</p>

### 힌트

<p>Clarification of the first example: The only set of pairs that meets the given requirements is {{1, 2}}.</p>

<p>Clarification of the second example: An example of a set that meets the given requirements is {{1, 3}, {1, 2}}</p>