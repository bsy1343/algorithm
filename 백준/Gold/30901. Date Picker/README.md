# [Gold V] Date Picker - 30901

[문제 링크](https://www.acmicpc.net/problem/30901)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 81, 맞힌 사람: 73, 정답 비율: 91.250%

### 분류

수학, 그리디 알고리즘, 브루트포스 알고리즘, 정렬, 확률론

### 문제 설명

<p>The NWERC is coming up and your agenda is filling up with meetings. One of your teammates wants to plan a meeting, and asks for your input. However, instead of asking you for your exact agenda, you have to fill out two separate polls: one for indicating which days you are available, and one for the hours!</p>

<p>As a computer scientist, you plan your meetings only on whole hours and each meeting takes an integer number of hours. Therefore, your agenda can be modelled as a matrix of $7$ rows (days), and $24$ columns (hours). Each cell in this matrix is either &#39;<code>.</code>&#39; or &#39;<code>x</code>&#39;, meaning that hour of that day you are either free or have a meeting, respectively.</p>

<p>You have to pick at least $d$ days in the first poll and $h$ hours in the second poll, and we assume the meeting will take place on any of your picked hour/day combinations with equal probability. What is the probability that you can attend the meeting if you fill in the polls optimally?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>$7$ lines with $24$ characters, each character being either &#39;<code>.</code>&#39; or &#39;<code>x</code>&#39;, with &#39;<code>.</code>&#39; indicating the time slots you are available.</li>
	<li>One line with two integers $d$ and $h$ ($1 \leq d \leq 7$, $1 \leq h \leq 24$), the minimum number of days and hours you have to fill in.</li>
</ul>

### 출력

<p>Output the probability that you are available at the chosen meeting time.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>