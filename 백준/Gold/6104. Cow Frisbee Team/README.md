# [Gold IV] Cow Frisbee Team - 6104

[문제 링크](https://www.acmicpc.net/problem/6104)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 115, 정답: 49, 맞힌 사람: 40, 정답 비율: 42.553%

### 분류

수학, 다이나믹 프로그래밍, 정수론

### 문제 설명

<p>After Farmer Don took up Frisbee, Farmer John wanted to join in the fun. He wants to form a Frisbee team from his N cows (1 &lt;= N &lt;= 2,000) conveniently numbered 1..N. The cows have been practicing flipping the discs around, and each cow i has a rating R_i (1 &lt;= R_i &lt;= 100,000) denoting her skill playing Frisbee. FJ can form a team by choosing one or more of his cows.</p>

<p>However, because FJ needs to be very selective when forming Frisbee teams, he has added an additional constraint. Since his favorite number is F (1 &lt;= F &lt;= 1,000), he will only accept a team if the sum of the ratings of each cow in the team is exactly divisible by F.</p>

<p>Help FJ find out how many different teams he can choose. Since this number can be very large, output the answer modulo 100,000,000.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and F</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: R_i</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer representing the number of teams FJ can choose, modulo 100,000,000.</li>
</ul>

### 힌트

<p>FJ can pair the 8 and either of the 2&#39;s (8 + 2 = 10), or he can use both 2&#39;s and the 1 (2 + 2 + 1 = 5).</p>