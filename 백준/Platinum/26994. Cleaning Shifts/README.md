# [Platinum III] Cleaning Shifts - 26994

[문제 링크](https://www.acmicpc.net/problem/26994)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 13, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

자료 구조, 다이나믹 프로그래밍, 세그먼트 트리, 정렬

### 문제 설명

<p>Farmer John&#39;s cows, pampered since birth, have reached new heights of fastidiousness. They now require their barn to be immaculate. Farmer John, the most obliging of farmers, has no choice but hire some of the cows to clean the barn.</p>

<p>Farmer John has N (1 &le; N &le; 10,000) cows who are willing to do some cleaning. Because dust falls continuously, the cows require that the farm be continuously cleaned during the workday, which runs from second number M to second number E during the day (0 &le; M &le; E &le; 86,399). Note that the total number of seconds during which cleaning is to take place is E-M+1. During any given second M..E, at least one cow must be cleaning.</p>

<p>Each cow has submitted a job application indicating her willingness to work during a certain interval T1..T2 (where M &le; T1 &le; T2 &le; E) for a certain salary of S (where 0 &le; S &le; 500,000). Note that a cow who indicated the interval 10..20 would work for 11 seconds, not 10. Farmer John must either accept or reject each individual application; he may NOT ask a cow to work only a fraction of the time it indicated and receive a corresponding fraction of the salary.</p>

<p>Find a schedule in which every second of the workday is covered by at least one cow and which minimizes the total salary that goes to the cows.</p>

### 입력

<ul>
	<li>Line 1: Three space-separated integers: N, M, and E.</li>
	<li>Lines 2..N+1: Line i+1 describes cow i&#39;s schedule with three space-separated integers: T1, T2, and S.</li>
</ul>

### 출력

<ul>
	<li>Line 1: a single integer that is either the minimum total salary to get the barn cleaned or else -1 if it is impossible to clean the barn.</li>
</ul>