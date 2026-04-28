# [Silver IV] Bookshelf 2 - 6148

[문제 링크](https://www.acmicpc.net/problem/6148)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 874, 정답: 408, 맞힌 사람: 343, 정답 비율: 49.211%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 깊이 우선 탐색, 백트래킹

### 문제 설명

<p>Farmer John recently bought another bookshelf for the cow library, but the shelf is getting filled up quite quickly, and now the only available space is at the top.</p>

<p>FJ has N cows (1 &lt;= N &lt;= 20) each with some height of H_i (1 &lt;= H_i &lt;= 1,000,000 - these are very tall cows). The bookshelf has a height of B (1 &lt;= B &lt;= S, where S is the sum of the heights of all cows).</p>

<p>To reach the top of the bookshelf, one or more of the cows can stand on top of each other in a stack, so that their total height is the sum of each of their individual heights. This total height must be no less than the height of the bookshelf in order for the cows to reach the top.</p>

<p>Since a taller stack of cows than necessary can be dangerous, your job is to find the set of cows that produces a stack of the smallest height possible such that the stack can reach the bookshelf. Your program should print the minimal &#39;excess&#39; height between the optimal stack of cows and the bookshelf.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and B</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: H_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the (non-negative) difference between the total height of the optimal set of cows and the height of the shelf.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Here we use cows 1, 3, 4, and 5, for a total height of 3 + 3 + 5 + 6 = 17. It is not possible to obtain a total height of 16, so the answer is 1.</p>

<p>&nbsp;</p>