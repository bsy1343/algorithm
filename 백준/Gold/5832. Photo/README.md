# [Gold IV] Photo - 5832

[문제 링크](https://www.acmicpc.net/problem/5832)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 173, 정답: 91, 맞힌 사람: 80, 정답 비율: 50.955%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>FJ wants to take pictures of his N cows (2 &lt;= N &lt;= 1,000,000,000), which are standing in a line and conveniently numbered 1..N. Each photograph can capture a consecutive range of cows from the lineup, and FJ wants to make sure that each cow appears in at least one photo.</p>

<p>Unfortunately, there are K unfriendly pairs of cows (1 &lt;= K &lt;= 1000) that each refuse to be in the same photograph. Given the locations of these unfriendly pairs, please determine the minimum number of photos FJ needs to take.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and K.</li>
	<li>Lines 2..K+1: Line i+1 contains two integers, A_i and B_i, stating that the cows in positions A_i and B_i are unfriendly and therefore cannot be in the same photograph.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer, specifying the minimum number of photos FJ needs to take.</li>
</ul>

### 힌트

<h4>Output Details</h4>

<p>FJ can take 3 photos:</p>

<ul>
	<li>One ranging from 1 to 2.</li>
	<li>One ranging from 3 to 5.</li>
	<li>One ranging from 6 to 7.</li>
</ul>