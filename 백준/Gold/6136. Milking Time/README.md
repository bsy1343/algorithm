# [Gold IV] Milking Time - 6136

[문제 링크](https://www.acmicpc.net/problem/6136)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 118, 정답: 65, 맞힌 사람: 54, 정답 비율: 55.102%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Bessie is such a hard-working cow. In fact, she is so focused on maximizing her productivity that she decides to schedule her next N (1 &lt;= N &lt;= 1,000,000) hours (conveniently labeled 0..N-1) so that she produces as much milk as possible.</p>

<p>Farmer John has a list of M (1 &lt;= M &lt;= 1,000) possibly overlapping intervals in which he is available for milking. Each interval i has a starting hour (0 &lt;= starting_hour_i &lt; N), an ending hour (starting_hour_i &lt; ending_hour_i &lt;= N), and a corresponding efficiency (1 &lt;= efficiency_i &lt;= 1,000,000) which indicates how many gallons of milk that he can get out of Bessie in that interval. Farmer John starts and stops milking at the beginning of the starting hour and ending hour, respectively. When being milked, Bessie must be milked through an entire interval.</p>

<p>Even Bessie has her limitations, though. After being milked during any interval, she must rest R (1 &lt;= R &lt;= N) hours before she can start milking again. Given Farmer Johns list of intervals, determine the maximum amount of milk that Bessie can produce in the N hours.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N, M, and R</li>
	<li>Lines 2..M+1: Line i+1 describes FJ&#39;s ith milking interval with three space-separated integers: starting_hour_i, ending_hour_i, and efficiency_i</li>
</ul>

### 출력

<ul>
	<li>Line 1: The maximum number of gallons of milk that Bessie can product in the N hours</li>
</ul>