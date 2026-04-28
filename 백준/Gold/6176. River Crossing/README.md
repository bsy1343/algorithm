# [Gold IV] River Crossing - 6176

[문제 링크](https://www.acmicpc.net/problem/6176)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 115, 정답: 79, 맞힌 사람: 73, 정답 비율: 66.972%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Farmer John is herding his N cows (1 &lt;= N &lt;= 2,500) across the expanses of his farm when he finds himself blocked by a river. A single raft is available for transportation.</p>

<p>FJ knows that he must ride on the raft for all crossings and that that adding cows to the raft makes it traverse the river more slowly.</p>

<p>When FJ is on the raft alone, it can cross the river in M minutes (1 &lt;= M &lt;= 1000). &nbsp;When the i cows are added, it takes M_i minutes (1 &lt;= M_i &lt;= 1000) longer to cross the river than with i-1 cows (i.e., total M+M_1 minutes with one cow, M+M_1+M_2 with two, etc.). Determine the minimum time it takes for Farmer John to get all of the cows across the river (including time returning to get more cows).</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: M_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: The minimum time it takes for Farmer John to get all of the cows across the river.</li>
</ul>

### 힌트

<p>There are five cows. Farmer John takes 10 minutes to cross the river alone, 13 with one cow, 17 with two cows, 23 with three, 123 with four, and 124 with all five.</p>

<p>Farmer John can first cross with three cows (23 minutes), then return (10 minutes), and then cross with the last two (17 minutes). 23+10+17 = 50 minutes total.</p>