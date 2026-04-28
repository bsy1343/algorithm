# [Platinum II] A.I. War (Large) - 12490

[문제 링크](https://www.acmicpc.net/problem/12490)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 17, 맞힌 사람: 12, 정답 비율: 35.294%

### 분류

다이나믹 프로그래밍, 자료 구조, 그래프 이론, 그래프 탐색, 집합과 맵, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>A.I. War is a real-time strategy game developed by Arcen Games. This problem was inspired by the game, but does not assume you have played it.</p>

<h3>Problem</h3>

<p>You&#39;re facing an artificial intelligence in a deadly war for the future of the galaxy. In order to defeat the A.I., you will need to threaten its&nbsp;<em>home planet</em>. Some planets are connected to each other by wormholes; any planet may be connected to any number of other planets using the wormholes.</p>

<p>You begin by owning only your home planet. Each turn, you may conquer any planet you&nbsp;<em>threaten</em>. You threaten a planet if you don&#39;t own it, and it is connected by a wormhole to any of the planets you own. Once you have conquered a planet, you own it. As soon as you threaten the A.I.&#39;s home planet, you may not conquer any more planets.</p>

<p>While attending the most important day in tactical school, you discovered two things about the A.I.:</p>

<ul>
	<li>For each planet you conquer, the A.I. will become more powerful, because it will see you as a threat and produce more ships to defend itself.</li>
	<li>The A.I. will defend every planet you&#39;re currently threatening.</li>
</ul>

<p>You have combined those two facts to create a strategy:</p>

<ol>
	<li>You will conquer planets until you threaten the A.I.&#39;s home base.</li>
	<li>If there are multiple ways of completing step 1, do it while conquering the&nbsp;<strong>smallest</strong>possible number of planets.</li>
	<li>If there are multiple ways of completing step 2, do it so that at the end you will threaten the&nbsp;<strong>largest</strong>&nbsp;possible number of planets.</li>
</ol>

<p>Given the planets and the wormholes, how many planets will you conquer and threaten on your way to the A.I.&#39;s home base if you follow the strategy described above?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case starts with a single line containing two space-separated integers:&nbsp;<strong>P</strong>, the number of planets, and&nbsp;<strong>W</strong>, the number of wormholes. Your home planet is planet 0, and the A.I.&#39;s home planet is planet 1.</p>

<p>The second line of each test case will contain&nbsp;<strong>W</strong>&nbsp;space-separated pairs of comma-separated integers&nbsp;<strong>x</strong><sub>i</sub>,<strong>y</strong><sub>i</sub>. Each of these indicates that there is a two-way wormhole connecting planets&nbsp;<strong>x</strong><sub>i</sub>&nbsp;and&nbsp;<strong>y</strong><sub>i</sub>.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>0 &le;&nbsp;<strong>x</strong><sub>i</sub>&nbsp;&lt;&nbsp;<strong>y</strong><sub>i</sub>&nbsp;&lt;&nbsp;<strong>P</strong>.</li>
	<li>Each wormhole is unique: If i &ne; j, then (<strong>x</strong><sub>i</sub>,&nbsp;<strong>y</strong><sub>i</sub>) &ne; (<strong>x</strong><sub>j</sub>,&nbsp;<strong>y</strong><sub>j</sub>).</li>
	<li>There will be at least one way to reach the A.I.&#39;s home planet from your home planet using a series of wormholes.</li>
	<li>2 &le;&nbsp;<strong>P</strong>&nbsp;&le; 400.</li>
	<li>1 &le;&nbsp;<strong>W</strong>&nbsp;&le; 2000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: c t&quot;, where x is the case number (starting from 1), c is the number of planets you conquer if you follow the above strategy, and t is the number of planets you threaten at the end (including the A.I.&#39;s home planet).</p>

### 힌트

<p>In the first case, you don&#39;t have to conquer anything, and you&#39;re already threatening the A.I.&#39;s home planet.</p>

<p>In the third case, you can threaten the A.I.&#39;s home planet after conquering only one planet. You end up threatening two planets, and there&#39;s an extra planet that isn&#39;t connected to anything.</p>

<p>In the fourth case, you can threaten the A.I.&#39;s home planet by conquering planets 4 and 5. You end up threatening planets 6, 2, 3 and 1 (the A.I.&#39;s home planet).</p>

<h3>Note</h3>

<p>Arcen Games is the creator of A.I. War. Arcen Games does not endorse and has no involvement with Google Code Jam.</p>