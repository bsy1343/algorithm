# [Gold IV] Buying Hay - 6066

[문제 링크](https://www.acmicpc.net/problem/6066)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 359, 정답: 172, 맞힌 사람: 132, 정답 비율: 48.352%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Farmer John is running out of supplies and needs to purchase H (1 &lt;= H &lt;= 50,000) pounds of hay for his cows.</p>

<p>He knows N (1 &lt;= N &lt;= 100) hay suppliers conveniently numbered 1..N. Supplier i sells packages that contain P_i (1 &lt;= P_i &lt;= 5,000) pounds of hay at a cost of C_i (1 &lt;= C_i &lt;= 5,000) dollars. Each supplier has an unlimited number of packages available, and the packages must be bought whole.</p>

<p>Help FJ by finding the minimum cost necessary to purchase at least H pounds of hay.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and H</li>
	<li>Lines 2..N+1: Line i+1 contains two space-separated integers: P_i and C_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the minimum cost FJ needs to pay to obtain at least H pounds of hay.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>FJ can buy three packages from the second supplier for a total cost of 9.</p>

<p>&nbsp;</p>