# [Platinum V] Lights - 5998

[문제 링크](https://www.acmicpc.net/problem/5998)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 183, 정답: 59, 맞힌 사람: 43, 정답 비율: 37.391%

### 분류

자료 구조, 집합과 맵, 비트마스킹, 중간에서 만나기

### 문제 설명

<p>Bessie and the cows were playing games in the barn, but the power was reset and the lights were all turned off. Help the cows get all the lights back on so they can resume their games.</p>

<p>The N (1 &lt;= N &lt;= 35) lights conveniently numbered 1..N and their switches are arranged in a complex network with M (1 &lt;= M &lt;= 595) clever connection between pairs of lights (see below).</p>

<p>Each light has a switch that, when toggled, causes that light -- and all of the lights that are connected to it -- to change their states (from on to off, or off to on).</p>

<p>Find the minimum number of switches that need to be toggled in order to turn all the lights back on.</p>

<p>It&#39;s guaranteed that there is at least one way to toggle the switches so all lights are back on.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M.</li>
	<li>Lines 2..M+1: Each line contains two space-separated integers representing two lights that are connected. No pair will be repeated.</li>
</ul>

<p>&nbsp;</p>

### 출력

<p>Line 1: A single integer representing the minimum number of switches that need to be flipped in order to turn on all the lights.</p>

<p>&nbsp;</p>

### 힌트

<p>There are 5 lights. Lights 1, 4, and 5 are each connected to both lights 2 and 3.</p>

<p>Toggle the switches on lights 1, 4, and 5.</p>