# [Gold III] Blink - 5831

[문제 링크](https://www.acmicpc.net/problem/5831)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 131, 정답: 59, 맞힌 사람: 54, 정답 비율: 44.628%

### 분류

비트마스킹

### 문제 설명

<p>Unhappy with the dim lighting in his barn, Farmer John has just installed a fancy new chandelier consisting of N (3 &lt;= N &lt;= 16) lights bulbs arranged in a circle.</p>

<p>The cows are fascinated by this new light fixture, and enjoy playing the following game: at time T, they toggle the state of each light bulb if its neighbor to the left was turned on at time T-1. They continue this game for B units of time (1 &lt;= B &lt;= 10^15). Note that B might be too large to fit into a standard 32-bit integer.</p>

<p>Given the initial states of the light bulbs, please determine their final states after B units of time have elapsed.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers, N and B.</li>
	<li>Lines 2..1+N: Line i+1 contains the initial state of bulb i, either 0 (off) or 1 (on).</li>
</ul>

### 출력

<ul>
	<li>Lines 1..N: Line i should contain the final state of bulb i, either 0 (off) or 1 (on).</li>
</ul>

### 힌트

<h4>Input Details</h4>

<p>There are five light bulbs. The first is initially on, and the others are off.</p>

<h4>Output Details</h4>

<p>The light bulb states are as follows:</p>

<ul>
	<li>Time T=0: 1 0 0 0 0 Time</li>
	<li>T=1: 1 1 0 0 0 Time</li>
	<li>T=2: 1 0 1 0 0 Time</li>
	<li>T=3: 1 1 1 1 0 Time</li>
	<li>T=4: 1 0 0 0 1 Time</li>
	<li>T=5: 0 1 0 0 1 Time</li>
	<li>T=6: 1 1 1 0 1</li>
</ul>