# [Gold IV] The County Fair - 14777

[문제 링크](https://www.acmicpc.net/problem/14777)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 98, 정답: 40, 맞힌 사람: 35, 정답 비율: 50.725%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Every year, Farmer John loves to attend the county fair. The fair has N booths (1 &lt;= N &lt;= 400), and each booth i is planning to give away a fabulous prize at a particular time P(i) (0 &lt;= P(i) &lt;= 1,000,000,000) during the day. Farmer John has heard about this and would like to collect as many fabulous prizes as possible to share with the cows. He would like to show up at a maximum possible number of booths at the exact times the prizes are going to be awarded.</p>

<p>Farmer John investigated and has determined the time T(i,j) (always in range 1..1,000,000) that it takes him to walk from booth i to booth j. The county fair&#39;s unusual layout means that perhaps FJ could travel from booth i to booth j by a faster route if he were to visit intermediate booths along the way. Being a poor map reader, Farmer John never considers taking such routes -- he will only walk from booth i to booth j in the event that he can actually collect a fabulous prize at booth j, and he never visits intermediate booths along the way. Furthermore, T(i,j) might not have the same value as T(j,i) owing to FJ&#39;s slow walking up hills.</p>

<p>Farmer John starts at booth #1 at time 0. Help him collect as many fabulous prizes as possible.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N.</li>
	<li>Lines 2..1+N: Line i+1 contains a single integer, P(i).</li>
	<li>Lines 2+N..1+N+N^2: These N^2 lines each contain a single integer T(i,j) for each pair (i,j) of booths. The first N of these lines respectively contain T(1,1), T(1,2), ..., T(1,N). The next N lines contain T(2,1), T(2,2), ..., T(2,N), and so on. Each T(i,j) value is in the range 1...1,000,000 except for the diagonals T(1,1), T(2,2), ..., T(N,N), which have the value zero.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer, containing the maximum number of prizes Farmer John can acquire.</li>
</ul>