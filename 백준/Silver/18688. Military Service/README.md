# [Silver IV] Military Service - 18688

[문제 링크](https://www.acmicpc.net/problem/18688)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 101, 정답: 57, 맞힌 사람: 48, 정답 비율: 58.537%

### 분류

수학, 애드 혹, 비둘기집 원리

### 문제 설명

<p>You have just started your military service with the border guards. Since you are a Computer Science graduate, they asked you to implement a schedule for the soldiers. Initially no soldier is on duty and you need the schedule to satisfy 2 requirements:</p>

<ul>
	<li>There are N soldiers, each soldier can be on duty for at most K continuous months and then he must take one month of vacation.</li>
	<li>The schedule needs to make sure that the guaranteed minimum number of soldiers on duty at any given time is maximized.</li>
</ul>

<p>Given N and K, the system will calculate the maximum guaranteed number of soldiers to be on duty at any given time.</p>

### 입력

<p>Your program will be tested on one or more test cases. The first line of the input will be a single integer T, the number of test cases (1 &le; T &le; 100).</p>

<p>Each test case consists of a line containing 2 space separated integers:</p>

<ul>
	<li>N: The number of soldiers (0 &le; N &le; 10, 000, 000)</li>
	<li>K: The number of continuous months a soldier can be on duty before they have to take a month of vacation (0 &le; K &le; 10, 000, 000).</li>
</ul>

### 출력

<p>For each test case, print a single line containing the maximum guaranteed number of soldiers on duty at any given time.</p>