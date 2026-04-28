# [Gold IV] Stall Reservations - 26982

[문제 링크](https://www.acmicpc.net/problem/26982)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 92, 정답: 42, 맞힌 사람: 39, 정답 비율: 50.649%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 우선순위 큐

### 문제 설명

<p>Oh those picky N (1 &le; N &le; 50,000) cows! They are so picky that each one will only be milked over some precise time interval A..B (1 &le; A &le; B &le; 1,000,000), which includes both times A and B. Obviously, FJ must create a reservation system to determine which stall each cow can be assigned for her milking time. Of course, no cow will share such a private moment with other cows.</p>

<p>Help FJ by determining:</p>

<ul>
	<li>The minimum number of stalls required in the barn so that each cow can have her private milking period</li>
	<li>An assignment of cows to these stalls over time</li>
</ul>

<p>Many answers are correct for each test dataset; a program will grade your answer.</p>

### 입력

<ul>
	<li>Line 1: A single integer, N</li>
	<li>Lines 2..N+1: Line i+1 describes cow i&#39;s milking interval with two space-separated integers.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The minimum number of stalls the barn must have.</li>
	<li>Lines 2..N+1: Line i+1 describes the stall to which cow i will be assigned for her milking period.</li>
</ul>