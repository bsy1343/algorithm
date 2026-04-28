# [Gold III] 수들의 합 8 - 25332

[문제 링크](https://www.acmicpc.net/problem/25332)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 939, 정답: 459, 맞힌 사람: 375, 정답 비율: 51.300%

### 분류

자료 구조, 집합과 맵, 누적 합, 해시를 사용한 집합과 맵

### 문제 설명

<p>길이가 같은 정수 수열 $A = \{A_1, A_2, ..., A_N\}$와 $B = \{B_1, B_2, ..., B_N\}$가 주어진다.</p>

<p>$A_i + A_{i+1} + ... + A_j = B_i + B_{i+1} + ... + B_j$를 만족하는 양의 정수 $i, j ~(i \leq j)$쌍의 개수를 구해보자.</p>

### 입력

<p>첫 번째 줄에 양의 정수 $N$이 주어진다.</p>

<p>두 번째 줄에 $A$를 나타내는 $N$개의 양의 정수 $A_i$가 $A_1$부터 $A_N$까지 순서대로, 공백으로 구분되어 주어진다.</p>

<p>세 번째 줄에 $B$를 나타내는 $N$개의 양의 정수 $B_i$가 $B_1$부터 $B_N$까지 순서대로, 공백으로 구분되어 주어진다.</p>

### 출력

<p>$A_i + A_{i+1} + ... + A_j = B_i + B_{i+1} + ... + B_j$를 만족하는 양의 정수 $i, j ~(i \leq j)$쌍의 개수를 출력한다.</p>

### 제한

<ul>
	<li>$1 \leq N \leq 2\cdot 10^5$</li>
	<li>$\lvert A \rvert = \lvert B \rvert = N$</li>
	<li>$1 \leq A_i,B_i \leq 10^4$</li>
</ul>

### 힌트

<p>정답의 크기가 32비트 정수형 타입의 표현 범위를 초과할 수 있으므로 언어에 따라 적절한 정수형 데이터 타입을 이용해야 한다.</p>

<ul>
	<li>Java: <code>long</code>, <code>Long</code></li>
	<li>Kotlin: <code>Long</code></li>
	<li>Swift: <code>Int64</code></li>
	<li>C, C++: <code>long</code>, <code>long long</code></li>
</ul>