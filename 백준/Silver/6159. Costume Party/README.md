# [Silver V] Costume Party - 6159

[문제 링크](https://www.acmicpc.net/problem/6159)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 2425, 정답: 1390, 맞힌 사람: 1124, 정답 비율: 58.481%

### 분류

브루트포스 알고리즘, 정렬, 두 포인터

### 문제 설명

<p>It&#39;s Halloween! Farmer John is taking the cows to a costume party, but unfortunately he only has one costume. The costume fits precisely two cows with a length of S (1 &lt;= S &lt;= 1,000,000). FJ has N cows (2 &lt;= N &lt;= 20,000) conveniently numbered 1..N; cow i has length L_i (1 &lt;= L_i &lt;= 1,000,000). Two cows can fit into the costume if the sum of their lengths is no greater than the length of the costume. FJ wants to know how many pairs of two distinct cows will fit into the costume.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and S</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: L_i</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer representing the number of pairs of cows FJ can choose. Note that the order of the two cows does not matter.</li>
</ul>

### 힌트

<p>The four pairs are as follows: cow 1 and cow 3; cow 1 and cow 4; cow 2 and cow 4; and finally cow 3 and cow 4.</p>