# [Gold IV] The Number of N-k-special Sets - 8095

[문제 링크](https://www.acmicpc.net/problem/8095)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 132, 정답: 53, 맞힌 사람: 35, 정답 비율: 41.176%

### 분류

다이나믹 프로그래밍, 배낭 문제, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>We say that a set X&nbsp;of natural numbers is n-k-special if:</p>

<ul>
	<li>for every x&nbsp;&isin; X&nbsp;we have 1 &le; x &le; n,</li>
	<li>the sum of all integers from X&nbsp;is greater than k,</li>
	<li>X does not contain a pair of consecutive natural numbers.</li>
</ul>

<p>Write a program that:</p>

<ul>
	<li>reads two natural numbers n&nbsp;and k&nbsp;from the standard input,</li>
	<li>computes the number of n-k-special sets,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of the standard input there are two natural numbers n&nbsp;and k&nbsp;separated by a single space, 1 &le; n &le; 100, 0 &le; k &le; 400.</p>

### 출력

<p>In the first line of the standard output there should be written one non-negative integer, which equals the number of n-k-special sets for the given n&nbsp;and k.</p>