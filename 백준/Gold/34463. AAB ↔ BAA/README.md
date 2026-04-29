# [Gold III] AAB ↔ BAA - 34463

[문제 링크](https://www.acmicpc.net/problem/34463)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 22, 정답: 14, 맞힌 사람: 13, 정답 비율: 76.471%

### 분류

그리디 알고리즘, 문자열, 불변량 찾기, 애드 혹, 홀짝성

### 문제 설명

<p>Busy Beaver is preparing for the MIT Mystery Hunt! He is playing a game on two strings $S_1$ and $S_2$, each consisting only of the letters <code>A</code> and <code>B</code>. He can perform the following operation any number of times (possibly zero) on $S_1$:</p>

<ul>
	<li>Replace any contiguous substring <code>AAB</code> with a contiguous substring <code>BAA</code>, or vice versa.</li>
	<li>Replace any contiguous substring <code>BBA</code> with a contiguous substring <code>ABB</code>, or vice versa.</li>
</ul>

<p>Find the minimum number of operations needed to transform $S_1$ into $S_2$, or report that this is impossible.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \le T \le 10^3$) --- the number of test cases.</p>

<p>The only line of each test case contains two space-separated strings $S_1$ and $S_2$ ($1\le |S_1| = |S_2|\le 10^5$) consisting of characters <code>A</code> and <code>B</code>.</p>

<p>The total length of all strings across all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, print the minimum number of operations you need to transform $S_1$ into $S_2$. If this is impossible, output $-1$.</p>

### 힌트

<p>In the first test case, we can perform two operations: <code><span style="color:#EA3323;">AAB</span>BB</code> $\to$ <code><span style="color:#0000f5;">BAA</span>BB</code> and then <code>BA<span style="color:#ea3323;">ABB</span></code> $\to$ <code>BA<span style="color:#0000f5;">BBA</span></code>.</p>