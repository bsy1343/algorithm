# [Gold V] Double Smoothly Undulating Numbers - 27098

[문제 링크](https://www.acmicpc.net/problem/27098)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 97, 정답: 15, 맞힌 사람: 14, 정답 비율: 17.500%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Smoothly undulating numbers alternate between a pair of digits (e.g., 1212121).  Double smoothly undulating numbers alternate between a pair of digits in one number base and a pair (potentially different) of digits in some other number base.  Consider the number 191919 in base 10.  This number is 121212 when represented in base 11.  So, 191919 (in base 10) is a double smoothly undulating number.</p>

<p>Similarly, there are triple undulating numbers (which are smoothly undulating in three bases) and even quadruple smoothly undulating numbers,  like 300 (base 10), which is:</p>

<ul>
	<li>606 (base 7)</li>
	<li>454 (base 8)</li>
	<li>363 (base 9)</li>
	<li>1A1 (base 13)</li>
</ul>

<p>Your task will be to find double, triple, and quadruple smoothly undulating numbers.</p>

### 입력

<p>A single line with five integers:</p>

<ul>
	<li>The lowest base to examine (2..32)</li>
	<li>The highest base to examine (2..32)</li>
	<li>The lowest number in the range of numbers to search (1..10000000)</li>
	<li>The highest number in the range of numbers to search (1..10000000)</li>
	<li>The number 2, 3, or 4 for double, triple, or quadruple undulating numbers, respectively</li>
</ul>

### 출력

<p>A sort of list of numbers in base 10 that meet the input criteria.</p>