# [Gold IV] Out of Hay - 27009

[문제 링크](https://www.acmicpc.net/problem/27009)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 152, 정답: 110, 맞힌 사람: 103, 정답 비율: 77.444%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>The cows have run out of hay, a horrible event that must be remedied immediately. Bessie intends to visit the other farms to survey their hay situation. There are N (2 &le; N &le; 2,000) farms (numbered 1..N); Bessie starts at Farm 1. She&#39;ll traverse some or all of the M (1 &le; M &le; 10,000) two-way roads whose length does not exceed 1,000,000,000 that connect the farms. Some farms may be multiply connected with different length roads. All farms are connected one way or another to Farm 1.</p>

<p>Bessie is trying to decide how large a waterskin she will need. She knows that she needs one ounce of water for each unit of length of a road. Since she can get more water at each farm, she&#39;s only concerned about the length of the longest road. Of course, she plans her route between farms such that she minimizes the amount of water she must carry.</p>

<p>Help Bessie know the largest amount of water she will ever have to carry: what is the length of longest road she&#39;ll have to travel between any two farms, presuming she chooses routes that minimize that number? This means, of course, that she might backtrack over a road in order to minimize the length of the longest road she&#39;ll have to traverse.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and M.</li>
	<li>Lines 2..1+M: Line i+1 contains three space-separated integers, A_i, B_i, and L_i, describing a road from A_i to B_i of length L_i.</li>
</ul>

### 출력

<ul>
	<li>Line 1: A single integer that is the length of the longest road required to be traversed.</li>
</ul>

### 힌트

<p>In order to reach farm 2, Bessie travels along a road of length 23. To reach farm 3, Bessie travels along a road of length 43. With capacity 43, she can travel along these roads provided that she refills her tank to maximum capacity before she starts down a road.</p>