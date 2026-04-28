# [Platinum III] Kiddie Pool (Large) - 12142

[문제 링크](https://www.acmicpc.net/problem/12142)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 15, 맞힌 사람: 12, 정답 비율: 50.000%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>A kiddie pool is a big container in which you can put water, so that small children can play in it.</p>

<p>You have access to&nbsp;<strong>N</strong>&nbsp;different sources of water. The i<sup>th</sup>&nbsp;source of water produces water at rate&nbsp;<strong>R</strong><sub>i</sub>&nbsp;and at temperature&nbsp;<strong>C</strong><sub>i</sub>. Initially, all of the water sources are off. Each source of water can be switched on only once, and switched off only once; the act of switching a source on or off takes no additional time. Multiple sources can be on at the same time.</p>

<p>Your pool can hold an infinite amount of water, but you want to fill the pool to a volume of exactly&nbsp;<strong>V</strong>&nbsp;with a temperature of exactly&nbsp;<strong>X</strong>, as quickly as possible. If you turn sources on and off optimally (not every source necessarily has to be used), what&#39;s the minimum number of seconds it will take you to do this?</p>

<p>For the purposes of this problem, combining water that has volume&nbsp;<strong>V</strong><sub>0</sub>&nbsp;and temperature&nbsp;<strong>X</strong><sub>0</sub>&nbsp;with water that has volume&nbsp;<strong>V</strong><sub>1</sub>&nbsp;and temperature&nbsp;<strong>X</strong><sub>1</sub>&nbsp;will&nbsp;<strong>instantaneously</strong>&nbsp;create water with volume&nbsp;<strong>V</strong><sub>0</sub>+<strong>V</strong><sub>1</sub>&nbsp;and temperature (<strong>V</strong><sub>0</sub><strong>X</strong><sub>0</sub>&nbsp;+&nbsp;<strong>V</strong><sub>1</sub><strong>X</strong><sub>1</sub>)&nbsp;/&nbsp;(<strong>V</strong><sub>0</sub>&nbsp;+&nbsp;<strong>V</strong><sub>1</sub>). For example, combining 5L of water at 10 degrees with 10L of water at 40 degrees will result in 15L of water at 30 degrees. You should also assume that water does not heat or cool over time except as a result of being combined with other water.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. The first line of each test case contains three space-separated numbers: an integer&nbsp;<strong>N</strong>, and real numbers&nbsp;<strong>V</strong>&nbsp;and&nbsp;<strong>X</strong>&nbsp;as described above.</p>

<p>The next&nbsp;<strong>N</strong>&nbsp;lines each contain two space-separated real numbers,&nbsp;<strong>R</strong><sub>i</sub>&nbsp;and&nbsp;<strong>C</strong><sub>i</sub>, the rate of flow and temperature of the i<sup>th</sup>&nbsp;water source respectively. The volume is expressed in liters, rates of flow are expressed in liters per second, and temperatures are expressed in degrees Celsius.</p>

<p>All real numbers will be exactly specified to four decimal places.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>0.1 &le;&nbsp;<strong>X</strong>&nbsp;&le; 99.9.</li>
	<li>0.1 &le;&nbsp;<strong>C</strong><sub>i</sub>&nbsp;&le; 99.9.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li>0.0001 &le;&nbsp;<strong>V</strong>&nbsp;&le; 10000.0.</li>
	<li>0.0001 &le;&nbsp;<strong>R</strong><sub>i</sub>&nbsp;&le; 10000.0.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of seconds it takes to fill the kiddie pool to the right volume and temperature. If it is impossible to do so given the inputs, y should be the string&nbsp;<code>IMPOSSIBLE</code>.</p>

<p>y will be considered correct if it is within an absolute or relative error of 10<sup>-6</sup>&nbsp;of the correct answer.</p>

### 힌트

<p>Note that Case #6 is not within the limits for the Small dataset.<br />
<br />
In Case #1, the one available source happens to be the exact temperature we need. The optimal strategy is to immediately turn it on and let it run until we have 10 L. Since 0.2 L will come out every second, this takes 50 seconds.<br />
<br />
In Case #2, one optimal strategy is to turn on the first source and let it run for 207221.843687375 seconds, and then, about 0.092778156 seconds before the end, also turn on the second source.<br />
<br />
In Case #3, both available water sources are cooler than the target temperature, so there is no way to reach it.</p>