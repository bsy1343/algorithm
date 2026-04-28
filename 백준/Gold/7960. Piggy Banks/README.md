# [Gold III] Piggy Banks - 7960

[문제 링크](https://www.acmicpc.net/problem/7960)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 37, 정답: 23, 맞힌 사람: 22, 정답 비율: 62.857%

### 분류

자료 구조, 분리 집합

### 문제 설명

<p>Byteazar the Dragon has N piggy banks. Each piggy bank can either be opened with its corresponding key or smashed. Byteazar has put the keys in some of the piggy banks - he remembers which key has been placed in which piggy bank. Byteazar intends to buy a car and needs to gain access to all of the piggy banks. However, he wants to destroy as few of them as possible. Help Byteazar to determine how many piggy banks have to be smashed.</p>

<p>Write a programme which:</p>

<ul>
	<li>reads from the standard input the number of piggy banks and the deployment of their corresponding keys,</li>
	<li>finds the minimal number of piggy banks to be smashed in order to gain access to all of them,</li>
	<li>writes the outcome to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains a single integer N (1 &le; N &le; 1,000,000) - this is the number of piggy banks owned by the dragon. The piggy banks (as well as their corresponding keys) are numbered from 1 to N. Next, there are N lines: the (i+1)&rsquo;st line contains a single integer - the number of the piggy bank in which the i&rsquo;th key has been placed.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer - the minimal number of piggy banks to be smashed in order to gain access to all of the piggy banks.</p>

### 힌트

<p>In the foregoing example piggy banks 1 and 4 have to be smashed.</p>