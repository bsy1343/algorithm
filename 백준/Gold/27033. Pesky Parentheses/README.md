# [Gold IV] Pesky Parentheses - 27033

[문제 링크](https://www.acmicpc.net/problem/27033)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 11, 맞힌 사람: 9, 정답 비율: 39.130%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 백트래킹, 재귀

### 문제 설명

<p>The cows just learned to add and subtract.  They&#39;ve written down an expression containing N terms (1 &le; N &le; 10) such as the following:</p>

<p style="text-align: center;">1  +  4  -  2  -  1  +  10   -  6</p>

<p>Bessie (the smart cow) realizes that this expression can evaluate to different numbers depending on how it is parenthesized.  Help her determine the maximum possible number to which it can evaluate.</p>

### 입력

<ul>
	<li>Line 1: The single integer N</li>
	<li>Lines 2..1+N: Each line contains an integer between -100 and 100 (inclusive) and corresponds to one term in the expression.  A positive number K corresponds to + K in the expression and a negative number -K corresponds to - K in the expression.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The maximum value to which the expression can evaluate, if properly  parenthesized.</li>
</ul>

### 힌트

<p>1 + 4 - (2 - (1 + 10) - 6) = 20</p>