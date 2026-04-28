# [Silver I] Travel Plan (Small) - 12549

[문제 링크](https://www.acmicpc.net/problem/12549)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 22, 맞힌 사람: 18, 정답 비율: 54.545%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>In a yet-to-be-announced and rechecked discovery by Antarctic astronomers, it is written that there are&nbsp;<strong>N</strong>&nbsp;inhabited planets in space, all lying along the same straight line, with the&nbsp;<strong>i</strong>-th planet lying at coordinate&nbsp;<strong>X</strong><sub><strong>i</strong></sub>&nbsp;along the line (<strong>i</strong>&nbsp;= 1, 2, ...,&nbsp;<strong>N</strong>). Earth is the first planet, lying at coordinate zero, so&nbsp;<strong>X</strong><sub>1</sub>&nbsp;will always be equal to 0.</p>

<p>Being very excited about this fact, you start planning a trip to visit all the planets. Since unknown planets can be dangerous, you want to visit each planet exactly once before returning to Earth. You have&nbsp;<strong>F</strong>&nbsp;units of fuel, and you want to spend as much of it on this trip as possible so that your final landing on Earth is safer. Your spaceship is pretty basic and can only fly along a straight line from any planet&nbsp;<strong>i</strong>&nbsp;to any other planet&nbsp;<strong>j</strong>, consuming |<strong>X</strong><sub><strong>i</strong></sub>-<strong>X</strong><sub><strong>j</strong></sub>| units of fuel along the way. It can&#39;t turn without landing.</p>

<p>So you need to create a travel plan that requires at most&nbsp;<strong>F</strong>&nbsp;units of fuel, starts from Earth, visits each of the other planets exactly once, and then returns to Earth. If there are several such plans, you should find the one that consumes most fuel. Output the amount of fuel consumed.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case description starts with a line containing the number of planets&nbsp;<strong>N</strong>. The next line contains&nbsp;<strong>N</strong>&nbsp;numbers&nbsp;<strong>X</strong><sub><strong>i</strong></sub>, the coordinates of the planets. The next line contains the amount of fuel&nbsp;<strong>F</strong>&nbsp;that you have.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>F</strong>&nbsp;&le; 10<sup>17</sup>.</li>
	<li>-10<sup>15</sup>&nbsp;&le;&nbsp;<strong>X</strong><sub>i</sub>&nbsp;&le; 10<sup>15</sup>.</li>
	<li><strong>X</strong><sub>1</sub>=0.</li>
	<li>All&nbsp;<strong>X</strong><sub>i</sub>&nbsp;are different.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
</ul>

### 출력

<p>For each test case, output one line containing either &quot;Case #x: NO SOLUTION&quot;, when there&#39;s no such travel plan, or &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the maximum amount of fuel consumed.</p>