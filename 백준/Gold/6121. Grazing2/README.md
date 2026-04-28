# [Gold IV] Grazing2 - 6121

[문제 링크](https://www.acmicpc.net/problem/6121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 16, 맞힌 사람: 14, 정답 비율: 58.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Farmer John has N (2 &lt;= N &lt;= 1,500) prize milk cows conveniently numbered 1..N. His newly-painted barn has S (N &lt;= S &lt;= 1,000,000) stalls (conveniently numbered 1..S) in a single long line; each stall is a unit distance from its neighboring stall(s).</p>

<p>The cows have made their way to the stalls for a rest; cow i is in stall P_i. Antisocial as they are, the cows get grumpy if they are situated in stalls very close to each other, so Farmer John wants to move the cows to be as spread out as possible.</p>

<p>FJ wants to make sure that the N - 1 distances between adjacent cows are as large as possible, and he would also like them to be similar to each other (i.e., close to equi-distant spacing).</p>

<p>In particular, FJ would like all distances between adjacent cows to be at most 1 different from (S - 1) / (N - 1), where integer division is used. Moreover, he would like as many of these distances as possible to be exactly equal to (S - 1) / (N - 1) [integer division]. Thus, with four cows and eight stalls, one can place the cows at positions 1, 3, 5, 8 or 1, 3, 6, 8 but not at 1, 2, 4, 7 or 1, 2, 4, 8.</p>

<p>Help FJ spread the cows as efficiently as possible by calculating and reporting the minimum total distance that the cows have to move in order to achieve proper spacing. Ignore the distance it takes for a cow to enter or exit a stall.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and S</li>
	<li>Lines 2..N+1: Line i+1 contains the single integer: P_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer: the minimum total distance the cows have to travel. This number is guaranteed to be under 1,000,000,000 (thus fitting easily into a signed 32-bit integer).</li>
</ul>

<p>&nbsp;</p>

### 힌트

<pre>
               1   2   3   4   5   6   7   8   9  10
Cow Locs     | A | B | C | . | . | . | . | D | E | . |</pre>

<p><br />
Cows move from stall 2 to 3, 3 to 5, and 9 to 10. The total distance moved is 1 + 2 + 1 = 4. The final positions of the cows are in stalls 1, 3, 5, 8, and 10.</p>

<pre>
                 1   2   3   4   5   6   7   8   9  10 
Init Stall     | A | B | C | . | . | . | . | D | E | . |
Final Stall    | A | . | B | . | C | . | . | D | . | E |
Distance moved | 0 | . | 1 | . | 2 | . | . | 0 | . | 1 | </pre>