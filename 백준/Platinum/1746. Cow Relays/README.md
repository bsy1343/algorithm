# [Platinum III] Cow Relays - 1746

[문제 링크](https://www.acmicpc.net/problem/1746)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 156, 정답: 74, 맞힌 사람: 50, 정답 비율: 48.077%

### 분류

수학, 다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱

### 문제 설명

<p>For their physical fitness program, N (2 &lt;= N &lt;= 1,000,000) cows have decided to run a relay race using the T (2 &lt;= T &lt;= 100) cow trails throughout the pasture.</p>

<p>Each trail connects two different intersections (1 &lt;= I1_i &lt;= 1,000; 1 &lt;= I2_i &lt;= 1,000), each of which is the termination for at least two trails. The cows know the length_i of each trail (1 &lt;= length_i &lt;= 1,000), the two intersections the trail connects, and they know that no two intersections are directly connected by two different trails. The trails form a structure known mathematically as a graph.</p>

<p>To run the relay, the N cows position themselves at various intersections (some intersections might have more than one cow). They must position themselves properly so that they can hand off the baton cow-by-cow and end up at the proper finishing place.</p>

<p>Write a program to help position the cows. Find the shortest path that connects the starting intersection (S) and the ending intersection (E) and traverses exactly N cow trails.</p>

### 입력

<ul>
	<li>Line 1: Four space-separated integers: N, T, S, and E</li>
	<li>Lines 2..T+1: Line i+1 describes trail i with three space-separated integers: length_i, I1_i, and I2_i</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the shortest distance from intersection S to intersection E that traverses exactly N cow trails.</li>
</ul>